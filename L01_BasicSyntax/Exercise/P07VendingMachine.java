package L01_BasicSyntax.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCoinsInserted = 0;

        String coins = scanner.nextLine();
        while (!coins.equals("Start")) {
            double coinValue = Double.parseDouble(coins);
            if (coinValue == 0.1 || coinValue == 0.2 || coinValue == 0.5 || coinValue == 1 || coinValue == 2) {
                totalCoinsInserted += coinValue;
            } else {
                System.out.printf("Cannot accept %.2f%n", coinValue);
            }
            coins = scanner.nextLine();
        }

        String products = scanner.nextLine();
        while (!products.equals("End")) {
            switch (products) {
                case "Nuts":
                    if (totalCoinsInserted - 2.0 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoinsInserted -= 2.0;
                        System.out.printf("Purchased %s%n", products);
                    }
                    break;
                case "Water":
                    if (totalCoinsInserted - 0.7 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoinsInserted -= 0.7;
                        System.out.printf("Purchased %s%n", products);
                    }
                    break;
                case "Crisps":
                    if (totalCoinsInserted - 1.5 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoinsInserted -= 1.5;
                        System.out.printf("Purchased %s%n", products);
                    }
                    break;
                case "Soda":
                    if (totalCoinsInserted - 0.8 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoinsInserted -= 0.8;
                        System.out.printf("Purchased %s%n", products);
                    }
                    break;
                case "Coke":
                    if (totalCoinsInserted - 1.0 < 0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        totalCoinsInserted -= 1.0;
                        System.out.printf("Purchased %s%n", products);
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            products = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalCoinsInserted);

    }
}
