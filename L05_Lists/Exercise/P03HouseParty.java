package L05_Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String person = commandLine[0];

            if (commandLine.length == 3){
                if (guests.contains(person)){
                    System.out.printf("%s is already in the list!%n", person);
                } else {
                    guests.add(person);
                }
            } else {
                if (guests.contains(person)){
                    guests.remove(person);
                } else {
                    System.out.printf("%s is not in the list!%n", person);
                }
            }
        }

        for (String el : guests){
            System.out.println(el);
        }
    }
}
