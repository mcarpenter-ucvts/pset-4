import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("First Name   : ");
        String fName = in.nextLine();
        System.out.print("Middle Name  : ");
        String mName = in.nextLine();
        System.out.print("Last Name    : ");
        String lName = in.nextLine();

        String fInitial = fName.substring(0, 1);
        String mInitial = mName.substring(0, 1);
        String lInitial = lName.substring(0, 1);

        String complInitials = (fInitial + mInitial + lInitial).toUpperCase();

        in.close();

        System.out.print("\n");
        System.out.print(complInitials + ".");

    }
}
