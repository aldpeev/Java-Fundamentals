package L08_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return this.hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            String[] commandLine = command.split(" ");

            Student currentStudent = new Student(commandLine[0], commandLine[1], commandLine[2], commandLine[3]);
            studentList.add(currentStudent);

            command = scanner.nextLine();
        }

        String town = scanner.nextLine();
        ;
        for (Student student : studentList) {
            if (town.equals(student.getHometown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }
}
