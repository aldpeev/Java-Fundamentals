package L09_Maps.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> userData = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commandLine = input.split(" : ");
            String courseName = commandLine[0];
            String studentName = commandLine[1];

            if (!userData.containsKey(courseName)){
                userData.put(courseName, new ArrayList<>());
                userData.get(courseName).add(studentName);
            } else {
                userData.get(courseName).add(studentName);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : userData.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}
