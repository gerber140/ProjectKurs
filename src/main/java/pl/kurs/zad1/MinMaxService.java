package pl.kurs.zad1;

import java.util.Collections;
import java.util.List;

public class MinMaxService {
    public static <T extends Comparable<T>> MinMax<T> getMinAndMax(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        T min = Collections.min(elements);
        T max = Collections.max(elements);

        return new MinMax<>(min, max);
    }
}
