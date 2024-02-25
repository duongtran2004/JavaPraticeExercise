package duongtran.ExceptionHandlingExercises;

public class OddNumberException extends RuntimeException{// RuntimeException is unchecked exception,
    // which the compiler won't force us to declare(throw) or resolve (try catch) before execution
    //so we dont need to modify the calling method (main)
    //constructor for message and cause
    public OddNumberException (String message){
        super(message);
    }
    public OddNumberException (Throwable cause){
        super(cause);
    }
}
