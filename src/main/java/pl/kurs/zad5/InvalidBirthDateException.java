package pl.kurs.zad5;

public class InvalidBirthDateException extends Exception {
    public InvalidBirthDateException() {
    }

    public InvalidBirthDateException(String message) {
        super(message);
    }
}
