package JavaExercisesPractice.ExceptionHandlingExercises;

public class PositiveNumbersException extends RuntimeException {
    //constructor
    public PositiveNumbersException(String message) {
        super(message);
    }

    public PositiveNumbersException(Throwable cause) {
        super(cause);
    }

}
