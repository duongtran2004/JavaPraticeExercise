package duongtran.JavaOOPExercises.basicOOP.Ex2;

public class Dog {
    //attributes
    String name;
    String breed;
    //constructor with arguments

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
