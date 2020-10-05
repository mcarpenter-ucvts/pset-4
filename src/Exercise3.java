
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length : ");
        double l = in.nextDouble();
        System.out.print("Width : ");
        double w = in.nextDouble();
        System.out.print("Diameter : ");
        double d = in.nextDouble();

        double bArea = l * w;
        double hArea = Math.PI * Math.pow(d/2 , 2);
        double fullArea = bArea - hArea;


        System.out.printf("%n%-13s: %,.2f", "Surface Area", fullArea);
        in.close();
    }
}