package L04_Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        passVerification(scanner.nextLine());


    }
    public static void passVerification (String text){
        if (passValidationLength(text) && passValidationDigits(text) && passValidationConsists(text)){
            System.out.println("Password is valid");
        }

        if (!passValidationLength(text)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!passValidationConsists(text)){
            System.out.println("Password must consist only of letters and digits");
        }

        if (!passValidationDigits(text)){
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean passValidationLength(String text) {

        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean passValidationDigits(String text) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                count++;
            }
        }

        if (count >= 2) {
            return true;
        }
        return false;
    }

    public static boolean passValidationConsists(String text) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i)) || Character.isLetter(text.charAt(i))) {
                count++;
            }
        }
        if (count == text.length()){
            return true;
        }

        return false;
    }


}
