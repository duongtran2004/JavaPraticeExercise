package JavaExercisesPractice.ExceptionHandlingExercises;

public class DivideBy0Exception  extends  RuntimeException{
    //constructors: initializing default value
    public DivideBy0Exception(String message){
        // RuntimeException class (parent class) would handle the exception and return the specific message
        super(message);
    }
    //method for throwable cause
    // RuntimeException class (parent class) would handle the exception and return the specific cause
    // cause is simply a chains of exception explain what went wrong? at what line? (it is an object of the Throwable Class)
    //Throwable Class: the big ASS, top parent class for all errors and exceptions
    public DivideBy0Exception(Throwable cause){

        super(cause);
    }

        //=> 2 same methods, different parameter
}
