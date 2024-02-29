package JavaExercisesPractice;

import java.util.Scanner;

public class stringExercises {
    public static void retrieveCharacterByIndex(){
        //Write a Java program to get the character at the given index within the string.
        //
        //Sample Output:
        //
        //Original String = Java Exercises!
        //The character at position 0 is J
        //The character at position 10 is i
        //default user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input = scanner.next();
        System.out.println("Please enter the index of character that you want to retrieve: ");
        int index = scanner.nextInt();
        char c = input.charAt(index);
        System.out.println("Original String: " + input);
        System.out.println("The character at position " + index + " is " + c);

    }
    public static void compareStringContent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st String: ");
        String string1 = scanner.next();
        System.out.println("Please enter 2nd String: ");
        String string2 = scanner.next();
        boolean similarContent = false;
        if (string1.equals(string2)){
            similarContent = true;
        }
        if (similarContent = true){
            System.out.println("The 2 strings' content are similar");
        } else {
            System.out.println("The 2 strings' content are similar");
        }
    }
    public static void concatString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st String: ");
        String string1 = scanner.next();
        System.out.println("Please enter 2nd String: ");
        String string2 = scanner.next();
        String newString = string1.concat(string2);
        System.out.println("The new string is: " + newString);
    }
    public static void subStringCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Original String: ");
        String original = scanner.next();
        System.out.println("Please enter subString to check: ");
        String sub = scanner.next();
        if(original.contains(sub)){
            System.out.println("String " + sub + " is" + " a substring of " + original );
        } else {
            System.out.println("String " + sub + " is NOT" + " a substring of " + original );
        }
    }
    public static void main(String[] args) {
//retrieveCharacterByIndex();
        //compareStringContent();
        //concatString();
        subStringCheck();
    }
}
