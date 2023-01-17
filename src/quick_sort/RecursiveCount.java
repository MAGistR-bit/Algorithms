package quick_sort;

import java.util.Arrays;

/** Задача. Написать рекурсивную функцию для
* подсчета элементов в списке. */
public class RecursiveCount {
    public static void main(String[] args) {
        // Создать массив целых чисел
        int[] list = {1, -8, 3, 2, 4};

        // Вывести количество элементов массива
        System.out.println(countElements(list));
    }

    /**
     * Подсчитывает количество элементов
     * @param list массив целых чисел
     * @return количество элементов
     */
    private static int countElements(int[] list){
        if (list.length == 0){  // <--- Базовый случай
            return 0;
        }

        return 1 + countElements(Arrays.copyOfRange(list,
                1, list.length));
    }
}
