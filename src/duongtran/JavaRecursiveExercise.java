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
    public static int Fibonacci(int n){
        //Requirement: given the nth term, calculate the Fibonacci numbers (print all of them)
        //base case to exit the loop, prevent stackoverflow
        if (n == 1 ){
            return 0; // The 1st term of Fibonacci sequences is 0
        } else if (n == 2) {
            return 1; // The 2nd term of Fibonacci sequences is 1
        }
        else {
            //In Fibonacci Sequences, a number is sum of its previous 2 term
            return Fibonacci(n -1 ) + Fibonacci(n-2);
        }
        //Find Fibonacci number
        // print all fibonnaci sequences
        // sum of all fibonacci squences
        // give number, find index
    }




    public static void main(String[] args) {

////Ex1: Calculate factorial
//        int n = 8;
//        int result = factorial(n);
//        System.out.println("The factorial of " + n + " is " + result);
//        //end of Ex1
//        //Ex2: Sum of all numbers up to n
//        int n = 9;
//        int result = sumUpToN(n);
//        System.out.println("The sum of all integers from 1 to  " + n + " is " + result);
//        //end of Ex1

//        Start of Ex2
//        //Ex2: Printing Fibonacci Sequences's number's value up to Nth term
//        int n = 20;
//       int result = Fibonacci(n);
//
//
//       // now improve its functionalities: return the correct term string: 1st, 2nd, 3rd, or th
//        //Note for special case: 11 (th), 12 (th), 13(th) => required Second Last Digits
//        //Step 1: Convert int n to String
//        String convertedString = Integer.toString(n);
//        //Step 2: Get the last element from converted String (last digit)
//        String lastDigits = convertedString.substring(convertedString.length() - 1);
//        //Step 3: Get the second-last element from converted String (second-last digit)
//        String secondLastDigits = "0"; //default = 0 if string length is 1
//        if (convertedString.length() >= 2){ //if string length is larger than 1, filt out special case like 11,12,13 (all th)
//            // by getting the second last digit
//     secondLastDigits = convertedString.substring(convertedString.length() - 2, convertedString.length() - 1);}
//        //Step 4: Conditions to evaluate last digits: 1st, 2nd, 3rd, special case (11,12,13) and th
//        if (lastDigits.equals("1") && !secondLastDigits.equals("1")){ //note that please compare lastDigits with String Literal "1" instead of integer 1
//            // as .equals() require both value and datatype to be the same in order to be correct.
//            //Otherwise, it would be false and pass the conditions to the next else if block
//            System.out.println("The Fibonacci sequences up to " + n + "st term is " + result);
//        } else if (lastDigits.equals("2") && !secondLastDigits.equals("1")) {
//            System.out.println("The Fibonacci sequences up to " + n + "nd term is " + result);
//        } else if (lastDigits.equals("3")  && !secondLastDigits.equals("1'")){
//            System.out.println("The Fibonacci sequences up to " + n + "rd term is " + result);
//        }
//        else { System.out.println("The Fibonacci sequences up to " + n + "th term is " + result);
//           ;
//        }
//        //end of Ex2

//        //Start of Ex3

//        //End of Ex3

        //Start of Ex4
        //Exercise 4: Print the Fibonacci Sum up th Nth Term
// End of Ex4

    }
}
