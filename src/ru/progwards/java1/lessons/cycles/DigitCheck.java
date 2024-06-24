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
