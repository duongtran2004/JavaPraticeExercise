package JavaExercisesPractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Tran Dang Duong
 * Student ID: s3979381
 * @version ${11.0.18}
 * @created 04-Apr-24 9:27 AM
 * @project JavaPracticeExercises.java
 * @since ${11.0.18}
 */
public class JavaStreamExercises {
    public static void calculateAverage() {
        //Write a Java program to calculate the average of a list of integers using streams.
        //declare a list of integer
        List<Integer> integersList = Arrays.asList(1, 4, 5, 7, 8, 16);
        //calculate average
        double average = integersList.stream()
                .mapToDouble(Integer::doubleValue)//This method maps each Integer element in the stream to its corresponding double value. It converts the stream of Integers into a stream of Doubles. This is necessary because the average() method operates on a stream of primitive doubles (DoubleStream).
                .average()
                .orElse(0.0);

        System.out.println("The integers are: " + integersList);
        System.out.println("The average is: " + average);


    }

    public static void upCaseAndDownCase() {
        //a sample list of String
        List<String> sampleListOfStrings = Arrays.asList("Hello", "heNho");
        List<String> upperCaseListOfString = sampleListOfStrings.stream()
                .map(String::toUpperCase) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect the result into a list
        List<String> lowerCaseListOfString = sampleListOfStrings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());


        //display the results
        System.out.println("Original list of String" + sampleListOfStrings);
        System.out.println("Uppercase list of String" + upperCaseListOfString);
        System.out.println("Lowercase list of String" + lowerCaseListOfString);
    }

    public static void main(String[] args) {
        //calculateAverage();
        upCaseAndDownCase();

    }
}
