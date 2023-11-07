package L09_Maps.Exercise;

import java.util.*;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean searchingWinningLegendary = true;

        Map<String, Integer> collectedMaterials = new LinkedHashMap<>();
        collectedMaterials.put("shards", 0);
        collectedMaterials.put("fragments", 0);
        collectedMaterials.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        while (searchingWinningLegendary) {
            String[] items = Arrays.stream(scanner.nextLine().split(" ")).map(String::toLowerCase).toArray(String[]::new);
            for (int i = 1; i < items.length; i += 2) {
                if (!searchingWinningLegendary){
                    break;
                }
                String item = items[i];
                int quantity = Integer.parseInt(items[i - 1]);

                switch (item) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        addElements(collectedMaterials, item, quantity);
                        if (collectedMaterials.get(item) >= 250) {
                            switch (item) {
                                case "shards":
                                    System.out.println("Shadowmourne obtained!");
                                    break;
                                case "fragments":
                                    System.out.println("Valanyr obtained!");
                                    break;
                                case "motes":
                                    System.out.println("Dragonwrath obtained!");
                                    break;
                            }
                            collectedMaterials.put(item, collectedMaterials.get(item) - 250);
                            searchingWinningLegendary = false;
                            break;
                        }
                        break;
                    default:
                        addElements(junkItems, item, quantity);
                        break;
                }
            }
        }
        collectedMaterials.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
        junkItems.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    public static void addElements(Map<String, Integer> map, String key, Integer value) {
        map.putIfAbsent(key, 0);
        map.put(key, map.get(key) + value);
    }
}


