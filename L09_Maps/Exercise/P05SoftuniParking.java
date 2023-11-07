package L09_Maps.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> dataMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");

            switch (data[0]){
                case "register":
                    if (!dataMap.containsKey(data[1])){
                        dataMap.put(data[1], data[2]);
                        System.out.printf("%s registered %s successfully%n", data[1], data[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", data[2]);
                    }
                    break;
                case "unregister":
                    String searchedUser = dataMap.get(data[1]);
                    if (searchedUser == null){
                        System.out.printf("ERROR: user %s not found%n", data[1]);
                    } else {
                        dataMap.remove(data[1]);
                        System.out.printf("%s unregistered successfully%n", data[1]);
                    }
                    break;
            }
        }
        dataMap.entrySet().forEach(e -> System.out.printf("%s => %s%n", e.getKey(), e.getValue()));
    }
}
