package duongtran.FileIOExercises;

import java.awt.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
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
        String line;
        //using while loop until readLine is null to read the whole file
        while ((line = bufferedReader.readLine()) != null) {
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
        System.out.println("The content of the file is: " + bufferedReader.readLine());
        bufferedReader.close();
    }

    public static void readNFirstLineOfFile() throws IOException {
//same with readAllFile but at a for loop inside-most to stop at n
        //Read the content of the original file line by line, excluding the line you want to clear.
        //Create a temporary file and write the modified content to it.
        //Empty the original file.
        //Write the content from the temporary file back to the original file.
        //Rename the temporary file to the original file.
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
        String line;
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
        //create File object to store the address of the folder we want to read
        File targetFile = new File("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder");
        //create String array to store all file pathname.
        String[] filesList;

        //populate element into the array by pathname using fileObject.list()
        filesList = targetFile.list();
        //Display the result
        //Method 1: Display array format, all items on the same line
        System.out.println(Arrays.toString(filesList));
        //for each through pathname array to print the result, each line include 1 pathname
        for (String pathname : filesList
        ) {
            System.out.println(pathname);

        }
    }


    public static void deleteFile() {
        //store the address of the file that need to be delete in a File Object
        File fileNeedToBeDeleted = new File("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\fileNeedToBeDeleted2");
        //delete the file and display result to user
        if (fileNeedToBeDeleted.delete()) {
            System.out.println(fileNeedToBeDeleted.getName() + " has been successfully deleted !");
        } else {
            System.out.println("Failed to delete, file not exist");
        }

    }


    public static void checkIfFileOrFolderExist() {
        //store the address of the file that need to be checked in a File Object
        File file = new File("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\multiLineFile");
        if (file.exists()) {
            System.out.println("File exist !");
        } else {
            System.out.println("File does not exist !");
        }
    }

    public static void permissionCheck() {
        //NOTE: 3 main types of Permissions in Java:
        //canExecutable()
        //canRead()
        //canWrite()
        //=> use file Class and file Object to use these methods for permission check
        File checkingFile = new File("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\sampleText.txt");
        if (checkingFile.canRead()) {
            System.out.println("You can read this file");
        } else {
            System.out.println("You cannot read this file");
        }
        if (checkingFile.canWrite()) {
            System.out.println("You can write this file");
        } else {
            System.out.println("You cannot write this file");
        }
        if (checkingFile.canExecute()) {
            System.out.println("You can run this file");
        } else {
            System.out.println("You cannot run this file");
        }
    }

    public static void listItemsNameAlphabeticallyAscending() {
        //print all item name => store into array => sort array alphabetically ascending => loop through new array and print result
        //create File object to store the address of the folder we want to read
        File targetFile = new File("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder");
        //create String array to store all file pathname.
        String[] filesList;

        //populate element into the array by pathname using fileObject.list()
        filesList = targetFile.list();
        //Display the result
      Arrays.sort(filesList);
        System.out.println("List of all items under this directory in the alphabetical order: ");
        for (String pathname : filesList
        ) {
            System.out.println(pathname);

        }
    }


    public static void getFileSize() throws IOException {
        File file = new File("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\multiLineFile");
        FileChannel fileChannel = FileChannel.open(file.toPath());
        System.out.println("File size is: " + fileChannel.size() + " byte(s)");
        // Close the file channel when done
        fileChannel.close();

    }

    public static void readTextAtLineN() throws IOException {
        //same with readAllFile but at a for loop inside-most to stop at n
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What line do you want to read ? ");
        int n = scanner.nextInt();
        //create FileReader object => make sure the file address is correct
        FileReader fileReader = new FileReader("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\multiLineFile");
        //create BufferReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //read content, remember to close buffer
        //initialize String value to store line
        String line;
        //initialize lineCount variable
        int lineCount = 0;
        // Read lines until reaching the specified limit (n)
        while ((line = bufferedReader.readLine()) != null) {
            lineCount++;
            if (lineCount == n) {
                System.out.println("The content at line " + n + " is: " + line);
            }
        }


        bufferedReader.close();
    }

    public static void emptyTheFile() throws IOException {
        //=> overwrite content of the file "" (empty)

        FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\fileThatNeedToBeEmpty");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("");
        bufferedWriter.close();
    }

    public static void copyToExistingFile() throws IOException {
        //Store address of original file and copied file
        String originalFilePath = "C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\fileThatNeedToBeCopied.txt";
        String copiedFilePath = "C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\copyFolder\\copiedFile";
//use File.copy (File Class)
        //The Files.copy method takes Path objects as arguments, not String objects.
        // You need to convert your file paths to Path objects using Paths.get.
        //Use Path interface for Paths Class
        Path originalPath = Paths.get(originalFilePath);
        Path copiedPath = Paths.get(copiedFilePath);
        // Use Files.copy with REPLACE_EXISTING option
        Files.copy(originalPath, copiedPath, StandardCopyOption.REPLACE_EXISTING);


    }

    public static void copyFileToAnotherLocation() {
    }

    public static void deleteTextByLine() throws IOException {
        // => so simply store file content except the delete file => then empty the file => the write back the content
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What line do you want to delete? ");
        int n = scanner.nextInt();
        //Read First, Write Later. To prevent accidentially delete file content, open fileWriter in append mode (true)
        //Create Reader Object to read the file up to line n
        FileReader fileReader = new FileReader("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\multiLineFile");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //create Writer objects
        FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\Desktop\\LearnJava\\src\\duongtran\\FileIOExercises\\sampleFolder\\multiLineFile", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //initialize lineCount variable
        int lineCount = 0;
        // Read lines until reaching the specified limit (n)
        while (bufferedReader.readLine() != null) {
            lineCount++;
            if (lineCount == n) {
                bufferedWriter.write("");
            }
        }
//close everything after finished
        bufferedReader.close();
        bufferedWriter.close();

    }

    public static void deleteTextByLineAndRemoveWhiteSpace() {

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
        //readNFirstLineOfFile();
        //printAllItemNamesUnderAFolder();
        //deleteFile();
        //checkIfFileOrFolderExist();
        //getFileSize();
        //readTextAtLineN();
        //emptyTheFile();
        //deleteTextByLine();
        //copyToExistingFile();
        //permissionCheck();
        listItemsNameAlphabeticallyAscending();


    }
}
