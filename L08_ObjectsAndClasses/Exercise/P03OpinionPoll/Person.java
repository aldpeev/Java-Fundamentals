package L08_ObjectsAndClasses.Exercise.P03OpinionPoll;

public class Person {
    //полета -> характеристики
    private String name;
    private int age;

    //конструктор
    public Person(String name, int age) {
        //нов празен обект
        //name = null
        //age = 0
        this.name = name;
        this.age = age;
    }

    //методи -> функционалности
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}








