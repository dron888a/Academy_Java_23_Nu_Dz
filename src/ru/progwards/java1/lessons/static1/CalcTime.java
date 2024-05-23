package ru.progwards.java1.lessons.static1;

class CalcTime {
    private static double distance;
    private static double speed;
    private static String cityFrom;
    private static String cityTo;

    public static void printTime() {
        System.out.println("Если ехать из " + cityFrom + " в " + cityTo + " со скоростью " +
                speed + " км/ч, то " + distance + " км проедем за " + (distance / speed) + " часов.");
    }
    public static void MoscowToPiter() {
        distance = 712;
        speed = 80;
        cityFrom = "Москва";
        cityTo = "Питер";
    }
    public static void LissabonToVladivostok() {
        distance = 13090;
        speed = 75;
        cityFrom = "Лиссабон";
        cityTo = "Владивосток";
    }
    public static void MurmanskToAlmata() {
        distance = 5413;
        speed = 60;
        cityFrom = "Мурманск";
        cityTo = "Алмата";
    }
    public static void printTimes() {
        MoscowToPiter();
        printTime();
        LissabonToVladivostok();
        printTime();
        MurmanskToAlmata();
        printTime();
    }
    public static void main(String[] args) {
        printTimes();
    }
}

class Goodies {
    private static String goodies = "вкусняшки";
    private static String child = "ребенок";
    public static void printPresent() {
        System.out.println(child + " дали " + goodies);
    }
    public static void masha() {
        child = "Маше";
    }
    public static void cookie() {
        goodies = "печеньку";
    }
    public static void setChild(String child) {
        Goodies.child = child;
    }
    public static void setGoodies(String goodies) {
        Goodies.goodies = goodies;
    }
    public static void printPresents() {
        masha();
        printPresent();
        setGoodies("леденец");
        printPresent();
        cookie();
        printPresent();
        setChild("Пете");
        printPresent();
    }
    public static void main(String[] args) {
        printPresents();
    }
}

class Room {
    private static double length1 = 5;
    private static double width1 = 3;
    private static double length2 = length1+1.5;
    private static double width2 = width1*1.5;
    private static double square1 = square(length1, width1);
    private static double square2 = square(length2, width2);
    public static double square(double length, double width) {
        double s = length * width;
        return s;
    }
    public static void printRoom(String name, double square) {
        System.out.println("Площадь " + name + " составляет " + square + " м2");
    }
    public static void printFlat() {
        printRoom("кухни", square1);
        printRoom("гостинной", square2);
    }
    public static void main(String[] args) {
        printFlat();
    }
}
