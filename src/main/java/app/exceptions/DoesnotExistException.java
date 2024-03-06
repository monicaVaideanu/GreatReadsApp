package app.exceptions;

public class DoesnotExistException extends RuntimeException {
    public DoesnotExistException(String message) {
        super(message);
    }
}
