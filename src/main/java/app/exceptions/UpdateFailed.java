package app.exceptions;

public class UpdateFailed extends RuntimeException {
    public UpdateFailed(String message) {
        super(message);
    }
}
