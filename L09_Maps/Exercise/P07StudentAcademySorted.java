package L09_Maps.Exercise;

import java.util.*;

public class P07StudentAcademySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> studentsMap = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            Double studentGrade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(studentName)){
                studentsMap.put(studentName,new ArrayList<>());
                studentsMap.get(studentName).add(studentGrade);
                studentsMap.get(studentName).add(1.0);
            } else {
                studentsMap.get(studentName).set(0,studentsMap.get(studentName).get(0) + studentGrade);
                studentsMap.get(studentName).set(1,studentsMap.get(studentName).get(1) + 1.0);
            }
        }

        Map<String, Double> studentsAverage = new HashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : studentsMap.entrySet()) {
            double averageGrade = entry.getValue().get(0) / entry.getValue().get(1);
            if (averageGrade >= 4.5){
                studentsAverage.put(entry.getKey(), averageGrade);
            }
        }

        studentsAverage.entrySet().stream().sorted((e,e1) -> e1.getValue().compareTo(e.getValue())).
                forEach(e-> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));


    }
}
