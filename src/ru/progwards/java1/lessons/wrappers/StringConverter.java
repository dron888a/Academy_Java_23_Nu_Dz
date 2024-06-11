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
        System.out.println(fromByte((byte) 10));
        System.out.println(fromShort((short) 12));
        System.out.println(fromInt(7));
        System.out.println(fromLong(454545L));
        System.out.println(fromFloat(5.0f));
        System.out.println(fromDouble(5.0));
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

    static final double Pi = 3.14; // Объявление константы свойствами классапше git

    public static Double volumeBallDouble(Double radius) {
        return (4.0 / 3.0) * Pi * (radius * radius * radius); // Возвращение объема
    }

    public static Float volumeBallFloat(Float radius) {
        return (4.0f / 3.0f) * (float) Pi * (radius * radius * radius); // Возвращение объема
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
