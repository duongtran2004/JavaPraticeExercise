package duongtran;

import java.util.*;

public class arrayExercises {
    //EX1: Sort numeric array and String array. Let user input 1D (1 dimensional array)
    // Later on you can learn to let user input 2D arrays

    public static void getUser1DArrayInput() {
        //Get User Array Input
        // Ask user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of element of the numeric array: ");
        int arraySize = scanner.nextInt();
        //initialize numeric array with array size.
        double[] numericArray = new double[arraySize];
        //ask user for array's elements. Then store them into numericArray
        System.out.println("Please enter elements for numeric array, 1 space between each: ");
        for (int i = 0; i < arraySize; i++) {
            if (scanner.hasNextDouble()) { //count every Double in the user input
                numericArray[i] = scanner.nextDouble(); //append each found Double into numericArray
            }
        }

        System.out.println("Your Input Numeric Array: " + Arrays.toString(numericArray));
    }

    public static void sortNumericArray() {
        //Get User Array Input
        // Ask user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of element of the numeric array: ");
        int arraySize = scanner.nextInt();
        //initialize numeric array with array size.
        double[] numericArray = new double[arraySize];
        //ask user for array's elements. Then store them into numericArray
        System.out.println("Please enter elements for numeric array, 1 space between each: ");
        for (int i = 0; i < arraySize; i++) {
            if (scanner.hasNextDouble()) { //count every Double in the user input
                numericArray[i] = scanner.nextDouble(); //append each found Double into numericArray
            }
        }
        //Array.sort can not be used for empty array
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
    }

    public static void sortStringArray() {
        //Step 1: Ask user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of element of the string array: ");
        int arraySize = scanner.nextInt();
        //initialize string array with array size.
        String[] stringArray = new String[arraySize];
        //ask user for array's elements. Then store them into stringArray
        System.out.println("Please enter elements of the string array, 1 space between each: ");
        for (int i = 0; i < arraySize; i++) {
            //count every String(word) in the user input NOT ALL AT ONCE, BUT ONE BY ONE
            System.out.println("Please input the " + (i + 1) + " word of your string: "); //remember to plus 1 since i(counter) start at 0
            //append each word as an element of the stringArray
            stringArray[i] = scanner.next();
        }
        //Array.sort can not be used for empty array
        System.out.println("Original Numeric Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(stringArray));
    }

    public static void printUserInput2DNumericArray() {
        //Ask user for Array size (rows and columns)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows of your numeric array: ");
        int row = scanner.nextInt();
        System.out.println("Please enter the number of columns of your numeric array: ");
        int column = scanner.nextInt();
        //Initialize numeric array with array size.
        double[][] numericArray = new double[row][column]; //note: 2D array has 2 square bracket [][]
        //Use double for loop to populate 2D array. Outer loop for rows (execute later), inner loop for columns (execute first)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //ask user to enter element at specific rows and columns
                System.out.println("Please enter number at row " + j + " and column " + i + "position [" + i + "][" + j + "]:");
                //append each typed element into numericArray
                numericArray[i][j] = scanner.nextDouble();
            }
        }
        //Display the input array to the user (Print 2D array)
        System.out.println("Your array is: ");
        System.out.println(Arrays.deepToString(numericArray).replace("], ", "]\n"));
        //Arrays.deepToString: String representation of multi-dimensional array
        //you can also use for loop, but it is more complicated
    }

    public static void calculateArrayElementSum() {
        //copy code user input numeric array
        //Step 1: Ask user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of element of the numeric array: ");
        int arraySize = scanner.nextInt();
        //initialize numeric array with array size.
        double[] numericArray = new double[arraySize];
        //ask user for array's elements. Then store them into numericArray
        System.out.println("Please enter elements for numeric array, 1 space between each: ");
        for (int i = 0; i < arraySize; i++) {
            if (scanner.hasNextDouble()) { //count every Double in the user input
                numericArray[i] = scanner.nextDouble(); //append each found Double into numericArray
            }
        }
        //initialize sum variable
        double sum = 0;
        //for loop through each element => update sum += numericArray[i]

//        for (int i = 0; i < numericArray.length; i++){
//            sum += numericArray[i];
//        }
//        //print sum
//        System.out.println("Sum of all element inside your array " + Arrays.toString(numericArray) + " is " + sum);
        //how about for each loop?  => may be faster and more simpler to do this task
        for (double i : numericArray) // syntax of for each loop: dataType elementName(can be any) : arrayName
            // Add each element to the sum.
            sum += i;
        System.out.println("Sum of all element inside your array " + Arrays.toString(numericArray) + " is " + sum);
    }

    public static void findArrayElement() {
        //initialize an array
        int[] numberArray = {1, 55, 65, 323, 2, 0};
        //user input an element
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the element that you need to find: ");
        int elementNeedToBeFound = scanner.nextInt();
        //initialized boolean found value
        boolean foundElement = false;
        //initialize variable to hold index number
        int index = 0;
        // loop through element
        for (int i = 0; i < numberArray.length; i++) {
            if (elementNeedToBeFound == numberArray[i]) {
                foundElement = true;
                index = i + 1;
            }

        }
        if (foundElement) {
            System.out.println("Element found !");

            System.out.println("Element found at index: " + index);
            //maybe there is built-in function to find Array's index in java?
        } else {
            System.out.println("Element not found ! ");
        }

        //only print the result once: print out side the for loop
        // print boolean true false if found element
        //if true: print index

    }

    public static void removeArrayElementByValue() {
        //initialize array
        //user input element value to be removed
        //find Array Element
        //initialize an array
        int[] numberArray = {1, 55, 65, 323, 2, 0};
        //user input an element
        Scanner scanner = new Scanner(System.in);
        System.out.println("Original Array is :" + Arrays.toString(numberArray));
        System.out.println("Please enter the value of element that you need to remove: ");
        int elementNeedToBeFound = scanner.nextInt();
        //initialized boolean found value
        boolean foundElement = false;
        //initialize variable to hold index number
        int index = 0;
        //initialize new number array which is 1 length less than the original array
        // Create another array of size one less
        int[] newNumberArray = new int[numberArray.length - 1];
        // loop through element
        for (int i = 0; i < numberArray.length; i++) {
            if (elementNeedToBeFound == numberArray[i]) {
                foundElement = true;
                index = i;
            }

        }
        if (foundElement) {//if found, remove it
            System.out.println("Element to be remove found !");
            System.out.println("Element to be remove found at index: " + index + " (start from 0)");
            //

            //maybe there is built-in function to find Array's index in java?
            //copyArray, loop from 0 to n, but skip index
            for (int i = 0, j = 0; i < numberArray.length; i++) { //j to hold the count for new Array
                //skip index by conditional if => continue the loop
                if (i == index) {
                    continue;
                }
                //move any element left from original array to the new one
                newNumberArray[j++] = numberArray[i];

            }
            //display result

            System.out.println("New array after removal: " + Arrays.toString(newNumberArray));
        } else {
            System.out.println("Element not found ! ");
        }

    }

    public static void removeArrayElementByIndex() {
        //initialize array
        //user input element value to be removed
        //find Array Element
        //initialize an array
        int[] numberArray = {1, 55, 65, 323, 2, 0};
        //user input an element
        Scanner scanner = new Scanner(System.in);
        System.out.println("Original Array is :" + Arrays.toString(numberArray));
        System.out.println("Please enter the index of element that you need to remove (start from 0): ");
        int index = scanner.nextInt();

        //initialize new number array which is 1 length less than the original array
        // Create another array of size one less
        int[] newNumberArray = new int[numberArray.length - 1];

        //maybe there is built-in function to find Array's index in java?
        //copyArray, loop from 0 to n, but skip index
        for (int i = 0, j = 0; i < numberArray.length; i++) { //j to hold the count for new Array
            //skip index by conditional if => continue the loop
            if (i == index) {
                continue;
            }
            //move any element left from original array to the new one
            newNumberArray[j++] = numberArray[i];

        }
        //display result

        System.out.println("New array after removal: " + Arrays.toString(newNumberArray));

    }

    public static void addElementByIndex() {
        //initialize array
        int[] numberArray = {1, 55, 65, 323, 2, 0};
        //user input an element
        Scanner scanner = new Scanner(System.in);
        System.out.println("Original Array is :" + Arrays.toString(numberArray));
        System.out.println("Please enter the index of element that you need to add (start from 0): ");
        int index = scanner.nextInt();
        System.out.println("Please enter the value of element that you need to add: ");
        int value = scanner.nextInt();
        //copyArray, loop from 0 to n of the original array
        for (int i = 0; i < numberArray.length; i++) {
            //stop at index, add new element
            if (i == index) {
                numberArray[i] = value;
            }
        }
        //display result

        System.out.println("New array after adding element: " + Arrays.toString(numberArray));
    }

    public static void reverseArray() {
        //user input
        //Get User Array Input
        // Ask user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of element of the numeric array: ");
        int arraySize = scanner.nextInt();
        //initialize numeric array with array size.
        double[] numericArray = new double[arraySize];
        //ask user for array's elements. Then store them into numericArray
        System.out.println("Please enter elements for numeric array, 1 space between each: ");
        for (int i = 0; i < arraySize; i++) {
            if (scanner.hasNextDouble()) { //count every Double in the user input
                numericArray[i] = scanner.nextDouble(); //append each found Double into numericArray
            }
        }
        //use Swapping Element: swap 1st with last, 2nd with 2nd last, and so on up til middle
        //initialize temporary variable to hold array elements' value while swapping
         double temp;
        //loop up to the middle index
        for (int i = 0; i < (numericArray.length-1) / 2; i ++ ){
            temp = numericArray[i];
            numericArray[i] = numericArray[numericArray.length - i - 1];
            numericArray[numericArray.length - i - 1] = temp;
        }
        //print the result
        System.out.println("The reverse array is: " + Arrays.toString(numericArray));

    }

    public static void findMinMaxOfArray() {
        //Get User Array Input
        // Ask user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of element of the numeric array: ");
        int arraySize = scanner.nextInt();
        //initialize numeric array with array size.
        double[] numericArray = new double[arraySize];
        //ask user for array's elements. Then store them into numericArray
        System.out.println("Please enter elements for numeric array, 1 space between each: ");
        for (int i = 0; i < arraySize; i++) {
            if (scanner.hasNextDouble()) { //count every Double in the user input
                numericArray[i] = scanner.nextDouble(); //append each found Double into numericArray
            }
        }

        System.out.println("Your Input Numeric Array: " + Arrays.toString(numericArray));
        //sort ascending to find the Min and the Max
        Arrays.sort(numericArray);
        double minValue = numericArray[0];
        double maxValue = numericArray[numericArray.length - 1]; //remember to minus 1 since array index start at 0, not 1
        System.out.println("The min value of the array is: " + minValue);
        System.out.println("The max value of the array is: " + maxValue);

    }
    public static void removeDuplicateElementsOfArray(){
        //Get User Array Input
        // Ask user for array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of element of the numeric array: ");
        int arraySize = scanner.nextInt();
        //initialize numeric array with array size.
        double[] numericArray = new double[arraySize];
        //ask user for array's elements. Then store them into numericArray
        System.out.println("Please enter elements for numeric array, 1 space between each: ");
        for (int i = 0; i < arraySize; i++) {
            if (scanner.hasNextDouble()) { //count every Double in the user input
                numericArray[i] = scanner.nextDouble(); //append each found Double into numericArray
            }
        }

        System.out.println("Your Input Numeric Array: " + Arrays.toString(numericArray));

    }


    public static void main(String[] args) {
        //getUser1DArrayInput();
        //sortNumericArray();
        //sortStringArray();
        //printUserInput2DNumericArray();
        //calculateArrayElementSum();
        //findArrayElement();
        //removeArrayElementByValue();
        //removeArrayElementByIndex();
        //addElementByIndex();
        //findMinMaxOfArray();
       //reverseArray();


    }
}
