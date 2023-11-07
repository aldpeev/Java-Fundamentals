package L09_Maps.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> employeeMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] employeeData = input.split(" -> ");
            String company = employeeData[0];
            String employeeId = employeeData[1];

            employeeMap.putIfAbsent(company, new ArrayList<>());
            if (!employeeMap.get(company).contains(employeeId)) {
                employeeMap.get(company).add(employeeId);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }

    }
}
