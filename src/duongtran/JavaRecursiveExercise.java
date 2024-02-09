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
    public static void main(String[] args) {

//Ex1: Calculate factorial
        int n = 8;
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }
}
