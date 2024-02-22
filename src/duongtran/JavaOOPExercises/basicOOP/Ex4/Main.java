package duongtran.JavaOOPExercises.basicOOP.Ex4;

import duongtran.JavaOOPExercises.basicOOP.Ex3.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creat Circle object
        Circle circle = new Circle(0);

        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle's radius: ");
        circle.setRadius(scanner.nextDouble());

        //calculate the result

        double area = circle.radius * circle.radius * Math.PI;
        double circumference = circle.radius * 2 * Math.PI;
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);


    }
}
