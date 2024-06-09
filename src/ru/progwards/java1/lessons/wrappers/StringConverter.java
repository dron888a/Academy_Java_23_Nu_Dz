package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number) {
        return Byte.toString(number);
    }

    public static String fromShort(short number) {
        return Short.toString(number);
    }

    public static String fromInt(int number) {
        return Integer.toString(number);
    }

    public static String fromLong(long number) {
        return Long.toString(number);
    }

    public static String fromFloat(float number) {
        return Float.toString(number);
    }

    public static String fromDouble(double number) {
        return Double.toString(number);
    }

    public static void main(String[] args) {
        System.out.println(42);
        System.out.println(15);
        System.out.println(12);
        System.out.println(454545);
        System.out.println(5.0f);
        System.out.println(8.0);
    }
}

class NumMetrics {

    public static Integer sumDigits(Integer number) {
        Integer int1 = number / 100;
        Integer int2 = (number % 100) / 10;
        Integer int3 = number % 10;
        return int1 + int2 + int3;
    }

    public static Integer mulDigits(Integer number) {
        Integer int1 = number / 100;
        Integer int2 = (number % 100) / 10;
        Integer int3 = number % 10;
        return int1 * int2 * int3;
    }

    public static void main(String[] args) {
        System.out.println(NumMetrics.sumDigits(456));
        System.out.println(NumMetrics.mulDigits(456));
    }
}

class AccuracyDoubleFloat {

    public static Double volumeBallDouble(Double radius) {
        double Pi = 3.14;
        Double volumeDoubble = (4.0 / 3.0) * Pi * (radius * radius * radius); // Вычисление объема шара
        return volumeDoubble; // Возвращение объема
    }

    public static Float volumeBallFloat(Float radius) {
        float Pi = 3.14f;
        Float volumeFloat = (4.0f / 3.0f) * Pi * (float) (radius * radius * radius); // Вычисление объема шара
        return volumeFloat; // Возвращение объема
    }

    public static Double calculateAccuracy(Double radius) {
        Double volumeDouble = volumeBallDouble(radius);
        Float volumeFloat = volumeBallFloat(radius.floatValue());
        return volumeDouble - volumeFloat;
    }

    public static void main(String[] args) {
        Double radius = 6371.2;
        Double volumeD = volumeBallDouble(radius);
        Float volumeF = volumeBallFloat(radius.floatValue());
        Double accuracy = calculateAccuracy(radius);

        System.out.println("Объем шара с радиусом " + radius + " км (Double): " + volumeD + " куб. км");
        System.out.println("Объем шара с радиусом " + radius + " км (Float): " + volumeF + " куб. км");
        System.out.println("Разница между Double и Float: " + accuracy + " куб. км");
    }
}
