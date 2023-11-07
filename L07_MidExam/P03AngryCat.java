package L07_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03AngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        int entryIndex = Integer.parseInt(scanner.nextLine());
        int entryIndexValue = numList.get(entryIndex);

        String command = scanner.nextLine();
        switch (command) {
            case "cheap":

                int leftSum = 0;
                for (int i = entryIndex  - 1; i >= 0; i--) {
                    if (numList.get(i) < entryIndexValue){
                        leftSum += numList.get(i);
                    }
                }

                int rightSum = 0;
                for (int i = entryIndex + 1; i < numList.size(); i++) {
                    if (numList.get(i) < entryIndexValue){
                        rightSum += numList.get(i);
                    }
                }

                if (leftSum == rightSum){
                    System.out.println("Left - " + leftSum);
                } else if (leftSum > rightSum) {
                    System.out.println("Left - " + leftSum);
                } else {
                    System.out.println("Right - " + rightSum);
                }

                break;
            case "expensive":

                int leftSumExpensive = 0;
                for (int i = entryIndex  - 1; i >= 0; i--) {
                    if (numList.get(i) >= entryIndexValue){
                        leftSumExpensive += numList.get(i);
                    }
                }

                int rightSumExpensive = 0;
                for (int i = entryIndex + 1; i < numList.size(); i++) {
                    if (numList.get(i) >= entryIndexValue){
                        rightSumExpensive += numList.get(i);
                    }
                }

                if (leftSumExpensive == rightSumExpensive){
                    System.out.println("Left - " + leftSumExpensive);
                } else if (leftSumExpensive > rightSumExpensive) {
                    System.out.println("Left - " + leftSumExpensive);
                } else {
                    System.out.println("Right - " + rightSumExpensive);
                }

                break;
        }


    }
}
