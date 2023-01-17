package quick_sort;

import java.util.List;

/**
 * Задача. Найти наибольшее число в списке, используя рекурсию.
 */
public class RecursiveMax {
    public static int i = 0;    // начальный индекс элемента
    public static int max = 0;  // начальное максимальное значение

    public static void main(String[] args) {
        // Создать массив
        int[] array = {2, 4, 0, -9, 21, 6};
        // Вывести наибольшее число
        System.out.println("Наибольшее число в массиве: " + RecursiveMax.findMax(array));

        // Создать список
        List<Integer> integerList = List.of(34, 3, 47, 91, 32, 0);

        // Вывести наибольшее число из списка
        System.out.println("Наибольшее число в списке: " +
                RecursiveMax.findMaxInList(integerList));

    }

    /**
     * Определяет наибольшее число в массиве
     *
     * @param array массив чисел
     * @return наибольшее число
     */
    private static int findMax(int[] array) {
        // Проверяем, достигнут ли конец массива
        if (array.length == i) {
            return max;
        }

        // Определяем максимальный элемент
        if (array[i] > max) {
            max = array[i];
        }

        i++;    // переходим к следующему элементу

        return findMax(array);
    }

    /**
     * Определяет наибольшее число в списке
     *
     * @param numbers список чисел
     * @return наибольшее число из списка
     *
     * @see <a href="src/quick_sort/findMax.png"> Выполнение метода (изображение) </a>
     */
    private static int findMaxInList(List<Integer> numbers) {
        /* Если список состоит из одного
         * элемента, возвращаем этот элемент */
        if (numbers.size() == 1) {
            return numbers.get(0);
        }

        int bottom = findMaxInList(numbers.subList(0, numbers.size() / 2));

        int top = findMaxInList(numbers.subList(numbers.size() / 2, numbers.size()));

        return Math.max(top, bottom);
    }

}
