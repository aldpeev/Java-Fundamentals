package L08_ObjectsAndClasses.Exercise.P03OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <= n; row++) {
            String personalData = scanner.nextLine();
            //"Peter 12".split(" ") -> ["Peter", "12"]
            String name = personalData.split(" ")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);
            if (age > 30) {
                //валиден човек -> създам
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        //списък с обекти от клас Person
        for (Person person : personList) {
            //{name} - {age}
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}