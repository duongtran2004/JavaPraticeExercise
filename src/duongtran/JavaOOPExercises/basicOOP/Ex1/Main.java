package duongtran.JavaOOPExercises.basicOOP.Ex1;

public class Main {
    public static void main(String[] args) {
        //create 2 Person object
        Person person1 = new Person("Jonny", 69);
        Person person2 = new Person("Bob", 6);
        System.out.println("Person's name: " + person1.name + " Person's age: " + person1.age);
        System.out.println("Person's name: " + person2.name + " Person's age: " + person2.age);

    }
}
