package duongtran.ExceptionHandlingExercises;

public class NoVowelFoundException extends Exception {
    //constructor
    public NoVowelFoundException(String message) {
        super(message);
    }

    public NoVowelFoundException(Throwable cause) {
        super(cause);
    }
}
