package pl.kurs.zad3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FiveBiggestElements {
    public static List<Integer> findFiveBiggestElements(List<Integer> list) {
        return Optional.ofNullable(list)
                .filter(x -> x.size() >= 5)
                .map(x -> x.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(5)
                        .collect(Collectors.toList()))
                .orElse(Collections.emptyList());

    }
}
