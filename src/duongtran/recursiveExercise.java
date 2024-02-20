package duongtran;

import java.util.Scanner;

public class recursiveExercise {
    //EX 1:
    public static int calculateFactorial(int n) {
        //base case to exit the recursive from keep calling itself
        // factorial of 0 is 1
        if (n == 0) {
            return 1; //the code below would be 1
        }

        //System.out.println("Calculating factorial(" + n + ")"); //This line show how the code is executed
        //call itself. Remember moving toward base case
        //recursive (loop) from n down to 1
        return n * calculateFactorial(n - 1);

    }

    //EX 2:
    public static int sumFrom1toN(int n) {
        //base case to exit the recursive from keep calling itself

        if (n == 1) {
            return 1;
        }
        //recursive (loop) from n down to 1
        return n + sumFrom1toN(n - 1);
    }

    public static int sumFromAtoB(int a, int b) { //( a < b)
        //base case to exit the recursive from keep calling itself: End (b) equals Start (a) => then add  a
        if (a == b) {
            return a;
        }
        //recursive (loop) from b down to a
        return b + sumFromAtoB(a, b -1);

    }

    //EX 3: Find Fibonacci Number, given term
    public static int findFibonacciNumber (int term){
        //we don't really need to initialize counting variable in Recursive, we can just directly return
        //base case to exit the recursive from keep calling itself:
        // 1st term is 0 and 2nd term is 1
        if (term == 1){
            return 0;
        }
        if (term == 2) {
            return 1;
        }
        //recursive: //a number is equals to the sum of its 2 previous. aka n = (n-2) + (n-1). In this case, n = term
        return findFibonacciNumber(term-2) + findFibonacciNumber(term -1);
    }

    //Extra: Find Fibonacci terms, given numbers

    //Extra: Print Fibonacci sequences, store numbers as array element

    //Extra: Calculate Fibonacci sum up to Nth term

    //EX 4: Palindrome check
    public static boolean palindromeCheck(){
        return  true;
    }

    public static void main(String[] args) {
        //EX1: Calculate Factorial
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int n = scanner.nextInt();
//        System.out.println("The factorial of " + n + " is " + calculateFactorial(n));

        //EX2: Sum from 1 to N
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int n = scanner.nextInt();
//        System.out.println("The sum of all integers from 1 to " + n + " is " + sumFrom1toN(n));

        //Extra: Sum from A to B
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the first integer (must be smaller): ");
//        int a = scanner.nextInt();
//        System.out.println("Please enter the first integer (must be larger): ");
//        int b = scanner.nextInt();
//        System.out.println("The sum of all integers from " + a + " to " + b + " is " + sumFromAtoB(a,b));

//        //EX3:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the term :");
//        int term = scanner.nextInt();
//        System.out.println("The Fibonacci number at the " + term + " term is " + findFibonacciNumber(term));

        //EX4:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string :");
        String s = scanner.next();
        if(palindromeCheck()){
            System.out.println("The input String is a palindrome");
        }else {
            System.out.println("The input String is not a palindrome");
        }

    }



}

