package L09_Maps.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> wordSynonymMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String wordKey = scanner.nextLine();
            String synonymValue = scanner.nextLine();

            ArrayList<String> currentWord = wordSynonymMap.get(wordKey);
            if (currentWord == null){
                wordSynonymMap.put(wordKey, new ArrayList<>());
                wordSynonymMap.get(wordKey).add(synonymValue);
            } else {
                wordSynonymMap.get(wordKey).add(synonymValue);
            }
        }

        for (Map.Entry<String, ArrayList<String>> entry : wordSynonymMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
