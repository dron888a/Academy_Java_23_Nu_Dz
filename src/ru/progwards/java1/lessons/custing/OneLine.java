package ru.progwards.java1.lessons.custing;

public class OneLine {
    public static String strValue(String value) {
        return  "Передана строка со значением \"" + value + "\"";
    }

    public static String intValue(String variable,  int value) {
        return "Значение " + variable + " равно " + value;
    }

    public static String square(int n) {
        return "Число " + n + " в квадрате равно " + n*n;
    }

    public static String sum(int n, int m) {
        return "Сумма " + n + " и " + m + " равна " + (n + m); // Последний вопрос, это сумма n и m
    }

    public static void main(String[] args) {
        System.out.println(strValue("Стараемся")); // Вернёт строку со значением "стараемся"
        System.out.println(intValue("radius", 123));
        System.out.println(square(8));
        System.out.println(sum(8,18));
    }
}

class AccuracyDoubleFloat {
    public static <f> double calculateAccuracy() {
        double d = 1.0 / 3.0;
        float f = (float) d;
        return d - f;
    }

    public static void main(String[] args) {
        System.out.println(calculateAccuracy());
    }
}

class Figures {
    static float pi = 3.14f; // Сразу присваиваем переменной pi значение 3.14 типа float . Обязательно static
                            // для видимости

    public static double circle(double r) {
        return pi * (r * r); // Площадь круга с радиусом R
    }

    public static double square(double n) {
        return n * n; // Площадь квадрата
    }

    public static Double triangle(double k) {
        double p = (k * 3) / 2; // По формуле Герона рассчитывается полупериметр p
        double S = Math.sqrt(p * (p-k) * (p-k) * (p-k)); //По формуле Герона рассчитывается площадь S
        return S; // Площадь треугольника
    }

    public static double squareVsTraiange(double p) {
        return square(p) / triangle(p); // вычисляет отношение площади квадрата к площади треугольника
    }

    public static double squareVsCircle(double p) {
        return square(p) / circle(p); // Вычисляет отношение площади квадрата к площади круга
    }

    public static double triangleVsCircle(double p) {
        return triangle(p) / circle(p); // Вычисляет отношение площади треугольника к площади круга
    }

    public static void main(String[] args) {
        System.out.println(circle(8.0));
        System.out.println(square(7.0));
        System.out.println(triangle(4.0));
        System.out.println(squareVsTraiange(5.0));
        System.out.println(squareVsCircle(3.0));
        System.out.println(triangleVsCircle(9.0));
    }
}