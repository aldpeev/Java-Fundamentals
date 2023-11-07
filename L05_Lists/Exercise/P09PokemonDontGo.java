package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNum = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (!listNum.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int elementToRemove = 0;

            if (index < 0) {
                elementToRemove = listNum.get(0);
                listNum.set(0, listNum.get(listNum.size() - 1));
            } else if (index > listNum.size() - 1) {
                elementToRemove = listNum.get(listNum.size() - 1);
                listNum.set(listNum.size() - 1, listNum.get(0));
            } else {
                elementToRemove = listNum.get(index);
                listNum.remove(index);
            }

            sum += elementToRemove;

            for (int i = 0; i < listNum.size(); i++) {
                if (listNum.get(i) <= elementToRemove) {
                    listNum.set(i, listNum.get(i) + elementToRemove);
                } else {
                    listNum.set(i, listNum.get(i) - elementToRemove);
                }
            }
        }

        System.out.println(sum);
    }
}

