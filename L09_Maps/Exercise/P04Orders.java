package L09_Maps.Exercise;

import java.util.*;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> productsListMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            Double price = Double.parseDouble(input.split(" ")[1]);
            Double quantity = Double.parseDouble(input.split(" ")[2]);

            if (!productsListMap.containsKey(product)) {
                productsListMap.put(product, new ArrayList<>());
                productsListMap.get(product).add(price);
                productsListMap.get(product).add(quantity);
            } else {
                productsListMap.get(product).set(0, price);
                productsListMap.get(product).set(1, productsListMap.get(product).get(1) + quantity);
            }

            input = scanner.nextLine();
        }

        productsListMap.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue().get(0) * e.getValue().get(1)));

    }
}
