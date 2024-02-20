package duongtran;

import java.sql.SQLOutput;
import java.util.Scanner;

public class methodExercises {
    public static void main(String[] args) {
//        //EX1 (Sample Code) Smalles Number
//        //main function: user input and display result
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        double a = in.nextDouble();
//        System.out.print("Input the Second number: ");
//        double b = in.nextDouble();
//        System.out.print("Input the third number: ");
//        double c = in.nextDouble();
//        System.out.print("The smallest value is " + smallest(a, b, c)+" " ); //print results and call the methods

//        //EX2: Average
//        //main function: user input and display result
//                Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the 1st number: ");
//                double a = scanner.nextDouble();
//        System.out.println("Please enter the 2nd number: ");
//        double b = scanner.nextDouble();
//        System.out.println("Please enter the 3rd number: ");
//        double c = scanner.nextDouble();
//        //display the results and call the method
//        System.out.println("The average of 3 numbers is: " + average(a,b,c));

        //EX3: Middle Character
        //Write a Java method to display the middle character of a string.
        //Note: a) If the length of the string is odd there will be two middle characters.
        //b) If the length of the string is even there will be one middle character.
        //Test Data:
        //Input a string: 350
        //Expected Output: 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String s = scanner.next();
        System.out.println("The length of string " + s + " is: " + s.length());
        System.out.println("The middle character of string " + s + " is " + middleCharacter(s));

        //EX4: Count Vowels

    }

    //EX1
    public static double smallest(double a, double b, double c) //method parameter that hold variables
    {
        return Math.min(Math.min(a, b), c); //method body
        //=> compare a with b, then compare with c
    }

    //EX2
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static String middleCharacter(String s) {
        String c = Character.toString(s.charAt(s.length() / 2));
        String d = "";
        String e;


        if (s.length() % 2 == 0) { //even String length: 2 middle character
            d = Character.toString(s.charAt(s.length() / 2 - 1));

        }
        //odd String length: 1 middle character

        System.out.println("d : " + d);
        return e = d + c;
    }

}


