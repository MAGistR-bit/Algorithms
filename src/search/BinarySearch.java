package search;

/**
 * Бинарный поиск (реализация алгоритма)
 */
public class BinarySearch {
    public static void main(String[] args) {
        // Отсортированный массив
        int[] list = {1, 3, 5, 7, 9, 10, 12};

        // Значение, которое необходимо найти
        int valueToFind = 9;

        System.out.println("Индекс: " + search(list, valueToFind));
    }

    /**
     * Бинарный поиск
     *
     * @param list отсортированный массив элементов
     * @param item значение, которое необходимо найти
     * @return позиция числа (индекс)
     */
    private static Integer search(int[] list, int item) {
        // Количество операций (O-большое)
        int numberOfOperations = 0;

        // В переменных low и high хранятся границы
        // той части списка, в которой выполняется поиск
        int low = 0;
        int high = list.length - 1;


        while (low <= high) {
            numberOfOperations++;

            // Определяем позицию элемента,
            // находящегося по середине списка
            int mid = (low + high) / 2;
            // Получаем средний элемент
            int guess = list[mid];

            if (guess == item){     // Значение найдено
                System.out.println("Количество операций: " + numberOfOperations);
                return mid;
            }

            if (guess > item) {     // Много
                high = mid - 1;
            } else {                // Мало
                low = mid + 1;
            }
        }

        System.out.println("Количество операций: " + numberOfOperations);
        return null;      // Значение не существует
    }
}
