package L09_Maps.Lab;

import java.sql.SQLOutput;
import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArr = scanner.nextLine().split(" ");
        Map<String, Integer> occurrenceMap = new LinkedHashMap<>();

        for (String el : stringArr) {
            String elementToLower = el.toLowerCase();
            Integer currentWord = occurrenceMap.get(elementToLower);

            if (currentWord == null) {
                occurrenceMap.put(elementToLower, 1);
            } else {
                occurrenceMap.put(elementToLower, occurrenceMap.get(elementToLower) + 1);
            }
        }

        List<String> oddOccurrences = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (!oddOccurrences.contains(entry.getKey())) {
                    oddOccurrences.add(entry.getKey());
                }
            }
        }

        System.out.println(String.join(", ", oddOccurrences));

    }
}
