package pl.kurs.zad4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonListService {
    public static Optional<Person> findOldestWoman(List<Person> persons) throws NoWomanException {
        return Optional.ofNullable(persons.stream()
                .filter(person -> person.getName().endsWith("a"))
                .max(Comparator.comparingInt(Person::getAge))
                .orElseThrow(() -> new NoWomanException("No women on list!")));
    }

    public static Optional<Double> averageAge(List<Person> persons) {
        return Optional.of(persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0));
    }
    public static Optional<Double> averageMensAge(List<Person> persons) {
        return Optional.of(persons.stream()
                .filter(person -> !person.getName().endsWith("a"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0));
    }
    public static Optional<Double> averageWomensAge(List<Person> persons) {
        return Optional.of(persons.stream()
                .filter(person -> person.getName().endsWith("a"))
                .mapToInt(Person::getAge)
                .average()
                .orElse(0));
    }

    public static Optional<Double> averageAgeByGender(List<Person> persons, Function<Person, Boolean> genderPredicate) {
        return Optional.of(persons.stream()
                .filter(genderPredicate::apply)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0));
    }


    public static Optional<String> cityWithMostPeople(List<Person> persons){
        return Optional.of(persons.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Brak danych"));
    }
    public static Optional<List<String>> allCitys(List<Person> persons){
        return Optional.of(persons.stream()
                .map(Person::getCity)
                .distinct()
                .toList());
    }


}
