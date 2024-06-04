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
}

class NumMetrics {

    public static Integer sumDigits(Integer number) {
        Integer int1 = number / 100;
        Integer int2 = (number % 100) /10;
        Integer int3 = number % 10;
        return int1 + int2 + int3;
    }

    public static Integer mulDigits(Integer number) {
        Integer int1 = number / 100;
        Integer int2 = (number % 100) /10;
        Integer int3 = number % 10;
        return int1 * int2 * int3;
    }

public static class AccuracyDoubleFloat {

    public static Double volumeBallDouble(Double radius) {
        float pi = 3.14f;
        return (4.0 / 3.0) * pi * (radius * radius * radius);
    }

    public static Float volumeBallFloat(Float radius) {
        float pi = 3.14f;
        return (4.0f / 3.0f) * pi * (radius * radius * radius);
    }

    public static Double calculateAccuracy(Double radius) {
        Double volumeDouble = volumeBallDouble(radius);
        Float radiusFloat = radius.floatValue();
        Float volumeFloat = volumeBallFloat(radiusFloat);

        return volumeDouble - volumeFloat;
    }
}

    public static void main(String[] args) {

        System.out.println(StringConverter.fromByte((byte) 42));
        System.out.println(StringConverter.fromShort((short) 15));
        System.out.println(StringConverter.fromInt(12));
        System.out.println(StringConverter.fromLong(454545));
        System.out.println(StringConverter.fromFloat(5.0f));
        System.out.println(StringConverter.fromDouble(8.0));
        System.out.println(NumMetrics.sumDigits(456));
        System.out.println(NumMetrics.mulDigits(456));
        System.out.println(AccuracyDoubleFloat.volumeBallDouble(6371.2));
        System.out.println(AccuracyDoubleFloat.volumeBallFloat(6371.2f));
        System.out.println(AccuracyDoubleFloat.calculateAccuracy(6371.2));
    }
}
