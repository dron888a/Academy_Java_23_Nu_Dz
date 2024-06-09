package ru.progwards.java1.lessons.compare;

public class Divisibility {
    public static void check(int num1, int num2) {
        if (num2 == 0) { // Проверим, что второе число не 0
            System.out.println("На ноль делить нельзя");
        }

            else {
                if (num1 % num2 == 0) { // Проверим целое ли оно
                    System.out.println(num1 + " делится нацело на " + num2);
                }
                    else { // Если нецелое
                    System.out.println("Остаток от деления " + num1 + " на " +
                            num2 + " равен " + (num1 % num2));
                }
            System.out.println("Частное от деления " + num1 + " на " + num2 +
                    " равно " + ((double)num1 / num2)); // исправил на тип double при делении,
                                                        //   чтобы получить дробное значение
        }
    }

    public static void main(String[] args) {
        check(47,8);
    }
}

class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int max = a; //  Если a максимальная
        if (b > max) {  // Сравниваем другую сторону
            max = b;  // Если она больше, то присваиваем ей max
        }
        if (c > max) {  // Сравниваем третью сторону
            max = c; //  Если она больше , то присваиваем ей max
        }
        return max; //  Вернём наибольшую длину стороны
    }

    public static int minSide(int a, int b, int c) {
        int min = a;  //  Если a минимальная
        if (b < min) {  // Сравниваем другую сторону
            min = b;  // Если она меньше, то присваиваем ей min
        }
        if (c < min) {  // Сравниваем третью сторону
            min = c;  //  Если она меньше , то присваиваем ей min
        }
        return min;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && b == c;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(10,8,9));
        System.out.println(minSide(10,8,9));
        System.out.println(isEquilateralTriangle(2,2,3));
        System.out.println(isEquilateralTriangle(2,3,2));
        System.out.println(isEquilateralTriangle(3,2,2));
        System.out.println(isEquilateralTriangle(2,2,2));
        System.out.println(isEquilateralTriangle(3,3,3));
    }
}

class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c)); //  Определим самую длинную
        if (max == a) {
            return a * a == b * b + c * c;
        }
        else if (max == b) {
            return b * b == a * a + c * c;
        }
        else {
            return c * c == a * a + b * b;
        }
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(2,2,3)); // true
        System.out.println(isTriangle(2,3,4)); // true
        System.out.println(isTriangle(3,2,5)); // false
        System.out.println(isTriangle(2,3,6)); // false
        System.out.println(isTriangle(3,3,9)); // false
        System.out.println(isRightTriangle(5,7,9)); // false
        System.out.println(isIsoscelesTriangle(2,2,3)); // true
        System.out.println(isIsoscelesTriangle(2,3,2)); // true
        System.out.println(isIsoscelesTriangle(3,2,2)); // true
        System.out.println(isIsoscelesTriangle(2,2,2)); // true
        System.out.println(isIsoscelesTriangle(3,3,3)); // true
    }
}