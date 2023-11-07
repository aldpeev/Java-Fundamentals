package L12_ExamPreparation.Prep2;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> plantsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] plantToAdd = scanner.nextLine().split("<->");

            if (!plantsMap.containsKey(plantToAdd[0])){
                plantsMap.put(plantToAdd[0],new ArrayList<>());
                plantsMap.get(plantToAdd[0]).add(Double.parseDouble(plantToAdd[1]));
            } else {
                plantsMap.get(plantToAdd[0]).set(0, plantsMap.get(plantToAdd[0]).get(0) + Double.parseDouble(plantToAdd[1]));
            }

        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {

            String[] commandLine = command.split("[:\\s-]+");
            String plant = commandLine[1];

            switch (commandLine[0]) {
                case "Rate":
                    if (plantsMap.get(plant) == null) {
                        System.out.println("error");
                    } else {
                        plantsMap.get(plant).add(Double.parseDouble(commandLine[2]));
                    }
                    break;
                case "Update":
                    if (plantsMap.get(plant) == null) {
                        System.out.println("error");
                    } else {
                        plantsMap.get(plant).set(0, Double.parseDouble(commandLine[2]));
                    }
                    break;
                case "Reset":
                    if (plantsMap.get(plant) == null) {
                        System.out.println("error");
                    } else {
                       double rarity = plantsMap.get(plant).get(0);
                       plantsMap.put(plant,new ArrayList<>());
                       plantsMap.get(plant).add(rarity);
                       plantsMap.get(plant).add(0.0);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, List<Double>> pair : plantsMap.entrySet()) {

            double averageRating = 0.0;
            for (int i = 1; i < pair.getValue().size() ; i++) {
                averageRating += pair.getValue().get(i);
            }

            double rarity = plantsMap.get(pair.getKey()).get(0);

            if (averageRating != 0.0){
                averageRating /= pair.getValue().size() - 1;
                plantsMap.put(pair.getKey(), new ArrayList<>());
                plantsMap.get(pair.getKey()).add(rarity);
                plantsMap.get(pair.getKey()).add(averageRating);
            } else {
                plantsMap.put(pair.getKey(), new ArrayList<>());
                plantsMap.get(pair.getKey()).add(rarity);
                plantsMap.get(pair.getKey()).add(0.0);
            }
        }

        plantsMap.entrySet().stream().forEach(e -> System.out.printf(" - %s; Rarity: %.0f; Rating: %.2f%n", e.getKey(), e.getValue().get(0),
                        e.getValue().get(1)));


    }
}
