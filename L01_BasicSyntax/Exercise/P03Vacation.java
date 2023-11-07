package L01_BasicSyntax.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;
        switch (typeOfGroup) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        price = people * 8.45;
                        break;
                    case "Saturday":
                        price = people * 9.80;
                        break;
                    case "Sunday":
                        price = people * 10.46;
                        break;
                }
                if (people >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        price = people * 10.90;
                        if (people >= 100) {
                            price = (people - 10) * 10.90;
                        }
                        break;
                    case "Saturday":
                        price = people * 15.60;
                        if (people >= 100) {
                            price = (people - 10) * 15.60;
                        }
                        break;
                    case "Sunday":
                        price = people * 16;
                        if (people >= 100) {
                            price = (people - 10) * 16;
                        }
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        price = people * 15;
                        break;
                    case "Saturday":
                        price = people * 20;
                        break;
                    case "Sunday":
                        price = people * 22.50;
                        break;
                }
                if (people >= 10 && people <= 20) {
                    price *= 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f", price);
    }
}
