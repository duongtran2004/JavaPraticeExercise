package duongtran.JavaInterfaceExercises.Ex1;
// Write a Java program to create an interface Shape with the getArea() method.
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
// Implement the getArea() method for each of the three classes.
public class Main {
    public static void main(String[] args) {
        //create object of each shape and populate data
        //Circle
        Circle c1 = new Circle(6);
        Triangle t1 = new Triangle(8,26);
        Rectangle r1 = new Rectangle(7,8);
        System.out.println("Area of Circle is: " + c1.getArea());
        System.out.println("Area of Rectangle is: " + r1.getArea());
        System.out.println("Area of Triangle is: " + t1.getArea());

    }
}
