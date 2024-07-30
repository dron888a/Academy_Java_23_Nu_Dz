package ru.progwards.java1.lessons.classes1;

public class Count {

    private int count;

    public Count() {
        count = 0;
    }

    public Count(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void inc() {
        count++;
    }

    public boolean dec() {
        count--;
        return count <=0;
    }

    public static void main(String[] args) {
        Count count = new Count(10);

        while (true) {
            if (count.dec()) {
                System.out.println("count равен 0");
                break;
            }
        }
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsBetween(Time time) {
        int thisTimeInSeconds  = this.toSeconds();
        int otherTimeInSeconds  = time.toSeconds();
        return Math.abs(thisTimeInSeconds - otherTimeInSeconds);
    }

    public static void main(String[] args) {
        Time time1 = new Time(1, 30, 5);
        Time time2 = new Time(1, 35, 10);
        System.out.println(time1);
        System.out.println(time1.toSeconds());
        System.out.println(time1.secondsBetween(time2));
    }
}