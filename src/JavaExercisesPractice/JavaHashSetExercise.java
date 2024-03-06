package JavaExercisesPractice;

import java.util.*;

/**
 * @author Tran Dang Duong
 * @version ${11.0.18}
 * @created 06-Mar-24 2:14 PM
 * @project arrayExercises.java
 * @since ${11.0.18}
 */
public class JavaHashSetExercise {
    public static void printAllElementUsingForEach(HashSet<Integer> hashSet) {
        for (Integer n : hashSet
        ) {
            System.out.println(n);
        }

    }

    public static void printAllElementUsingIterator(HashSet<Integer> hashSet) {
        //call iterator object
        Iterator<Integer> iterator = hashSet.iterator();
        //iterate the hash set using while loop
        while (iterator.hasNext()) { //next element sill exist
            System.out.println(iterator.next());
        }

    }

    public static void deleteAllElement(HashSet<Integer> hashSet) {
        hashSet.removeAll(hashSet);
        System.out.println("New HashSet is: " + hashSet);
    }

    public static void countHashSetElements(HashSet<Integer> hashSet) {
        int count = 0;
        for (Integer n : hashSet
        ) {
            count++;
        }
        System.out.println("Total number of element in the HashSet is: " + count);
    }

    public static void checkForEmptyHashSet(HashSet hashSet) {
        //call iterator object
        Iterator<Integer> iterator = hashSet.iterator();
        if (iterator.hasNext() == false) {
            System.out.println("The HashSet is  empty !");
        } else {
            System.out.println("The HashSet is not empty !");
        }
    }

    public static void cloneHashSet(HashSet hashSet) {
        HashSet<Integer> newHashSet = (HashSet<Integer>) hashSet.clone();
        ;

        System.out.println("New HashSet is: " + newHashSet);

    }

    public static void convertHashSetToArray(HashSet hashSet) {
        Object[] newArray = hashSet.toArray();
        System.out.println("New Array is: " + Arrays.toString(newArray));


    }

    public static void convertHashSetToTreeSet(HashSet hashSet) {
        TreeSet<Integer> newTreeSet = hashSet.t
        System.out.println("New Array is: " + newTreeSet);


    }

    public static void main(String[] args) {
        //create a HashSet, remember to use Wrapper Class to convert integer to Object and pass to HashSet parameters.
        HashSet<Integer> integerNumbers = new HashSet<Integer>(10);
        //add elements into HashSet
        integerNumbers.add(7);
        integerNumbers.add(0);
        integerNumbers.add(null);
        integerNumbers.add(1);
        integerNumbers.add(0); //this won't work as HashSet does not allow duplication
        integerNumbers.add(8);
        //print the HashSet
        System.out.println("Original HashSet: " + integerNumbers);

        //Call methods
//printAllElementUsingForEach(integerNumbers);
        // printAllElementUsingIterator(integerNumbers);
        //deleteAllElement(integerNumbers);
        //countHashSetElements(integerNumbers);
        //checkForEmptyHashSet(integerNumbers);
        //cloneHashSet(integerNumbers);
        convertHashSetToArray(integerNumbers);


    }
}
