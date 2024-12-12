import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(scan, "Enter a valid ssn (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN entered: " + ssn);

        String mNumber = SafeInput.getRegExString(scan, "Enter a valid UC M Number:", "^(M|m)\\d{5}$");
        System.out.println("UC M Number entered: " + mNumber);

        String menuChoice = SafeInput.getRegExString(scan, "Enter a menu choice (O/o) for Open, (V/v) for View, (S/s) for Save, and (Q/q) for quit", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + menuChoice);
    }
}
