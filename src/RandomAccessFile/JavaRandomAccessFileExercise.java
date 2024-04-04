package RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Tran Dang Duong
 * Student ID: s3979381
 * @version ${11.0.18}
 * @created 04-Apr-24 11:01 AM
 * @project JavaPracticeExercises.java
 * @since ${11.0.18}
 */
public class JavaRandomAccessFileExercise {
    private static final String EMPLOYEE_FILE_PATH = "src/RandomAccessFile/employee.txt";
    //Exercise:
    //Write a Java program that reads and writes records to a random access file representing a simple database of employees. Each employee record consists of the following fields:
    //
    //Employee ID (int)
    //Employee Name (String, fixed length of 20 characters)
    //Employee Salary (double)
    //Your program should provide the following functionality:
    //
    //Add a new employee record to the random access file.
    //Display all employee records stored in the random access file.
    //Search for an employee record by ID and display its details.
    //Update the salary of an employee record by ID.

    //read
    //write
    //delete
    //append

    public static byte[] readDataFromFile(String filePath, int position, int size) throws IOException {
        //create RAF object
        RandomAccessFile RAF = new RandomAccessFile(filePath, "r"); //filePath + permission : read
        RAF.seek(position); //move pointer to position inside the file
        byte[] bytesToRead = new byte[size]; //store bytes to read inside an array
        RAF.read(bytesToRead);
        RAF.close(); //close the RAF
        return bytesToRead;


    }
    public static void writeDataToFile (String filePath, String dataToWrite, int position) throws IOException{
        RandomAccessFile RAF = new RandomAccessFile(filePath, "r"); //filePath + permission : read
        RAF.seek(position); //move pointer to position inside the file
        RAF.write(dataToWrite.getBytes());
        RAF.close();

    }

    public static void getCurrentPointerPosition (RandomAccessFile RAF) throws IOException {
        double currentPosition = RAF.getFilePointer();
        System.out.println("Current pointer position is" + currentPosition);
    }

    public static void main(String[] args) {
        try {
            //read 2nd line: 1001  | John Doe            | 50000.0
            System.out.println("The second line is :");
            System.out.println( new String(readDataFromFile(EMPLOYEE_FILE_PATH, 6, 50)));
        } catch (IOException error){
            System.out.println(error.getMessage());
        }


    }
}
