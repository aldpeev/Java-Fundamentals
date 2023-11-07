package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(":");
        while (!command[0].equals("course start")) {
            switch (command[0]) {
                case "Add":
                    if (!stringList.contains(command[1])) {
                        stringList.add(command[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!stringList.contains(command[1]) && index >= 0 && index <= stringList.size() - 1) {
                        stringList.add(index, command[1]);
                    }
                    break;
                case "Remove":
                    stringList.remove(command[1]);
                    stringList.remove(command[1] + "-Exercise");
                    break;
                case "Swap":
                    if (stringList.contains(command[1]) && stringList.contains(command[2])) {
                        Collections.swap(stringList, stringList.indexOf(command[1]), stringList.indexOf(command[2]));
                    }

                    if (stringList.contains(command[2] + "-Exercise")){
                        stringList.remove(command[2] + "-Exercise");

                        int index2 = stringList.indexOf(command[2]) + 1;
                        if (index2 > stringList.size() - 1){
                            stringList.add(command[2] + "-Exercise");
                        } else {
                            stringList.add(index2, command[2] + "-Exercise" );
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = command[1] + "-Exercise";

                    if (stringList.contains(command[1]) && !stringList.contains(exercise)) {
                        if (stringList.indexOf(command[1]) < stringList.size() - 1) {
                            stringList.add(stringList.indexOf(command[1]) + 1, command[1] + "-Exercise");
                        } else {
                            stringList.add(exercise);
                        }
                    } else {
                        stringList.add(command[1]);
                        stringList.add(exercise);
                    }
                    break;
            }

            command = scanner.nextLine().split(":");
        }

        for (int i = 0; i < stringList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, stringList.get(i));

        }
    }
}
