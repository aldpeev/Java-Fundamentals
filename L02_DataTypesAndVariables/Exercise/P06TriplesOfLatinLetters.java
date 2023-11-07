package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 + n; i++) {
            char firstChar = (char) i;
            for (int j = 97; j < 97 + n; j++) {
                char secondChar = (char) j;
                for (int k = 97; k < 97 + n; k++) {
                    char thirdChar = (char) k;
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
