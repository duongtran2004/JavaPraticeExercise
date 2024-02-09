package duongtran;

public class JavaRecursiveExercise {
    public static int factorial(int n) { //pass int n to method parameter
        //Requirement: Factorial
        //base case to exit the loop, prevent stackoverflow
        if (n == 1 || n == 0) { //factorial of 1 or 0 is 1
            return 1;
        } else {
            //what you want the recursive to do
            return n * factorial(n - 1);
        }
    }
    public static int sumUpToN(int n){
        //Requirement: calculate sum of all numbers from 1 to n
        //base case to exit the loop, prevent stackoverflow
        if (n == 1){ // sum of all number from 1 to 1 is 1
        return 1;} else {
            return n + sumUpToN(n -1); //add everything from n to 1 (descending)
        }
    }

    public static void main(String[] args) {

////Ex1: Calculate factorial
//        int n = 8;
//        int result = factorial(n);
//        System.out.println("The factorial of " + n + " is " + result);
//        //end of Ex1
        //Ex2: Sum of all numbers up to n
        int n = 9;
        int result = sumUpToN(n);
        System.out.println("The sum of all integers from 1 to  " + n + " is " + result);
    }
}
