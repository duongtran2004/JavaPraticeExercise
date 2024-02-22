package duongtran.JavaOOPExercises.basicOOP.Ex2;

import java.util.Scanner;

//Write a Java program to create a class called "Dog" with a name and breed attribute.
// Create two instances of the "Dog" class,
// set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
public class Main {
    public static void main(String[] args) {
        //create 2 Dog objects
        Dog dog1 = new Dog("Joey", "Phu Quoc");
        Dog dog2 = new Dog("Clare", "Chihuahua");
        //Display Dog objects' info using getter methods
        System.out.println("Dog 1's info: Name: " + dog1.getName() + "; Breed: " + dog1.getBreed());
        System.out.println("Dog 2's info: Name: " + dog2.getName() + "; Breed: " + dog2.getBreed());
        //Ask user input to update info:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please update Dog 1's info. ");
        System.out.println("Please update Dog 1's name: ");
        //variable to hold update info:
        String newDog1Name = scanner.next();
        System.out.println("Please update Dog 1's breed: ");
        //variable to hold update info:
        String newDog1Breed = scanner.next();
        //Update Dog 1's info using setter method. Remember to update before printing
        dog1.setName(newDog1Name);
        dog1.setBreed(newDog1Breed);

        //Repeat the same process with Dog 2
        System.out.println("Dog 2's info: Name: " + dog2.getName() + "; Breed: " + dog2.getBreed());
        //Ask user input to update info:
        System.out.println("Please update Dog 2's info. ");
        System.out.println("Please update Dog 2's name: ");
        //variable to hold update info:
        String newDog2Name = scanner.next();
        System.out.println("Please update Dog 2's breed: ");
        //variable to hold update info:
        String newDog2Breed = scanner.next();
        //Update Dog 2's info using setter method. Remember to update before printing
        dog2.setName(newDog2Name);
        dog2.setBreed(newDog2Breed);

        //Display the update information
        System.out.println("Update Info: ");
        System.out.println("Dog 1's info: Name: " + dog1.getName() + "; Breed: " + dog1.getBreed());
        System.out.println("Dog 2's info: Name: " + dog2.getName() + "; Breed: " + dog2.getBreed());




    }
}
