package duongtran;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class arrayExercises {
public static void Ex1(){
    //Requirement: Ask user to input an array. Print sum of element, average of element, error handling to user (wrong input)
    //get user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the length of your array: ");


    int arrayLength = scanner.nextInt();
    //check for invalid input: length of array must be positive integer
    try {
        int number = Integer.parseInt(String.valueOf(arrayLength));

    } catch (NumberFormatException e) {
        System.out.println("Invalid input: Not a valid integer.");
    }
    System.out.println("Please enter an array of integer (1 element per line)");
    //initialize array
    int[] array = new int[10];

    for (int i = 0; i < arrayLength; i++){
        array[i] = scanner.nextInt();
    }
    System.out.println("Your input array is: " );
    for (int i = 0; i < arrayLength; i++){
        System.out.println(array[i]);;
    }

    // given an array, print sum and average (1 d.p), User prompt, check for invalid input

    int elementSum = 0; // Initialize the sum variable outside the loop
    for( int num : array) { //for loop through each element
        elementSum += num;
    }
    System.out.println("Sum of all element is " + elementSum);
    //convert variable into double to get decimal parts
    double average =  ((double) elementSum) / ((double)arrayLength);

    System.out.println("The average of all element is " + average);
}
//Ex1 not yet done error handling
public static void Ex2(){
//Write a Java program to sort a numeric array and a string array.
    //both ascending and descending
        String[] stringArray = { "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"};
        int[] numericArray = {4334,33,2,66,78};
        //sort ascending order
     Arrays.sort(stringArray);
        System.out.println("Sorted Ascending stringArray: " + Arrays.toString(stringArray));
        Arrays.sort(numericArray);
        System.out.println ("Sorted Ascending numericArray: " + Arrays.toString(numericArray));
        //sort descending order
        Arrays.sort(stringArray, Collections.reverseOrder()); //this can be use for String[] as it is object
    // (reference datatype, but not for primitive datatype like int[]
        System.out.println("Sorted Descending stringArray: " + Arrays.toString(stringArray));
    //Implement a custom sorting algorithm for int[] arrays. => Reverse the ascending array
    //It works by swapping the elements from the beginning and the end of the array until they meet in the middle.
//Step 1: initialized array length
    int numericArrayLength = numericArray.length;
    //Step 2: Loop through the array until reaching the middle
    for (int i = 0; i< numericArrayLength/2; i++){
        //temporary variables to swap element
        int temp = numericArray[i];
        //swapping values between numericArray[i] and numericArray[numericArrayLength - 1 - i] while keep the middle index the same
        numericArray[i] //elements from the beginning
                = numericArray[numericArrayLength -1 - i];
        numericArray[numericArrayLength -1 - i] //element at the end
                = temp;
    }
        System.out.println("Sorted Descending numericArray: " + Arrays.toString(numericArray));
    }


    public static void main(String[] args) {
        //Ex1();
        //Ex2();
    }
}