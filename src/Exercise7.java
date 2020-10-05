import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Side : ");
        double s = in.nextDouble();

        in.close();

        double a = (((3 * Math.sqrt(3)) / 2) * Math.pow(s, 2));
        double p = 6 * s;

        System.out.print("\n");
        System.out.print("Area      : ");

        System.out.printf("%,.2f", a);
        System.out.print("\n");

        System.out.print("Perimeter : ");
        System.out.printf("%,.2f", p);
    }
}
