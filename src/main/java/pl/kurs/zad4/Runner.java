package pl.kurs.zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Adam", "Kowalski", "Warszawa", 21));
        persons.add(new Person("Ewa", "Nowak", "Kraków", 30));
        persons.add(new Person("Jan", "Wiśniewski", "Poznań", 25));
        persons.add(new Person("Ala", "Dąbrowska", "Gdańsk", 35));
        persons.add(new Person("Ania", "Szymańska", "Gdańsk", 21));
        persons.add(new Person("Piotr", "Lis", "Wrocław", 28));


        Optional<Person> oldestWoman = PersonListService.findOldestWoman(persons);
        System.out.println(oldestWoman.get().getName());

        double averageAge = PersonListService.averageAge(persons);
        System.out.println(averageAge);

        double averageMensAge = PersonListService.averageMensAge(persons);
        System.out.println(averageMensAge);

        String cityWithMostPeople = PersonListService.cityWithMostPeople(persons);
        System.out.println(cityWithMostPeople);

        System.out.println();

        List<String> citys = PersonListService.allCitys(persons);
        for (String element : citys) {
            System.out.println(element);
        }
    }
}
