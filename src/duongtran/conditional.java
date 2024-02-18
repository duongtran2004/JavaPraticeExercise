package duongtran;

import java.util.Scanner;
import java.text.DecimalFormat;

public class conditional {
    //after doing your own method, compare with the solutions to find the optimal way and improve your code

    public static void positiveOrNegative(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        double number = scanner.nextDouble();
        if (number == 0){
            System.out.println("The number is 0 which is neither positive or negative");
        } else if (number < 0) {
            System.out.println("The number is negative ");
        }
        else {
            System.out.println("The number is positive");
        }
    }
    public static void quadraticEquation(){
        //Format: a*x^2 + b*x + c = 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a: ");
        int a = scanner.nextInt();
        System.out.println("Please input b: ");
        int b = scanner.nextInt();
        System.out.println("Please input c: ");
        int c = scanner.nextInt();
        //Delta for cases of quadratic equation
        double delta = b*b - 4*a*c;
        System.out.println("Delta is : " + delta);
        //Case 1: Delta > 0: 2 distinct roots X1, X2
        if (delta > 0){
            //Quadratic formula:
            double rootX1 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println("Root X1: " + rootX1 );
            double rootX2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Root X2: " + rootX2 );
        } //Case 2: Delta = 0: Only 1 root X.
        else if (delta == 0) {
            double rootX = - (b/ (2*a));
            System.out.println("One double root: " + rootX);
        }
        //Case 2: Delta < 0: No real root
        else {
            System.out.println("There is no real root.");
        }


    }

    public static void printGreatestNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 different integers: ");
        System.out.println("Please input 1st integer: ");
        int a = scanner.nextInt();
        System.out.println("Please input 2nd integer: ");
        int b = scanner.nextInt();
        System.out.println("Please input 3rd integer: ");
        int c = scanner.nextInt();
        //method 1: Using if else conditional
        //initialize greatest number
        int greatest = 1;
        // a is greatest
        if (a > b && a > c) {
            greatest = a;
            System.out.println("The greatest is: " + greatest);
        } else if (b > a && b > c){
            greatest = b;
            System.out.println("The greatest is: " + greatest);
        } else if (c > a && c > b){
            greatest = c;
            System.out.println("The greatest is: " + greatest);
        }
        else {
            System.out.println("Your input is invalid. Either some numbers are the same or not integer !");
        }

    }

    public static void weekDays(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer from 1 to 7: ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                //remember to add "break" at the end of every case  block to escape the loop
                break;

        }
    }

    public static void compare3DecimalPlaces(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first floating point number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Please enter the second floating point number: ");
        double number2 = scanner.nextDouble();
        //You can not use DecimalFormat since it would round up the float numbers
        //and change its decimal places from the original
//        DecimalFormat df = new DecimalFormat("#.###");
//        float float1but3dps = Float.parseFloat(df.format(float1));
//        System.out.println(float1but3dps);
//        float float2but3dps = Float.parseFloat(df.format(float2));
//        System.out.println(float2but3dps);
        //Instead you should use Math.round and divide by 1000 to get 3 dps
// (1) First times x by 1000 (ex: 3.5544 => 3554.4;
        //(2) Then use Math.floor to always round down without changing original decimals (remove everything after decimal points).
        // Ex: 3554.4 => 3554
        //(3) Then divide by 1000 to get 3.dp.
        //Ex: 3554 => 3.554
        //You can re-declare and over-write a variable
        number1 = (Math.floor((number1 * 1000))) / 1000;
//        System.out.println(number1);
        number2 = (Math.floor((number2 * 1000))) / 1000;
//        System.out.println(number2);
        //compare
        if (number1 == number2){
            System.out.println("They are the same up to 3 decimal places");
        }
        else {
            System.out.println("They are different");
        }



    }
    public static void main(String[] args) {
        //positiveOrNegative();
        //quadraticEquation();
        //printGreatestNumber();
        //weekDays();
        compare3DecimalPlaces();

    }
}
