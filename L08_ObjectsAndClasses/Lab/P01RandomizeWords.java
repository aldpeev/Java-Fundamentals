package L08_ObjectsAndClasses.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (int i = 0; i < stringList.size(); i++) {

            Random rnd = new Random();
            int randomIndex = rnd.nextInt(stringList.size());
            int secondIndex = rnd.nextInt(stringList.size());

            String firstEl = stringList.get(randomIndex);
            stringList.set(randomIndex, stringList.get(secondIndex));
            stringList.set(secondIndex,firstEl);
        }

        for (String el: stringList){
            System.out.println(el);
        }
    }
}
