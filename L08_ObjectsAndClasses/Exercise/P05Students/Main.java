package L08_ObjectsAndClasses.Exercise.P05Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            double grade = Double.parseDouble(studentData[2]);

            Student currentStudent = new Student(studentData[0],studentData[1],grade);
            studentList.add(currentStudent);
        }

         studentList.stream().sorted(Comparator.comparingDouble(Student::getGrade).reversed()).forEach(System.out::println);
    }
}
