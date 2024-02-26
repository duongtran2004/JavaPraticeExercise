package duongtran;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedListExercises {
    public static void appendAtEnd(LinkedList linkedList) {
        linkedList.addLast("brown");
    }

    public static void loopThroughAllElements(LinkedList linkedList) {
        for (Object item :
                linkedList
        ) {
            System.out.println(item);
        }
    }

    public static void loopThroughAllElementsStartFromN(LinkedList linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter starting position (begin at 0): ");
        int start = scanner.nextInt();
        //using for  loop
        for (int i = start; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

        }
    }

    public static void reverseLinkedList(LinkedList linkedList) {
        //create another linkedList to store the reversed element
        LinkedList reversedLinkedList = new LinkedList<>();
        //call the Iterator objects (Iterator class let me traverse through element (aka objects) of data sets like array, arrayList, etc)
        Iterator descendingIterator = linkedList.descendingIterator();
        // Iterate through the elements using the descending iterator
        while (descendingIterator.hasNext()) {
            //add the reversed element to the reversedLinkedList
            reversedLinkedList.add(descendingIterator.next()); //.next() advance iterator to the next object
        }
        //print the result
        System.out.println("The reversed linkedList is : " + reversedLinkedList);
    }

    public static void insertElementAtPositionN(LinkedList linkedList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value/name of your element? ");
        String value = scanner.next();
        System.out.println("What is the index that you want to insert ? (Start from 0) : ");
        int index = scanner.nextInt();
        linkedList.add(index, value);
        System.out.println("New linkedList: " + linkedList);

    }

    public static void main(String[] args) {
        //sample liked list
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("black");
        colors.add("green");
        colors.add("yellow");
        colors.add("blue");
        colors.add("red");
        System.out.println(colors);

//        //Ex1:
//        appendAtEnd(colors);
//        System.out.println(colors);

        //Ex2: loop thorough all elements and print on individual lines (bad practice for linkedList)
        //loopThroughAllElements(colors);

        //Ex3: loop thorough all elements and print on individual lines but start at specific position
        //loopThroughAllElementsStartFromN(colors);

        //Ex4:
        //reverseLinkedList(colors);

//        //Ex5: Insert element at position N
//        insertElementAtPositionN(colors);

        //Ex 6:



    }
}
