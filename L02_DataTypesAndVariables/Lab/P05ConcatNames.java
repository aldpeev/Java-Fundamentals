package L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String thirdName = scanner.nextLine();
        String delimiter = scanner.next();

        System.out.printf("%s%s%s", name, delimiter, thirdName);
    }
}
