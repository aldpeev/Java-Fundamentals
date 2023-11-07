package L02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P01ConvertMetersToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", meters / 1000.0);
    }
}
