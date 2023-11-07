package L12_ExamPreparation.Prep3;

import java.util.*;

public class P03NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");

            carsMap.put(carInfo[0], new ArrayList<>());
            carsMap.get(carInfo[0]).add(Integer.parseInt(carInfo[1]));
            carsMap.get(carInfo[0]).add(Integer.parseInt(carInfo[2]));
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            String[] commandLine = command.split(" : ");

            switch (commandLine[0]){
                case "Drive":
                    int distance = Integer.parseInt(commandLine[2]);
                    int fuel = Integer.parseInt(commandLine[3]);

                    if (carsMap.get(commandLine[1]).get(1) < fuel){
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carsMap.get(commandLine[1]).set(0, carsMap.get(commandLine[1]).get(0) + distance);
                        carsMap.get(commandLine[1]).set(1, carsMap.get(commandLine[1]).get(1) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", commandLine[1],distance, fuel);
                    }

                    if (carsMap.get(commandLine[1]).get(0) >= 100000){
                        carsMap.remove(commandLine[1]);
                        System.out.printf("Time to sell the %s!%n", commandLine[1]);
                    }
                    break;
                case "Refuel":
                    int fuelToRefill = Integer.parseInt(commandLine[2]);
                    if (carsMap.get(commandLine[1]).get(1) + fuelToRefill > 75){
                        int maxFuel = 75 - carsMap.get(commandLine[1]).get(1);
                        carsMap.get(commandLine[1]).set(1, 75);
                        System.out.printf("%s refueled with %d liters%n", commandLine[1], maxFuel);
                    } else {
                        carsMap.get(commandLine[1]).set(1,carsMap.get(commandLine[1]).get(1) + fuelToRefill);
                        System.out.printf("%s refueled with %s liters%n", commandLine[1], fuelToRefill);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(commandLine[2]);
                    carsMap.get(commandLine[1]).set(0, carsMap.get(commandLine[1]).get(0) - kilometers);

                    if (carsMap.get(commandLine[1]).get(0) < 10000){
                        carsMap.get(commandLine[1]).set(0, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", commandLine[1], kilometers);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        carsMap.entrySet().stream().forEach(e -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                e.getKey(), e.getValue().get(0), e.getValue().get(1)));

    }
}
