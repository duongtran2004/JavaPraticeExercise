package duongtran;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
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
        System.out.println("Method 1:");
        //Method 1: using for  loop
        for (int i = start; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

        }

        //Method 2: Using iterator object
        System.out.println("Method 2:");
        // set Iterator at specified index
        Iterator p = linkedList.listIterator(start);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
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

    public static void insertElementAtPositionN(LinkedList linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value/name of your element? ");
        String value = scanner.next();
        System.out.println("What is the index that you want to insert ? (Start from 0) : ");
        int index = scanner.nextInt();
        linkedList.add(index, value);
        System.out.println("New linkedList: " + linkedList);

    }

    public static void insetFirstAndLast(LinkedList linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value/name for your first element: ");
        String firstValue = scanner.next();
        System.out.println("Enter the value/name for your last element: ");
        String lastValue = scanner.next();
        //insert first
        linkedList.addFirst(firstValue);
        //insert last
        linkedList.addLast(lastValue);
        //print new linkedList
        System.out.println("New linkedList: " + linkedList);
    }

    public static void displayElementsAndPosition(LinkedList linkedList) {
        for (Object item : linkedList
        ) {
            System.out.println("Element: " + item + ", position: " + linkedList.indexOf(item));
        }
    }

    public static void removeElementByName(LinkedList<String> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the element you want to remove: ");
        String deleteThisElement = scanner.next();
        //loop through the linkedList and find the element name
        for (int i = 0; i < linkedList.size() ; i++) {
            if (linkedList.get(i).equals(deleteThisElement)) {
                linkedList.remove(i);
                //display the result if success
                System.out.println("Element is successfully removed !");
                System.out.println("New linkedList: " + linkedList);
                //escape the method
                return;
            }

        }
        //display the result if failed
        System.out.println("Element does not exist !");
    }

    public static void removeElementByIndex(LinkedList<String> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the index you want to remove: (start from 0):  ");
       int index = scanner.nextInt();
       //simply remove
        System.out.println("Removed element: " + linkedList.get(index));
        linkedList.remove(index);
        //display the result if failed
        System.out.println("New linkedList: " + linkedList);
    }

    public static void emptyALinkedList(LinkedList linkedList){
       //use for loop
        //use built-in method
        LinkedList copyLinkedList = (LinkedList) linkedList.clone();
        linkedList.removeAll(copyLinkedList);
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

//        //Ex 6:
//        insetFirstAndLast(colors);

//        //Ex 11: Display element and position
//        displayElementsAndPosition(colors);

//        //Ex 12: Remove elements:
//        removeElementByName(colors);
        removeElementByIndex(colors);

        //Ex 13: Empty a linked list
        emptyALinkedList(colors);




    }
}
