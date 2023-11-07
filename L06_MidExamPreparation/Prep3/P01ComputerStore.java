package L06_MidExamPreparation.Prep3;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0.0;

        String command = scanner.nextLine();

        while(!command.equals("regular") && !command.equals("special")){
            double partPrice = Double.parseDouble(command);

            if (partPrice < 0){
                System.out.println("Invalid price!");
            } else {
                totalPrice += partPrice;
            }

            command = scanner.nextLine();
        }

        double taxes = totalPrice * 0.2;

        if (totalPrice == 0){
            System.out.println("Invalid order!");
        } else {
            if (command.equals("special")){
                double totalPriceWithDiscount = (totalPrice + taxes) - ((totalPrice + taxes) * 0.1);
                System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$%n"
                        , totalPrice,taxes, totalPriceWithDiscount);

            } else {
                System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$%n"
                        , totalPrice,taxes, totalPrice + taxes);
            }
        }
    }
}
