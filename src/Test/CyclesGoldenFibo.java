package Test;

public class CyclesGoldenFibo {

    static final double V1 = 1.61703;
    static final double V2 = 1.61903;

    public static boolean isGoldenTriangle(int a, int b, int c)
//   будет возвращать true, если треугольник со сторонами a, b, c является Золотым.
//   Определим критерии. Он должен быть равнобедренным и отношение ребра к основанию
//   должно лежать между значениями 1.61703 и 1.61903.
    {
        double ac = (double) a / c;
        double ab = (double) a / b;
        double ba = (double) b / a;

        return
                TriangleInfo.isIsoscelesTriangle(a, b, c) &&
                        (
                                ((a == b) && (V1 <= ac) && (V2 >= ac))
                                        ||    ((a == c) && (V1 <= ab) && (V2 >= ab))
                                        ||    ((c == b) && (V1 <= ba) && (V2 >= ba))
                        );
    }

    public static void main(String[] args) {
        System.out.println(CyclesGoldenFibo.isGoldenTriangle(4,4,4));
    }
}

