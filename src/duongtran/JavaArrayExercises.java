package duongtran;

import java.util.Scanner;

public class JavaArrayExercises {
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

    public static void main(String[] args) {
        Ex1();
    }
}