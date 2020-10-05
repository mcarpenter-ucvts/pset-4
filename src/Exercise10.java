import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's your favorite city? ");
        String city = in.nextLine();
        int cityLength = city.length();
        String capcity = city.toUpperCase();
        String lowcity = city.toLowerCase();

        System.out.print("\n" + "Text   : " + city);
        System.out.print("\n" + "Length : " + cityLength);
        System.out.print("\n" + "Upper  : " + capcity);
        System.out.print("\n" + "Lower  : " + lowcity);
        in.close();
    }
}