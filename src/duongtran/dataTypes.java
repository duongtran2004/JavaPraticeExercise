package duongtran;

import java.text.DecimalFormat;
import java.util.Arrays;
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
    public static void BMICalculator(){
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter height in centimeters: ");
        double centimetersHeight = scanner.nextDouble();
        double height = centimetersHeight / 100;
        double bmi = weight / (height * height);
        System.out.println("Your BMI is : " + df.format(bmi));
        //BMI	Weight Status
//Below 18.5	Underweight
//18.5—24.9	Healthy Weight
//25.0—29.9	Overweight
//30.0 and Above	Obesity
        if(bmi < 18.5){
            System.out.println("You are Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("You are on Healthy Weight");
        } else if (bmi >= 25.0 && bmi < 29.9) {
            System.out.println("You are Overweight");

        } else {
            System.out.println("You are Obesity");
        }
    }

    public static void averageSpeed(){
        //Test Data
        //Input distance in meters: 2500
        //Input hour: 5
        //Input minutes: 56
        //Input seconds: 23
        //Expected Output :
        //Your speed in meters/second is 0.11691531
        //Your speed in km/h is 0.42089513
        //Your speed in miles/h is 0.26158804
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input distance in meters: ");
        double meters = scanner.nextDouble();
        double kilometers = meters / 1000;
        double miles = kilometers / 1.609347218694;
            System.out.println("Please input hours: ");
        double hours = scanner.nextDouble();
        System.out.println("Please input minutes: ");
        double minutes = scanner.nextDouble();
        System.out.println("Please input seconds: ");
        double seconds = scanner.nextDouble();
        double totalMinutes = hours * 60 + minutes + seconds / 60;
        System.out.println("totalMinutes: " + totalMinutes );
        double totalSeconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println("totalSeconds: " + totalSeconds);

        double averageMetersPerSecond = meters / totalSeconds;
        double averageKilometersPerHour = kilometers / hours;
        double averageMilesPerHour = miles / hours;
        System.out.println("Kilometers:" + kilometers);
        System.out.println("Miles:" + miles);
        System.out.println("Your speed in meters/second is " + averageMetersPerSecond);
        System.out.println("Your speed in km/h is " + averageKilometersPerHour);
        System.out.println("Your speed in miles/h " + averageMilesPerHour);


    }

    public static void analyseTwoIntegers(){
        //Test Data
        //Input 1st integer: 25
        //Input 2nd integer: 5
        //Expected Output :
        //Sum of two integers: 30
        //Difference of two integers: 20
        //Product of two integers: 125
        //Average of two integers: 15.00
        //Distance of two integers: 20
        //Max integer: 25
        //Min integer: 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int firstInt = scanner.nextInt();
        System.out.println("Input second integer: ");
        int secondInt = scanner.nextInt();
        int sum = firstInt + secondInt;
        int difference = firstInt - secondInt;
        int product = firstInt * secondInt;
        int average = sum / 2;
        int distance = Math.abs(difference);
        int max = 1;
        int min = 2;

        System.out.println("Sum of two integers: " + sum );
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);
        System.out.println("Average of two integers: " + average);
        System.out.println("Distance of two integers: " + distance);
        if(firstInt > secondInt){
            max = firstInt;
            min = secondInt;
            System.out.println("Max integer: " + max);
            System.out.println("Min integer: " + min);
        } else if (firstInt == secondInt) {
            System.out.println("Both integers are equals so there is no max or min");
        }
        else{
            max = secondInt;
            min = firstInt;
            System.out.println("Max integer: " + max);
            System.out.println("Min integer: " + min);
        }
    }
    public  static  void breakIntegerIntoDigits(){
        //Test Data
        //Input six non-negative digits integer: 123456
        //Expected Output :
        //1 2 3 4 5 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input six non-negative digits integer:");
        int input = scanner.nextInt();
        String string = Integer.toString(input);
        System.out.println(string);
        String[] sequence = string.split("");
        System.out.println(Arrays.toString(sequence));

    }


    public static void main(String[] args) {
        //temperatureConverter();
        //lengthConverter();
        //convertMinutesToYearsAndDays();
        //BMICalculator();
        //averageSpeed();
        //analyseTwoIntegers();
        breakIntegerIntoDigits();

    }
}
