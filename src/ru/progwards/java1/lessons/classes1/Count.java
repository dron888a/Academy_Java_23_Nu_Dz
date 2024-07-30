package ru.progwards.java1.lessons.classes1;

public class Count {

    int count;

    public Count () {
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
