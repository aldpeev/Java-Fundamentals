package L09_Maps.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> integerMap = new TreeMap<>();

        for (Double el : numbersArr) {
            Integer currentValue = integerMap.get(el);
            if (currentValue == null) {
                integerMap.put(el, 1);
            } else {
                integerMap.put(el, integerMap.get(el) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : integerMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
