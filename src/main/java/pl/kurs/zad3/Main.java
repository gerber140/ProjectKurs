package pl.kurs.zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(78, 3, 22, 45, 77, 23);
        List<Integer> list2 = FiveBiggestElements.findFiveBiggestElements(list);
        list2.forEach(System.out::println);
    }
}
