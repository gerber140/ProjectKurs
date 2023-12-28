package pl.kurs.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Osoba> osoby = new ArrayList<>(List.of(
                new Osoba("Adam",15),
                new Osoba("Ewa",18),
                new Osoba("Kuba",25),
                new Osoba("Ania",21),
                new Osoba("Krzysztof",19)
        ));
        MinMax<Osoba> osobyMinAndMax = MinMaxService.getMinAndMax(osoby);
        System.out.println("Osoby max: " + osobyMinAndMax.getMax());
        System.out.println("Osoby min: " + osobyMinAndMax.getMin());

        List<Integer> liczby = new ArrayList<>(List.of(12,23,31,24,57,68,97));
        MinMax<Integer> liczbyMinAndMax = MinMaxService.getMinAndMax(liczby);
        System.out.println("Liczby max: " + liczbyMinAndMax.getMax());
        System.out.println("Liczby min: " + liczbyMinAndMax.getMin());

        List<Integer> liczby2 = new ArrayList<>();
        MinMax<Integer> liczby2MinAndMax = MinMaxService.getMinAndMax(liczby2);



    }
}