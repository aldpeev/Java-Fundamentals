package L06_MidExamPreparation.Prep3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listRooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        int health = 100;
        int bitcoin = 0;
        boolean shouldBreak = false;

        for (int i = 0; i < listRooms.size(); i++) {
            String[] roomData = listRooms.get(i).split(" ");

            String command = roomData[0];
            int healthAction = Integer.parseInt(roomData[1]);

            switch (command) {
                case "potion":
                    if (health + healthAction <= 100) {
                        health += healthAction;
                        System.out.printf("You healed for %d hp.%n", healthAction);
                    } else {
                        System.out.printf("You healed for %d hp.%n", 100 - health);
                        health = 100;
                    }
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoin += healthAction;
                    System.out.printf("You found %d bitcoins.%n", healthAction);
                    break;
                default:
                    if (health - healthAction > 0) {
                        health -= healthAction;
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        shouldBreak = true;
                    }
                    break;
            }
            if (shouldBreak) {
                break;
            }
        }

        if (!shouldBreak) {
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d%n", bitcoin, health);
        }
    }
}
