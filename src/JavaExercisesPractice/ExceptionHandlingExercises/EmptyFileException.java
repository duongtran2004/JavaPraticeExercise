package JavaExercisesPractice.ExceptionHandlingExercises;

import java.io.IOException;

//what if my custom exception extend a checked exception?
public class EmptyFileException extends IOException {
    //constructor
    public EmptyFileException (String message){
        super(message);
    }
    public EmptyFileException (Throwable cause){
        super(cause);
    }
}
