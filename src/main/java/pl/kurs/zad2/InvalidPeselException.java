package pl.kurs.zad2;

public class InvalidPeselException extends RuntimeException{
    public InvalidPeselException() {
    }

    public InvalidPeselException(String message) {
        super(message);
    }
}
