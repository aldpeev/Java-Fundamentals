package L05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int iterations = numList.size();
        for (int i = 0; i < iterations / 2; i++) {
            int firstEl = numList.get(i);
            int lastEl = numList.get(numList.size() - 1);

            numList.set(i, firstEl + lastEl);
            numList.remove(numList.size() - 1);

        }

        for (int el : numList) {
            System.out.print(el + " ");
        }
    }
}
