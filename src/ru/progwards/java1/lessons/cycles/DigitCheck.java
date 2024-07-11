package ru.progwards.java1.lessons.cycles;

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
        if (a == b) {
            // Проверка отношения сторон для треугольника с основаниями c и равными сторонами a
            double ratio = (double) a / c;
            return ratio >= 1.61703 && ratio <= 1.61903;
        } else if (a == c) {
            // Проверка отношения сторон для треугольника с основаниями b и равными сторонами a
            double ratio = (double) a / b;
            return ratio >= 1.61703 && ratio <= 1.61903;
        } else if (b == c) {
            // Проверка отношения сторон для треугольника с основаниями a и равными сторонами b
            double ratio = (double) b / a;
            return ratio >= 1.61703 && ratio <= 1.61903;
        }
        // Если треугольник не удовлетворяет условиям, возвращаем false
        return false;
    }

    public static void main(String[] args) {
        System.out.println(fiboNumber(3));
        System.out.println(fiboNumber(10));
        System.out.println(isGoldenTriangle(10, 10, 10));

        int[] fibonacci = new int[15];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        System.out.print(fibonacci[0] + " " + fibonacci[1] + " ");
        for (int i = 2; i < 15; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();

        // Поиск Золотых треугольников среди треугольников с длинами сторон - числами Фибоначчи
        for (int i = 0; i < fibonacci.length; i++) {
            for (int j = i; j < fibonacci.length; j++) {
                for (int k = j; k < fibonacci.length; k++) {
                    if (fibonacci[i] <= 100 && fibonacci[j] <= 100 && fibonacci[k] <= 100) {
                        if (isGoldenTriangle(fibonacci[i], fibonacci[j], fibonacci[k])) {
                            System.out.println("Золотой треугольник: основания = " + fibonacci[i] +
                                    ", ребра = " + fibonacci[j] + ", " + fibonacci[k]);
                        }
                    }
                }
            }
        }
    }
}
