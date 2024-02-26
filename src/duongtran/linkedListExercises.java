package duongtran;

import java.util.LinkedList;

public class linkedListExercises {
    public static void appendAtEnd(LinkedList linkedList){
        linkedList.addLast("brown");
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
        //Ex1:
        appendAtEnd(colors);
        System.out.println(colors);
        //Ex2:


    }
}
