package ru.progwards.java1.lessons.basics;

class Distance3D {
    public static double distance(double x1, double y1,double z1, double x2, double y2, double z2) {
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) + (z2 - z1)*(z2 - z1));
    }
}

class ReverseDigits {
    public static int reverseDigits(int number) {
        int n1 = number / 100;
        int n2 = (number - n1 * 100) / 10;
        int n3 = number - n1 * 100 - n2 * 10;
        return n3 * 100 + n2 * 10 + n1;
    }
}

class Astronomy {
    static final double Pi = 3.14;

    public static Double sphereSquare(Double r) {
        return 4 * Pi * (r * r);
    }

    public static Double earthSquare() {
        double r = 6371.2;
        return sphereSquare(r); // исправил (S) на (r)
    }

    public static Double mercurySquare() {
        double r = 2439.7;
        return sphereSquare(r);
    }

    public static Double jupiterSquare() {
        double r = 71492;
        return sphereSquare(r);
    }

    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare();
    }

    public static Double earthVsJupiter() {
        return  earthSquare() / jupiterSquare();
    }

    public static void main(String[] args) {
        System.out.println(Distance3D.distance(2,4,7,6,8,9));
        System.out.println(ReverseDigits.reverseDigits(123));
        System.out.println(sphereSquare(5.3));
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }
}