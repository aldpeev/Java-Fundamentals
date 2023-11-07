package L05_Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] commandLine = scanner.nextLine().split(" ");
        while (!commandLine[0].equals("3:1")) {

            switch (commandLine[0]) {
                case "merge":
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);

                    if (firstIndex < 0) {
                        firstIndex = 0;
                    } else if (firstIndex > stringList.size() - 1) {
                        firstIndex = stringList.size() - 1;
                    }

                    if (secondIndex > stringList.size() - 1) {
                        secondIndex = stringList.size() - 1;
                    }

                    int count = firstIndex;
                    while (count < secondIndex) {

                        stringList.set(firstIndex, stringList.get(firstIndex) + stringList.get(firstIndex + 1));
                        stringList.remove(firstIndex + 1);

                        count++;
                    }
                    break;
                case "divide":
                    int indexToDivide = Integer.parseInt(commandLine[1]); // желаният индекс, които трябва да бъде разцепен
                    int partitions = Integer.parseInt(commandLine[2]); // прорциите на които трябва да бъде разцепен

                    List<String> indexToList = Arrays.stream(stringList.get(indexToDivide).split("")).collect(Collectors.toList()); // индекса като лист от елементи
                    List<String> dividedList = new ArrayList<>(); // създаване на нов лист за пълнене на новите масиви

                    int elementsToConcat = indexToList.size() / partitions; // бройката елементи, които трябва да бъдат конкатнати за да се постигнат порциите

                    for (int i = 0; i < indexToList.size(); i += elementsToConcat) { // обикаляме листа и ъпдейтваме i с увеличаване с бройакта елементи
                        String stringToAdd = String.join("", indexToList.subList(i, i + elementsToConcat)); // елементите, които трябва да се добавят, представени като стринг

                        if (dividedList.size() == partitions){ // проверка дали са достигнати максималните порции

                            int lastIndex = dividedList.size() - 1; // запазване на последния индекс в променлива
                            String lastElementsToAdd = String.join("",dividedList.get(lastIndex) + stringToAdd);
                            dividedList.set(lastIndex, lastElementsToAdd);

                            break;
                        } else {
                            dividedList.add(stringToAdd); // добавяне на елементите към новосъздадения лист
                        }
                    }

                    stringList.remove(indexToDivide);
                    stringList.addAll(indexToDivide, dividedList);
            }

            commandLine = scanner.nextLine().split(" ");
        }

        System.out.println(String.join(" ", stringList));
    }
}
