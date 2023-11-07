package L02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = people / capacity;
        int partCourse = people % capacity;

        if (partCourse > 0){
            fullCourses++;
        }

        System.out.println(fullCourses);

    }
}
