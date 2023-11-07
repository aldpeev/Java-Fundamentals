package L06_MidExamPreparation.Prep1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = numList.stream().mapToInt(Integer::intValue).sum();

        int elementsInArray = numList.size();
        double averageValue = sum * 1.0 / elementsInArray;

        numList.removeIf(e -> e <= averageValue);
        Collections.sort(numList);
        Collections.reverse(numList);

        if (numList.size() < 1) {
            System.out.println("No");
        } else if (numList.size() - 1 < 5) {
            for (int el : numList) {
                System.out.print(el + " ");
            }
        } else {
            for (int i = 0; i < 5; i++) {
                System.out.print(numList.get(i) + " ");

            }
        }
    }
}
