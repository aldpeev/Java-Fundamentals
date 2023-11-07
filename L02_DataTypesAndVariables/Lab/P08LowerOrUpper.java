package L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.next().charAt(0);

        if (Character.isLowerCase(character)){
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
