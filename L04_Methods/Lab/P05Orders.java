package L04_Methods.Lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        totalPrice(scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
    }

    public static void totalPrice (String product, double quantity){

        double totalPrice = 0;

        switch (product){
            case "coffee":
                totalPrice = 1.5 * quantity;
                break;
            case "water":
                totalPrice = quantity;
                break;
            case "coke":
                totalPrice = 1.4 * quantity;
                break;
            case "snacks":
                totalPrice = 2.0 * quantity;
                break;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
