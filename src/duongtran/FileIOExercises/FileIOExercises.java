package duongtran.FileIOExercises;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

//Questions:
//why we need Buffered Writer? Why FileWriter alone not enough ?
//Because FileWriter and FileReader take one character by one, which is slower, less effiecient
//We use Buffer cause it take the whole content at once
//We combine Buffered Writer along with FileWriter is more efficient (especially in writing large amount of data)
//Compare: Pros, Cons, similarities, difference, when to use: BufferWriter vs FileWriter?
public class FileIOExercises {
    public static void writeToNewFile() throws IOException { //throw exception for error if cannot find File
        try {
            //create FileWriter object to store address of the file we need to modify. //store file address in String

            //create BufferedWriter object to store  FileWriter object
            //create new fule

            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\emptyFile.txt", false));
            //default: append false => overwrite, replace content
            //append true: add up content, keep the old content
            //use write method of bf object
            bufferedWriter.write("Hello \n");
            bufferedWriter.write("1 \n");
            bufferedWriter.write("ssfhgh");
            // Close the BufferedWriter to save changes to the file => without this, only the new file can be created but nothing is written
            bufferedWriter.close();
        } catch (Exception exception) {
            return;
        }
    }

    public static void writeToExistFile() throws IOException {
        //create fileWriter object
        FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\existFile.txt", true);
        //create bufferWriter object
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //write content
        bufferedWriter.write("This is a new line");
        bufferedWriter.newLine();
        //remember to close
        bufferedWriter.close();
    }

    public static void readAllFile() throws IOException {
        //create FileReader object => make sure the file address is correct
        FileReader fileReader = new FileReader("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\multiLineFile");
        //create BufferReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //read content, remember to close buffer
        //initialize String value to store line
        String line ;
        //using while loop until readLine is null to read the whole file
        while ((line =bufferedReader.readLine()) != null){
            System.out.println(line);

        }

       bufferedReader.close();
//Read vs Read Line?
//read(): This method reads a single character from the stream and returns it as an integer.
// The integer represents the character read, or -1 if the end of the stream has been reached.
// The returned integer needs to be cast to a char to get the actual character.
        //readLine(): This method reads a line of text from the stream and returns it as a String. It reads characters until it reaches the end of a line ('\n') or the end of the stream.
        // The newline character is not included in the returned String.
    }

    public static void readFirstLineOfFile() throws IOException {
        //create FileReader object
        FileReader fileReader = new FileReader("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\existFile.txt");
        //create BufferReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //read content, remember to close buffer
        System.out.println("The content of the file is: " +  bufferedReader.readLine());
        bufferedReader.close();
    }

    public static void readNFirstLineOfFile() throws IOException {
//same with readAllFile but at a for loop inside-most to stop at n
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines you want to read? ");
        int n = scanner.nextInt();
        //create FileReader object => make sure the file address is correct
        FileReader fileReader = new FileReader("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\multiLineFile");
        //create BufferReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //read content, remember to close buffer
        //initialize String value to store line
        String line ;
        //initialize lineCount variable
        int lineCount = 0;
        // Read lines until reaching the specified limit (n)
        while ((line = bufferedReader.readLine()) != null && lineCount < n) {
            System.out.println(line);
            lineCount++;
        }

        bufferedReader.close();
    }



    public static void printAllItemNamesUnderAFolder() {
        //create File
    }


    public static void readTextOfAllFilesUnderAFolder() {
    }

    public static void deleteFile() {
    }


    public static void checkIfFileOrFolderExist() {
    }

    public static void permissionCheck() {
    }

    public static void listItemsNameAlphabeticallyAscending() {
    }

    public static void ArrangeItemByAscendingNames() {
    }

    public static void getFileSize() {
    }

    public static void readTextByLine() {
    }

    public static void deleteAllTextOfFile() {
    }

    public static void deleteTextByLine() {
    }

    public static void deleteTextByContent() {
    }

    public static void changeFileName() {
    }

    public static void replaceTextByLine() {
    }

    public static void replaceTextByContentOnce() {
    }

    public static void replaceTextByContentAlL() {
    }

    public static void moveFileIntoAnotherFolder() {
    }

    public static void printCreationDate() {
    }

    public static void sortFileByDate() {
    }

    public static void arrangeFileByDate() {
    }

    public static void deleteFileByDate() {
    }

    public static void arrangeFileBySize() {
    }

    public static void deleteFileBySize() {
    }

    //total 27 exercises
    public static void main(String[] args) throws IOException {
        //writeToNewFile();
        //readAllFile();
        //writeToExistFile();
        //readFirstLineOfFile();
        readNFirstLineOfFile();


    }
}
