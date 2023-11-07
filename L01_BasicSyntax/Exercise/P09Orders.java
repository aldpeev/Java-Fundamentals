package L01_BasicSyntax.Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double price = 0;
        for (int i = 0; i < n; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double totalPrice = (days * capsuleCount) * capsulePrice;
            price += totalPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", totalPrice);
        }
        System.out.printf("Total: $%.2f", price);

    }
}
