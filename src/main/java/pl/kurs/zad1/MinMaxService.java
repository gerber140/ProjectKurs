package pl.kurs.zad1;

import java.util.Collections;
import java.util.List;

public class MinMaxService {
    public static <T extends Comparable> MinMax<T> getMinAndMax(List<T> elements) {

        return new MinMax(Collections.min(elements), Collections.max(elements));
    }
}
