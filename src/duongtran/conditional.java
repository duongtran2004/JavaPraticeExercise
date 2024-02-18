package duongtran;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class conditional {
    //after doing your own method, compare with the solutions to find the optimal way and improve your code

    public static void positiveOrNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        double number = scanner.nextDouble();
        if (number == 0) {
            System.out.println("The number is 0 which is neither positive or negative");
        } else if (number < 0) {
            System.out.println("The number is negative ");
        } else {
            System.out.println("The number is positive");
        }
    }

    public static void quadraticEquation() {
        //Format: a*x^2 + b*x + c = 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a: ");
        int a = scanner.nextInt();
        System.out.println("Please input b: ");
        int b = scanner.nextInt();
        System.out.println("Please input c: ");
        int c = scanner.nextInt();
        //Delta for cases of quadratic equation
        double delta = b * b - 4 * a * c;
        System.out.println("Delta is : " + delta);
        //Case 1: Delta > 0: 2 distinct roots X1, X2
        if (delta > 0) {
            //Quadratic formula:
            double rootX1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Root X1: " + rootX1);
            double rootX2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root X2: " + rootX2);
        } //Case 2: Delta = 0: Only 1 root X.
        else if (delta == 0) {
            double rootX = -(b / (2 * a));
            System.out.println("One double root: " + rootX);
        }
        //Case 2: Delta < 0: No real root
        else {
            System.out.println("There is no real root.");
        }


    }

    public static void printGreatestNumber() {
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
        } else if (b > a && b > c) {
            greatest = b;
            System.out.println("The greatest is: " + greatest);
        } else if (c > a && c > b) {
            greatest = c;
            System.out.println("The greatest is: " + greatest);
        } else {
            System.out.println("Your input is invalid. Either some numbers are the same or not integer !");
        }

    }

    public static void weekDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer from 1 to 7: ");
        int day = scanner.nextInt();
        switch (day) {
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

    public static void compare3DecimalPlaces() {
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
        if (number1 == number2) {
            System.out.println("They are the same up to 3 decimal places");
        } else {
            System.out.println("They are different");
        }


    }

    public static void numberOfDaysInMonth() {
        //Test Data
        //Input a month number: 2
        //Input a year: 2016
        //Expected Output :
        //February 2016 has 29 days
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a month number");
        int month = scanner.nextInt();
        System.out.println("Input a year:");
        int year = scanner.nextInt();
        //convert number months to text month
        //initialize text months
        String textMonth = "";
        switch (month) {
            case 1:
                textMonth = "January";
                break;
            case 2:
                textMonth = "February";
                break;
            case 3:
                textMonth = "March";
                break;
            case 4:
                textMonth = "April";
                break;
            case 5:
                textMonth = "May";
                break;
            case 6:
                textMonth = "June";
                break;
            case 7:
                textMonth = "July";
                //remember to add "break" at the end of every case  block to escape the loop
                break;
            case 8:
                textMonth = "August";
                break;
            case 9:
                textMonth = "September";
                break;
            case 10:
                textMonth = "October";
                break;
            case 11:
                textMonth = "November";
                break;
            case 12:
                textMonth = "December";
                break;

        }
        //initialize day
        int day = 1;
        //initialize isLeapYear. Default is false.
        boolean isLeapYear = false;
        //year check
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        //console log isLeapYear for debugging
        System.out.println("Leap Year: " + isLeapYear);
        //month check
        //if Feb, leap year  (29) or normal year (28)
        if (month == 2) {
            if (isLeapYear = true) {
                day = 29;
                System.out.println(textMonth + " " + year + " has " + day + " days");
            } else {
                day = 28;
                System.out.println(textMonth + " " + year + " has " + day + " days");
            }
        }
        //January, March, May, July, August, October, and December: 31 days
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = 31;
            System.out.println(textMonth + " " + year + " has " + day + " days");
        }
        //other: 30 days
        else {
            day = 30;
            System.out.println(textMonth + " " + year + " has " + day + " days");
        }


    }

    public static void vowelOrConsonantCheck() {
        // Write a Java program that requires the user to enter a single character from the alphabet.
        // Print Vowel or Consonant, depending on user input.
        // If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
        //Test Data
        //Input an alphabet: p
        //Expected Output :
        //Input letter is Consonant
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a letter in the alphabet: ");
        char letter = scanner.next().charAt(0); //only take 1st letter from user input

//check for user's invalid input and return error messages
        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input !");
        } else {
            //initialize isVowel. Default is false (Consonant)
            boolean isVowel = false;
            //Vowels: a, e, i, o, u,
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                isVowel = true;
                System.out.println("Input letter " + letter + " is a vowel");

            } else {
                isVowel = false;
                System.out.println("Input letter " + letter + " is a consonant" );
            }
        }
    }

    public static void naturalNumbersSequence(){
        //Write a Java program to display n terms of natural numbers and their sum.
        //
        //Test Data
        //Input the number: 2
        //Expected Output :
        //
        //Input number:
        //2
        //The first n natural numbers are :
        //2
        //1
        //2
        //The Sum of Natural Number upto n terms :
        //23
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Nth term number:");
        int n = scanner.nextInt();
        //initialize the array with size 'n
        int [] naturalNumbers = new int[n];
        //initialize sum of sequences
        int sum = 0;
        //print each number on separate lines
        System.out.println("The first " + n + " natural numbers are:  " );
        for (int i = 0; i < n; i ++ ){
            // Assign values starting from 1 to 'n'
            naturalNumbers[i] = i + 1 ;
            sum += i;
            System.out.println(i);
        }

        System.out.println("The Sum of Natural Number up to "+n+ " terms : " +sum) ;
    }

    public static void cubeSequence(){}
    public static void main(String[] args) {
        //positiveOrNegative();
        //quadraticEquation();
        //printGreatestNumber();
        //weekDays();
        //compare3DecimalPlaces();
        //numberOfDaysInMonth();
        //vowelOrConsonantCheck();
        //naturalNumbersSequence();
        cubeSequence();
    }

}
