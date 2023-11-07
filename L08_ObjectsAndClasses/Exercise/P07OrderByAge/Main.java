package L08_ObjectsAndClasses.Exercise.P07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] data = command.split(" ");
            int age = Integer.parseInt(data[2]);

            Person currentPerson = new Person(data[0],data[1],age);
            personList.add(currentPerson);

            command = scanner.nextLine();
        }

        personList.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
    }

}
