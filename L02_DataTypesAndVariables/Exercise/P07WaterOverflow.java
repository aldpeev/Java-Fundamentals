package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int waterInTheTank = 0;
        for (int i = 0; i < n; i++) {
            int waterToPour = Integer.parseInt(scanner.nextLine());

            if (waterInTheTank + waterToPour > 255) {
                System.out.println("Insufficient capacity!");
            } else {
                waterInTheTank += waterToPour;
            }

        }
        System.out.println(waterInTheTank);
    }
}
