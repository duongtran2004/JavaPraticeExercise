package duongtran.ExceptionHandlingExercises;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    public static void oddNumberFilter(int a) throws OddNumberException {
        //handle the exception and return the message here, do not modify the main method
        //check the exception condition first, ALWAYS
        try {
            if (a % 2 != 0) {
                throw new OddNumberException("You cannot input an odd number !");
            }
            System.out.println("Input number " + a + " is even");
        } catch (OddNumberException oddNumberException) {
            System.out.println("Error: " + oddNumberException.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
//no need to create custom exception in this case, Java Library has already include it
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }

    public static void readFileFilterOutPositiveNumbers(String fileName) throws IOException {
        //initialize file object to store file Name
        //initialize reader object
        File file = new File(fileName);
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //scanner object to scan through the file
        Scanner scanner = new Scanner(file);
        //read characters of file, call exception when read positive number (char from 1 to 9)

        while (scanner.hasNextLine()) {
            char c = (char) bufferedReader.read();
            //exception condition
            if (Character.isDigit(c) && c != '0') {
                throw new PositiveNumbersException("Found positive numbers !");
            }
            System.out.println(c);
        }
        scanner.close();
        bufferedReader.close();


    }

    public static void cannotReadEmptyFile(String fileName) throws IOException {
        //create FileReader object => make sure the file address is correct
        FileReader fileReader = new FileReader(fileName);
        //create BufferReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //read content, remember to close buffer
        //initialize String value to store line
        String line;
        //initialize lineCount to check for empty file
        int lineCount = 0;
        //using while loop until readLine is null to read the whole file
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            lineCount += 1;
        }
        //exception condition
        if (lineCount == 0) {
            throw new EmptyFileException("The file is empty !");
        }

        bufferedReader.close();
    }


    public static void main(String[] args) throws IOException {
//        //EX1:
//        try {
//            int result = divideByZero(6, 0);
//            System.out.println("Result: " + result);
//        } catch (DivideBy0Exception divideBy0Exception) {
//            System.out.println("Error: " + divideBy0Exception.getMessage()); //getMessage() is inherit from the Throwable Class,
//            //now invoke the DivideBy0Exception constructor
//
//        }

//        //EX2
//        oddNumberFilter(7);

//        //Ex3:
//        try {
//
//            readFile("hello pe");
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("Error: " + fileNotFoundException.getMessage());
//        }
//    }

//        //EX 4:
//        //handle the exception locally inside the main method here, so no need to throw at the method signature
//        try {
//            readFileFilterOutPositiveNumbers("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\ExceptionHandlingExercises\\SampleFile.txt");
//
//        } catch (PositiveNumbersException positiveNumbersException) {
//            System.out.println("Error: " + positiveNumbersException.getMessage());
//        }
//
//    }

        //Ex 5:
        try {
            cannotReadEmptyFile("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\ExceptionHandlingExercises\\emptyFile.txt");
        } catch (EmptyFileException emptyFileException) {
            System.out.println("Error: " + emptyFileException.getMessage());
        }
    }
}
