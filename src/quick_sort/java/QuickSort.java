package quick_sort.java;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Быстрая сортировка
 */
public class QuickSort {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, -8, 2, 3, 6, 7);
        System.out.println("Было: " + integerList);
        System.out.println("Стало: " + QuickSort.quickSort(integerList));
    }

    /**
     * Программный код быстрой сортировки
     * @param list список чисел
     * @return отсортированный список
     */
    private static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;        // <--- Базовый случай: массивы
                                // с 0 и 1 элементом уже "отсортированы"
        } else {
            Integer pivot = list.get(0);    // <--- Рекурсивный случай

            // Подмассив всех элементов, меньших опорного
            List<Integer> less = list.stream().skip(1)
                    .filter(element -> element <= pivot).toList();

            // Подмассив всех элементов, больших опорного
            List<Integer> greater = list.stream().skip(1)
                    .filter(element -> element > pivot).toList();

            return Stream.of(
                    quickSort(less).stream(),
                    Stream.of(pivot),
                    quickSort(greater).stream())
                    .flatMap(Function.identity()).collect(Collectors.toList());
        }
    }
}
