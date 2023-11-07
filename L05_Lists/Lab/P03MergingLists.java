package L05_Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int iterations = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < iterations; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }

        if (firstList.size() > secondList.size()){
            resultList.addAll(firstList.subList(iterations, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(iterations, secondList.size()));
        }

        for (int el : resultList){
            System.out.print(el + " ");
        }
    }
}
