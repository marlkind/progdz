import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        text();
        int num = input.nextInt();
        while (num != 0)
        {
            System.out.print("Введите a=");
            Scanner agh = new Scanner(System.in);
            double a = agh.nextDouble();
            System.out.print("Введите b=");
            double b = agh.nextDouble();
            if (num != 5) {
                allfunc(a, b, num);
            } else {
                System.out.print("Введите с=");
                double c = agh.nextDouble();
                kvadrat(a, b, c);

            }
            text();
            num = input.nextInt();
        }

    }
    public static void text ()
    {
        System.out.println("0 - Чтобы закрыть программу введите");
        System.out.println(" 1 - '+'\n 2 - '-'\n 3 - '*' \n 4 - '/' \n 5 - Квадратное уравнение, вида 'ax²+bx+c=0' ");
    }
    public static void allfunc(double a, double b, int num)
    {
        if (num == 1) {
            System.out.println(a + b);
        } else if (num == 2) {
            System.out.println(a - b);
        } else if (num == 3) {
            System.out.println(a * b);
        } else if (num == 4) {
            System.out.println(a / b);
        }
    }

    public static void kvadrat(double a, double b, double c) {

        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-1 * b - Math.sqrt(D)) / (2 * a);
            double x2 = (-1 * b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        else if (D == 0) {
            double x = (-1 * b) / (2 * a);
            System.out.println("x=" + x);
        }

        else if (D < 0) {
            System.out.println("Нет корней");
        }
    }
}
