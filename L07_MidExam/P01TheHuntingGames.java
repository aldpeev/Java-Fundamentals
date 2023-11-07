package L07_MidExam;

import java.util.Scanner;

public class P01TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countPlayers = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());

        double waterPerson = Double.parseDouble(scanner.nextLine()); //11,3
        double foodPerson = Double.parseDouble(scanner.nextLine()); //7.2

        double totalWaterAllDays = waterPerson * countPlayers * n; //791
        double totalFoodAllDays = foodPerson * countPlayers * n; //504

        boolean isEnoughEnergy = true;

        for (int i = 1; i <= n; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            groupEnergy -= energyLoss;

            double currentFood = totalFoodAllDays;
            double currentWater = totalWaterAllDays;

            if (i % 2 == 0) {
                groupEnergy += groupEnergy * 0.05; //3772.26
                totalWaterAllDays *= 0.7; //553.7
            }

            if (i % 3 == 0) {
                groupEnergy += groupEnergy * 0.1; //3576.74
                totalFoodAllDays -= totalFoodAllDays / countPlayers; //432
            }

            if (groupEnergy <= 0) {
                isEnoughEnergy = false;
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", currentFood, currentWater);
                break;
            }
        }

        if (isEnoughEnergy){
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!%n", groupEnergy);
        }



    }
}
