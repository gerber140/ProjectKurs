package pl.kurs.zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,3,7,5);
        List<Integer> list2 = FiveBiggestElements.findFiveBiggestElements(list);
        list2.forEach(System.out::println);
    }
}
