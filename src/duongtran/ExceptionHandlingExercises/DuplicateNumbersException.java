package duongtran.ExceptionHandlingExercises;

public class DuplicateNumbersException extends IllegalArgumentException {
    //attributes
    String message;
    Throwable cause;
    //constructor

    public DuplicateNumbersException(String message, Throwable cause) {
        super(message, cause);
    }
}
