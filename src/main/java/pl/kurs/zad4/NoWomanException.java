package pl.kurs.zad4;

public class NoWomanException extends RuntimeException {
    public NoWomanException() {
    }

    public NoWomanException(String message) {
        super(message);
    }
}
