package JavaExercisesPractice;
//NOTE: Even after you finished an exercise, please review other people's solutions and sample code.
// They might have a better approach that you can learn to improve your code

import java.util.Scanner;

public class methodExercises {
    public static void main(String[] args) {
//        //EX1 (Sample Code) Smallest Number
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

//        //EX3: Middle Character
//        //Write a Java method to display the middle character of a string.
//        //Note: a) If the length of the string is odd there will be two middle characters.
//        //b) If the length of the string is even there will be one middle character.
//        //Test Data:
//        //Input a string: 350
//        //Expected Output: 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a String: ");
//        String s = scanner.next();
//        System.out.println("The length of string " + s + " is: " + s.length());
//        System.out.println("The middle character of string " + s + " is " + middleCharacter(s));

//        //EX4: Count Vowels
//        //Write a Java method to count all the words in a string.
//        //Test Data:
//        //Input the string: The quick brown fox jumps over the lazy dog.
//        //Expected Output:
//        //
//        //Number of words in the string: 9
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Please enter a String: ");
//                String s = scanner.next();
//        System.out.println("The numbers of vowels inside string " + s + " is: " + countVowels(s));

        //EX 5: Words count
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String s = scanner.nextLine(); //let user input a string with spaces
        System.out.println("The input String \"" + s + "\"" + " has " + wordsCount(s) + " words" );


//        //EX 6: Sum of digits
//        //Write a Java method to compute the sum of digits in an integer.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int n = scanner.nextInt();
//        //display the result
//        System.out.println("The sum of digits of integer " + n + " is: " + digitSumMethod1(n));
//        System.out.println("The sum of digits of integer " + n + " is: " + digitSumMethod2(n));

        //EX 7: Pentagonal Numbers Sequence (can be done through recursive)

        //EX 8: Calculate investment value given interest rate (can be done through recursive)


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

    //EX3
    public static String middleCharacter(String s) {
        //must convert to String since char cannot hold 2 characters (even length case)
        String c = Character.toString(s.charAt(s.length() / 2));
        String d = "";
        String e;
        //odd String length: 1 middle character.(default case, outside the if conditional
//even String length: 2 middle character
        if (s.length() % 2 == 0) {
            d = Character.toString(s.charAt(s.length() / 2 - 1));

        }


        return e = d + c;
    }

    //EX4
    public static int countVowels(String s) {
        //initialize counting variable
        int totalVowels = 0;
        //store String's characters into array elements
        char[] charArray = s.toCharArray();

        //loop through the array (for loop)
        for (int i = 0; i < charArray.length; i++) {
            //if condition to update totalVowels +=
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') { //Vowels: a, e, i, o, u
                totalVowels += 1;
            }
        }

        return totalVowels;

    }

    //Ex5
    public static int wordsCount(String s){
        //initialize counting variable
        int count = 0;
        //1st approach:
        //Step 1: Split string by space " " => turn into new substring
        // Step 2: store those new substrings as element of a String [] stringArray
        String[] stringArray = s.split(" ");
        //troubleshoot
        // Step 3: Loop through array and update the count
        for (int i = 0; i < stringArray.length; i ++){
            count += 1;
        }
        return count;
    }

    //EX6
    public static int digitSumMethod1(int n) {
        //initialize counting variable
        int sum = 0;
        //convert integer into string
        String stringInt = Integer.toString(n);
        //store string character into an array
        char[] charArray = stringInt.toCharArray();
        //loop through array
        for (int i = 0; i < charArray.length; i++) {
            //*convert each element of array from char to int (getNumericValue)
            int a = Character.getNumericValue(charArray[i]);
            //update counting variable
            sum += a;
        }

        return sum;
    }
    public static int digitSumMethod2( int n){
        //initialize counting variable
        int sum = 0;
        //extract the last digits of n from the right with remainder division by 10, then add to the result for update
        //move the decimal places 1 place toward left by integer division by 10 then assign new division result to n
        //repeat the same process until all digits has been extracted and added to sum
        while (n > 0){ //condition to escape the loop: when all the digits has been extracted,
            // n only has 1 digit left, then n / 10 (integer division) = 0 (as n < 10),
            // then assign division result (0) to n. Now n = 0, which does not satisfy the condition (n must > 0)
            sum += n % 10;
            n /= 10;

        }
        return  sum;
    }

    //EX7
    public static int[] pentagonalNumbersSequence(int n){ //this can be solved using recursive
        //initialize array variable to hold numbers. "n" in the parameter is the term of sequence
        int []pentagonalNumbersSequence = {};

        return pentagonalNumbersSequence;
    }


}


