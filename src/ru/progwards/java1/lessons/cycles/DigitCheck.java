package ru.progwards.java1.lessons.cycles;

import Test.CyclesGoldenFibo;
import Test.TriangleInfo;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit) {
        if (number == digit) {
            return true;
        }

        while (number != 0) {
            if (number % 10 == digit)
                return true;
            else
                number /= 10;
        }
                return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(12345, 5));
    }
}

class NumbersRange {
    public static long sumNumbers(int start, int finish) {
        long sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static long sumOdd(int start, int finish) {
        long sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static long sumEvenIdx(int start, int finish) {
        long sum = 0;
        int index = 1;
        for (int i = start; i <= finish; i++) {
            if (index % 2 != 0) {
                sum += i;
            }
            index++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(1, 5));
        System.out.println(sumOdd(12, 22));
        System.out.println(sumEvenIdx(1, 5));
    }
}

class GoldenFibo {

    static final double V1 = 1.61703;
    static final double V2 = 1.61903;

    public static int fiboNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int fib = 3;

        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        double ac = (double) a / c;
        double ab = (double) a / b;
        double ba = (double) b / a;

        return
                TriangleInfo.isIsoscelesTriangle(a, b, c) &&
                        (
                                ((a == b) && (V1 <= ac) && (V2 >= ac))
                                        ||    ((a == c) && (V1 <= ab) && (V2 >= ab))
                                        ||    ((c == b) && (V1 <= ba) && (V2 >= ba))
                        );
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(3));
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(10, 10, 10)); // true
        System.out.println(isGoldenTriangle(10, 10, 5)); // false
        System.out.println(isGoldenTriangle(10, 5, 10)); // false
        System.out.println(isGoldenTriangle(5,5,8)); // false
        System.out.println(CyclesGoldenFibo.isGoldenTriangle(4,4,4));

        int[] fibonacci = new int[15];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        System.out.println("Первые 15 чисел Фибоначчи:");
        System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");

        for (int i = 2; i < 15; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();

        // Шаг 2: Поиск Золотых треугольников среди треугольников с длинами сторон Фибоначчи
        System.out.println("Золотые треугольники:");
        for (int i = 0; i < fibonacci.length - 1; i++) {
            for (int j = i + 1; j < fibonacci.length; j++) {
                int base = fibonacci[i];
                int side = fibonacci[j];
                if (isGoldenTriangle(base, side)) {
                    System.out.println("Основание: " + base + ", Ребра: " + side);
                }
            }
        }
    }

    // Метод проверки, является ли треугольник Золотым треугольником
    public static boolean isGoldenTriangle(int base, int side) {
        double ratio = (double) side / base;
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return Math.abs(ratio - goldenRatio) < 0.1; // Допустимая погрешность
    }
}
