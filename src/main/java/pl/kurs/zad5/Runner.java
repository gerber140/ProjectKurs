package pl.kurs.zad5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InvalidBirthDateException {
        Scanner scanner = new Scanner(System.in);
        LocalDate now = LocalDate.now();

        System.out.println("Podaj friday13 urodzenia(2003-01-31):");
        String date = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(date);

        if (dateOfBirth.isAfter(now)) {
            throw new InvalidBirthDateException("Podana data urodzenia jest późniejsza niż dzisiaj.");
        }


        long daysAlive = ChronoUnit.DAYS.between(dateOfBirth, now);
        long monthsAlive = ChronoUnit.MONTHS.between(dateOfBirth, now);
        long yearsAlive = ChronoUnit.YEARS.between(dateOfBirth, now);

        System.out.println("Żyjesz juz:");
        System.out.println(daysAlive + " dni");
        System.out.println(monthsAlive + " miesiecy");
        System.out.println(yearsAlive + " lat");

        DayOfWeek dayOfWeek = dateOfBirth.getDayOfWeek();
        System.out.println("Urodziłeś się w " + dayOfWeek);

        LocalDate friday13 = dateOfBirth;
        while (!(friday13.getDayOfWeek() == DayOfWeek.FRIDAY && friday13.getDayOfMonth() == 13)) {
            friday13 = friday13.plusDays(1);
        }
        System.out.println("Najblizszy piatek 13 po urodzinach był " + friday13);


    }
}
