import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Length    : ");
        double l = in.nextDouble();
        System.out.print("Width     : ");
        double w = in.nextDouble();

        double a = l * w;
        double p = (l * 2) + (w * 2);
        double d = Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2));

        System.out.print("\n");
        System.out.printf("Area      : %,.2f\n", a);
        System.out.printf("Perimeter : %,.2f\n", p);
        System.out.printf("Diagonal  : %,.2f", d);

        in.close();
        }
    }