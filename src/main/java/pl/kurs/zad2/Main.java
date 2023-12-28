package pl.kurs.zad2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie:");
        String name = scanner.nextLine();

        Optional<String> nameOptional = Optional.ofNullable(name);
        int nameLength = nameOptional.map(String::length).orElse(0);

        System.out.println(nameLength);

        System.out.println("Podaj PESEL:");
        String pesel = scanner.nextLine();

        if(Pesel.isValid(pesel)){
            String s = Pesel.peselToDate(pesel);
            System.out.println(s);
        } else {
            throw new InvalidPeselException("Zły pesel!");
        }
    }

}

