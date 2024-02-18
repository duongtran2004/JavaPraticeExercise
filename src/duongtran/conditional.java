package duongtran;

import java.util.Scanner;

public class conditional {
    public static void positiveOrNegative(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        double number = scanner.nextDouble();
        if (number == 0){
            System.out.println("The number is 0 which is neither positive or negative");
        } else if (number < 0) {
            System.out.println("The number is negative ");
        }
        else {
            System.out.println("The number is positive");
        }
    }
    public static void quadraticEquation(){
        //a*x^2 + b*x + c = 0


    }
    public static void main(String[] args) {
        positiveOrNegative();

    }
}
