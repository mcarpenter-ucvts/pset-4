import java.util.Scanner;

public class Exercise8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Text : ");
        String input = in.nextLine();
        int inputLength = input.length();
        int halfinputLength = input.length() / 2;
        String half1 = input.substring(0, halfinputLength).toUpperCase();
        String half2 = input.substring(halfinputLength, inputLength).toUpperCase();

        System.out.print("\n" + half2 + half1 + ".");
        in.close();

        }

    }