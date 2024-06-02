package QuestionOne;/*
 * The EmptyListException class represents an exception that is thrown when attempting
 * to perform an operation on an empty list. It extends the Exception class and provides
 * a custom error message.
 */

public class EmptyListException extends Exception{
    public EmptyListException() {
        super("The list is empty.");
    }
}
