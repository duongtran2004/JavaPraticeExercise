package duongtran;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class conditionalAndPatterns {
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
                System.out.println("Input letter " + letter + " is a consonant");
            }
        }
    }

    public static void naturalNumbersSequence() {
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
        int[] naturalNumbers = new int[n];
        //initialize sum of sequences
        int sum = 0;
        //print each number on separate lines
        System.out.println("The first " + n + " natural numbers are:  ");
        for (int i = 0; i < n; i++) {
            // Assign values starting from 1 to 'n'
            naturalNumbers[i] = i + 1;
            sum += i;
            System.out.println(i);
        }

        System.out.println("The Sum of Natural Number up to " + n + " terms : " + sum);
    }

    public static void cubeSequence() {
        //Test Data
        //Input number of terms : 4
        //Expected Output :
        //
        //Number is : 1 and cube of 1 is : 1
        //Number is : 2 and cube of 2 is : 8
        //Number is : 3 and cube of 3 is : 27
        //Number is : 4 and cube of 4 is : 64
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int term = scanner.nextInt();
        //initialize cube variable
        int cube = 0;
        //if we want to print multiple, separate lines, we should print inside the loop scope
        //for loop from 1 to n
        for (int i = 1; i < term; i++) {
            //update cube
            cube = i * i * i;
            System.out.println("Cube of " + i + " is " + cube);
        }
    }

    public static void multiplicationTable() {
        //Input number of terms : 5
        //Expected Output :
        //5 X 0 = 0
        //5 X 1 = 5
        //5 X 2 = 10
        //5 X 3 = 15
        //5 X 4 = 20
        //5 X 5 = 25
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int term = scanner.nextInt();
        //initialize product variable
        int product = 0;
        //print inside the loop
        //for loop from 0 to term
        for (int i = 0; i < term + 1; i++) {
            //update product
            product = term * i;
            //print the table
            System.out.println(term + " X " + i + " = " + product);
        }
    }

    public static void sumOfOddNaturalNumbers() {
        //Write a Java program that displays the sum of n odd natural numbers.
        //
        //Test Data
        //Input number of terms is: 5
        //Expected Output :
        //
        //The odd numbers are :
        //1
        //3
        //5
        //7
        //9
        //The Sum of odd Natural Number upto 5 terms is: 25
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int term = scanner.nextInt();
        //initialize sum
        int sum = 0;
        //print this line outside the loop to avoid duplication
        System.out.println("The odd numbers are :");
        //no need if else check for odd number, just update i += 2 to ignore the even and just get the odds
        for (int i = 1; i < term * 2; i += 2) {
            //update the sum
            sum += i;
            //print each odd numbers on separate lines
            System.out.println(i);
        }
        //print sum outside the loop to avoid duplication
        System.out.println("The Sum of Odd Natural Numbers up to " + term + " terms is: " + sum);
    }

    //PATTERN
    //Stars and shapes pattern
    public static void squarePattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //outer loop for columns (since we have to finish printing each line first then move to next line)
        //loop from 1 to n
        for (int i = 1; i <= n; i++) {
            //inner loop for rows (what we print for each row)
            //use different variables for inner loop (j instead of i)
            for (int j = 1; j <= n; j++) {
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print("* "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
    }

    //default increasing
    public static void increasingBottomLeftTrianglePatterns() {
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //outer loop for columns (since we have to finish printing each line first then move to next line)
        //loop from 1 to n
        for (int i = 1; i <= n; i++) {
            //inner loop for rows (what we print for each row)
            //use different variables for inner loop (j instead of i)
            //instead of looping from 1 to n, we should loop from 1 to i
            // The position number of rows (ex: 1st row => i = 1) also indicate how many stars to print
            //so j <= i for 2nd statement, inner loop
            for (int j = 1; j <= i; j++) {
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print("* "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
    }

    //default decreasing
    public static void decreasingTopLeftTrianglePatterns() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //outer loop for columns (since we have to finish printing each line first then move to next line)
        //loop from 1 to n
        for (int i = 1; i <= n; i++) {
            //inner loop for rows (what we print for each row)
            //use different variables for inner loop (j instead of i)
            // as number of row goes up, number of star decrease from n to 1 by 1 each time
            //how to decrease by 1 each time?
            // 1st row: loop from (j = i = 1) to (n = 5) inclusive (5 stars)
            // 2nd row: loop from (j = i = 2) to (n = 5) inclusive (4 stars)
            // 3rd row: loop from (j = i = 3) to (n = 5) inclusive (3 stars)
            // => loop from i to n
            for (int j = i; j <= n; j++) {
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print("* "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
    }

    public static void increasingBottomRightTrianglePatterns() {
        //now for each row, we have to print both whitespaces and star in the same rows => so:
        // (1) copy the inner loop for default increasing or decreasing
        // ( 2)print spaces and star both inside the outer loop, but each have its own separate loop
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //default outer loop that move to the next line after finish printing a row
        for (int i = 1; i <= n; i++) {
            //inside the outer loop
            //decreasing white spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  "); //same number of characters (2) for each inner loop
            }
            //increasing patterns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); //remember whitespace. //same number of characters (2) for each inner loop
            }
            System.out.println(); //remember println() for outer loop to move to the next line
        }
    }

    public static void decreasingTopRightTrianglePatterns() {
        // increasing spaces and decreasing patterns
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //default outer loop that move to the next line after finish printing a row
        for (int i = 1; i <= n; i++) {
            //increasing spaces

            for (int j = 1; j <= i; j++) {
                System.out.print("  "); //remember whitespace. //same number of characters (2) for each inner loop
            }
            //decreasing patterns
            for (int j = i; j <= n; j++) {
                System.out.print("* "); //same number of characters (2) for each inner loop
            }
            System.out.println();
        }
    }

    public static void pyramidPatterns() {
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //pyramidPatterns 's outer loop
        for (int i = 1; i <= n; i++) {
            //inside the outer loop
            //bottom right first
            //decreasing white spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  "); //same number of characters (2) for each inner loop
            }
            //increasing patterns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); //remember whitespace. //same number of characters (2) for each inner loop
            }
            //please remove the println() over here so the 2 triangles stay on the same line to create Pyramid
            //finish bottom right
            // Then bottom left second
            for (int j = 1; j < i; j++) {
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print("* "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
        //=> Please note that our pyramid does not have peak due to 1 extra columns at the middle (we have 2 but only need 1)
        // we can fix this by delete any (j<i)
    }

    public static void reversePyramidPatterns() {
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        // reversePyramid's outer loop to move to next line
        for (int i = 1; i <= n; i++) {
            //inner loops:
            // top right + top left. Please remove 1 extra column.
            //print top right first
            for (int j = 1; j <= i; j++) {
                System.out.print("  "); //remember whitespace. //same number of characters (2) for each inner loop
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* "); //same number of characters (2) for each inner loop
            }
            //then print top left
            for (int j = i; j < n; j++) {
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print("* "); //remember whitespace
            }

            System.out.println(); //outer loop's println()
        }
    }

    public static void diamondPatterns() {
        //Pyramid + Reverse Pyramid
        // We need 2, independent outer rows for each pyramid
        // And remove 1 extra rows so we can have side-peaks
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //diamondPatterns does not have unique outer loop
        //2 outer  loops: Pyramid + Reverse Pyramid
        //PRINT PYRAMID FIRST
//pyramidPatterns 's outer loop
        for (int i = 1; i < n; i++) {
            //inside the outer loop
            //bottom right first
            //decreasing white spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  "); //same number of characters (2) for each inner loop
            }
            //increasing patterns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); //remember whitespace. //same number of characters (2) for each inner loop
            }
            //please remove the println() over here so the 2 triangles stay on the same line to create Pyramid
            //finish bottom right
            // Then bottom left second
            for (int j = 1; j < i; j++) {
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print("* "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
        //THEN PRINT REVERSE PYRAMID
        // reversePyramid's outer loop to move to next line
        for (int i = 1; i <= n; i++) {
            //inner loops:
            // top right + top left. Please remove 1 extra column.
            //print top right first
            for (int j = 1; j <= i; j++) {
                System.out.print("  "); //remember whitespace. //same number of characters (2) for each inner loop
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* "); //same number of characters (2) for each inner loop
            }
            //then print top left
            for (int j = i; j < n; j++) {
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print("* "); //remember whitespace
            }

            System.out.println(); //outer loop's println()
        }

    }

    //THEN REMOVE 1 EXTRA ROW (2ND STATEMENT OF 1 OF THE 2 OUTER LOOPS)
    //Numbers pattern
    //how to solve any number patterns program in Java
    //https://www.youtube.com/watch?v=uyu_jf01a74
// DONT TOO FOCUS ON SHAPE, BUT RATHER FOCUS ON DIFFERENT TYPES OF CHANGING NUMBERS
    //Note: Java execute code of the inner loop first, then move to outer loop. It also print each line first, then move to the next line
    //Outer loop: decide columns
    //Inner loop: deciding rows
    // p at outer loop : similar rows, but different columns
    // p at inner loop: different rows, but similar columns
    public static void incrementDifferentRowsBottomLeftNumberPatterns() {
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //copy code from shape methods you created above
        //remember: separate the generation of shapes and numbers by creating a new variable to hold numbers in 1st and 3rd statement of outer loop.
        //Also print p in inner loop
        //outer loop for columns (since we have to finish printing each line first then move to next line)
        //loop from 1 to n
        for (int i = 1; i <= n; i++) {
            //inner loop for rows (what we print for each row)
            //use different variables for inner loop (j instead of i)
            //instead of looping from 1 to n, we should loop from 1 to i
            // The position number of rows (ex: 1st row => i = 1) also indicate how many stars to print
            //so j <= i for 2nd statement, inner loop
            for (int j = 1, p = 1; j <= i; j++, p++) { //create p variable to hold numbers
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print(p + " "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
    }

    public static void incrementSimilarRowsBottomLeftNumberPatterns() {
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //copy code from shape methods you created above
        //remember: separate the generation of shapes and numbers by creating a new variable to hold numbers in 1st and 3rd statement of outer loop.
        //Also print p in inner loop
        //outer loop for columns (since we have to finish printing each line first then move to next line)
        //loop from 1 to n
        for (int i = 1, p = 1; i <= n; i++, p++) {
            //inner loop for rows (what we print for each row)
            //use different variables for inner loop (j instead of i)
            //instead of looping from 1 to n, we should loop from 1 to i
            // The position number of rows (ex: 1st row => i = 1) also indicate how many stars to print
            //so j <= i for 2nd statement, inner loop
            for (int j = 1; j <= i; j++) { //create p variable to hold numbers
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print(p + " "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
    }

    public static void decrementSimilarRowsBottomLeftNumberPatterns() {
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //copy code from shape methods you created above
        //remember: separate the generation of shapes and numbers by creating a new variable to hold numbers in 1st and 3rd statement of outer loop.
        //Also print p in inner loop
        //outer loop for columns (since we have to finish printing each line first then move to next line)
        //loop from n to 1 for both i (columns) and p (numbers)
        for (int i = n, p = n; i >= 1; i--, p--) {
            //inner loop for rows (what we print for each row)
            //use different variables for inner loop (j instead of i)
            //instead of looping from 1 to n, we should loop from 1 to i
            // The position number of rows (ex: 1st row => i = 1) also indicate how many stars to print
            //so j <= i for 2nd statement, inner loop
            for (int j = 1; j <= i; j++) { //create p variable to hold numbers
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print(p + " "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
    }


    public static void decrementDifferentRowsBottomLeftNumberPatterns() {
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = scanner.nextInt();
        //copy code from shape methods you created above
        //remember: separate the generation of shapes and numbers by creating a new variable to hold numbers in 1st and 3rd statement of outer loop.
        //Also print p in inner loop
        //outer loop for columns (since we have to finish printing each line first then move to next line)
        //loop from n to 1 for both i (columns, outer loops) and p (numbers, changed, inner loop)
        for (int i = n; i >= 1; i--) {
            //inner loop for rows (what we print for each row)
            //use different variables for inner loop (j instead of i)
            //instead of looping from 1 to n, we should loop from 1 to i
            // The position number of rows (ex: 1st row => i = 1) also indicate how many stars to print
            //so j <= i for 2nd statement, inner loop
            for (int j = 1, p = n; j <= i; j++, p--) { //create p variable to hold numbers
                //use print(), not println() since we want to print everything all on the same line (cursor unchanged)
                System.out.print(p + " "); //remember whitespace
            }
            System.out.println(); //remember to print() at the outer loop to move to next line after finish printing each line
        }
    }
    //ALTERNATE NUMBER
    //INCLUDE IF-ELSE CONDITIONAL INSIDE FOR LOOP


    public static void main(String[] args) {
        //positiveOrNegative();
        //quadraticEquation();
        //printGreatestNumber();
        //weekDays();
        //compare3DecimalPlaces();
        //numberOfDaysInMonth();
        //vowelOrConsonantCheck();
        //naturalNumbersSequence();
        //cubeSequence();
        //multiplicationTable();
        //sumOfOddNaturalNumbers();
//up to exercise 15
        //PATTERN
        //SHAPE PATTERNS
        //squarePattern();
        // 2 basic pattern: decreasingTriangle and increasingTriangle. 2 main items of printing: whitespace or pattern (can be #, $, * )
        //increasingBottomLeftTrianglePatterns();
        //decreasingTopLeftTrianglePatterns();
        //increasingBottomRightTrianglePatterns();
        //decreasingTopRightTrianglePatterns();
        //pyramidPatterns();
        //reversePyramidPatterns();
        //diamondPatterns();

        //NUMBERS PATTERNS
        // numbers patterns are consist of 2 parts: shape and numbers. Try to separate these 2 parts to reduce chances of error
        //incrementSimilarRowsBottomLeftNumberPatterns();
        //incrementDifferentRowsBottomLeftNumberPatterns();
        //decrementSimilarRowsBottomLeftNumberPatterns();
        //decrementDifferentRowsBottomLeftNumberPatterns();
        //alternate number

        //BACK TO JAVA EXERCISES
    }

}
