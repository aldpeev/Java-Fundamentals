package L09_Maps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02MinersTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int value = Integer.parseInt(scanner.nextLine());

            Integer currentValue = resourcesMap.get(input);
            if (currentValue == null) {
                resourcesMap.put(input, value);
            } else {
                resourcesMap.put(input, resourcesMap.get(input) + value);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}

