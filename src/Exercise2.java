import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Inches  : ");
        double enteredInches = in.nextDouble();


        int inch = (int) enteredInches;

        int mi = inch / 63360;
        int firstFeet = inch - (mi * 63360);

        int feet = firstFeet / 12;
        int leftInches = firstFeet - (feet * 12);

        System.out.print("\nMiles  : " + mi + "\nFeet   : " + feet + "\nInches : " + leftInches + "\n");
        in.close();
    }
}