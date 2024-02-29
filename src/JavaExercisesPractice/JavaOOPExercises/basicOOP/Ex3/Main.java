package JavaExercisesPractice.JavaOOPExercises.basicOOP.Ex3;
//Write a Java program to create a class called "Rectangle" with width and height attributes.
// Calculate the area and perimeter of the rectangle.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create Rectangle object
        Rectangle rectangle = new Rectangle(0,0);
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter rectangle's width: ");
        rectangle.setWidth(scanner.nextDouble());
        System.out.println("Please enter rectangle's width: ");
        rectangle.setHeight(scanner.nextDouble());
        //calculate the result
        double perimeter = (rectangle.width + rectangle.height) * 2;
        double area = rectangle.width * rectangle.height;
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        //display the result

    }
}
