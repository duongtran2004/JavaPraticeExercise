package duongtran;

import java.util.Scanner;

public class dataTypes {
    public static void temperatureConverter(){

        System.out.println("Input a degree in Fahrenheit:");
        Scanner scanner = new Scanner(System.in);
       double  f = scanner.nextDouble();
       double c = (f -32) / 1.8;
        System.out.println(f + " degree Fahrenheit is equal to " + c  + " degree in Celsius");

    }
    public static void lengthConverter(){
        System.out.println("Input a value for inch: ");
        Scanner scanner = new Scanner(System.in);
        double  inch = scanner.nextDouble();
        double meter = inch  * 0.0254;
        System.out.println(inch + " inch is equal to " + meter  + " meters");
    }
    public static void convertMinutesToYearsAndDays(){
        System.out.println("Please enter number of minutes (must be integer): ");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int year = min / 525600;
        int leftOverMin = min % 525600;
        int day = leftOverMin / 1440;
        System.out.println(min + " minutes is approximately equals to " + year + " years and " + day + " days" );
    }
    public static void
    public static void main(String[] args) {
        //temperatureConverter();
        //lengthConverter();
        //convertMinutesToYearsAndDays();

    }
}
