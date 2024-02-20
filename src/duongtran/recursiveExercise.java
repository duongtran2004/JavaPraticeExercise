package duongtran;

import java.util.Scanner;

public class recursiveExercise {
    //EX 1:
    public static int calculateFactorial(int n) {
        int factorialProduct = 0;
        //base case to exit the recursive from keep calling itself
        // factorial of 0 is 1
        if (n == 0) {
            return 1; //the code below would be 1
        }

        System.out.println("Calculating factorial(" + n + ")");
        //call itself. Remember moving toward base case
        return n * calculateFactorial(n - 1);

    }
    //EX 2:
    public static int sumFrom1toN(int n){
        return 1;
    }
    public static int sumFromAtoB(int n){
        return 1;
    }

    public static void main(String[] args) {
        //EX1: Calculate Factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("The factorial of " + n + " is " + calculateFactorial(n));

        //EX2:

    }
}

