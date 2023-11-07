package L05_Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        
        List<String> finalList = new ArrayList<>();

        for (int i = initialList.size() - 1; i >= 0; i--) {
            if (initialList.get(i).equals("|")){
                finalList.addAll(initialList.subList(i + 1, initialList.size()));

                initialList.subList(i, initialList.size()).clear();

                i = initialList.size();
            }
        }

        if (!initialList.isEmpty()){
            finalList.addAll(initialList.subList(0, initialList.size()));
        }

        finalList.removeIf(e -> e.equals(" "));

        System.out.println(String.join(" ", finalList));

        

    }
}
