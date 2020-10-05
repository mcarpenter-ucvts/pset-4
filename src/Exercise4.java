import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Centimeters : ");
        int cms = in.nextInt();

        int kms = cms/100000;
        cms = cms % 100000;

        int m = cms / 100;
        cms = cms % 100;

        System.out.println("\nKilometers  : " + kms);
        System.out.println("Meters      : " + m);
        System.out.println("Centimeters : " + cms);
        in.close();
    }