package L08_ObjectsAndClasses.Exercise.P06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        double carsHorsepower = 0;
        double trucksHorsepower = 0;

        int carsCount = 0;
        int trucksCount = 0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] vehicleData = command.split(" ");

            double horsePower = Double.parseDouble(vehicleData[3]);
            String typeVehicle = "";

            if (vehicleData[0].equals("car")) {
                typeVehicle = "Car";
                carsCount++;
                carsHorsepower += horsePower;
            } else {
                typeVehicle = "Truck";
                trucksCount++;
                trucksHorsepower += horsePower;
            }

            Vehicle currentVehicle = new Vehicle(typeVehicle, vehicleData[1], vehicleData[2], horsePower);
            vehicleList.add(currentVehicle);

            command = scanner.nextLine();
        }

        String vehicleToShow = scanner.nextLine();
        while (!vehicleToShow.equals("Close the Catalogue")) {
            for (Vehicle el : vehicleList) {
                if (el.getModel().equals(vehicleToShow)) {
                    System.out.print(el);
                }
            }
            vehicleToShow = scanner.nextLine();
        }

        if (carsCount > 0){
            System.out.printf("Cars have average horsepower of: %.2f.", carsHorsepower / carsCount);
        } else {
            System.out.print("Cars have average horsepower of: 0.00.");
        }
        System.out.println();

        if (trucksCount > 0){
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksHorsepower / trucksCount);
        } else {
            System.out.print("Trucks have average horsepower of: 0.00.");
        }
    }
}
