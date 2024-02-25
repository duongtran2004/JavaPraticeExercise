package duongtran.ExceptionHandlingExercises;

public class ExceptionHandlingMain {
    //return error message to user
    //try-catch-throw-rethrow
    //customize exceptions

    //Ex1: Divide by 0
    //declare that divideByZero method might throws DivideBy0Exception
    //transfer the responsible to handle exception to the calling method (main)
    public static int divideByZero(int a, int b) throws DivideBy0Exception {
        //method 1: using throws (method declaration) and throw (inside method body)
//always checking for exception condition first, so you can call custom exceptions before executing the code
        if (b == 0) {
            throw new DivideBy0Exception("You cannot divide by 0 !");
        }
        int c = a / b;
        return c;

        //actually inside the DivideBy0 method, it is more useful to use throw, then try catch block at the main()
//        //method 2: using try-catch blocks
//
//        try {
//            if (b == 0) {
//                throw new DivideBy0Exception("You cannot divide by 0 !");
//            }
//            return a / b;
//        } catch (DivideBy0Exception e) {
//            // Handle the custom exception (e.g., log, print, or perform other actions)
//            System.err.println("Error: " + e.getMessage());
//            return -1; // or some default value indicating an error
//        }
    }

    public static void main(String[] args) {
try{
    int result =      divideByZero(6, 0);
    System.out.println("Result: " + result);
}catch (DivideBy0Exception divideBy0Exception){
    System.out.println("Error: " + divideBy0Exception.getMessage()); //getMessage() is inherit from the Throwable Class,
    //now invoke the DivideBy0Exception constructor

}

    }
}
