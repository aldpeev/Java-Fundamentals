package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int[] bombNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numList.size(); i++) {

            if (numList.get(i).equals(bombNumbers[0])) {

                int startIndex = 0;
                int endIndex = 0;

                if (i - bombNumbers[1] > 0) {
                    startIndex = i - bombNumbers[1];
                }

                if (i + bombNumbers[1] < numList.size()) {
                    endIndex = i + bombNumbers[1];
                } else {
                    endIndex = numList.size() - 1;
                }

                numList.subList(startIndex,endIndex + 1).clear();

                i = -1;
            }
        }
        int sum = 0;
        for (int el : numList){
            sum += el;
        }
        System.out.println(sum);
    }
}


