package pl.kurs.zad4;

import java.util.*;
import java.util.stream.Collectors;

public class PersonListService {
    public static Optional<Person> findOldestWoman(List<Person> persons) throws NoWomanException {
        Optional<Person> oldestWoman = persons.stream()
                .filter(person -> person.getName().endsWith("a"))
                .max(Comparator.comparingInt(Person::getAge));
        if (oldestWoman.isEmpty()) {
            throw new NoWomanException("No women on list");
        }
        return oldestWoman;
    }

    public static double averageAge(List<Person> persons) {
        return persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
    public static double averageMensAge(List<Person> persons) {
        return persons.stream()
                .filter(person -> !person.getName().endsWith("a"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
    public static double averageWomensAge(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getName().endsWith("a"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
    }
    private static void groupByGender(List<Person> persons){
        persons.stream()
                .collect(Collectors.groupingBy(person -> person.getName().endsWith("a")));

    }


    public static String cityWithMostPeople(List<Person> persons){
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Brak danych");
    }
    public static List<String> allCitys(List<Person> persons){
        return persons.stream()
                .map(Person::getCity)
                .distinct()
                .toList();
    }


}
