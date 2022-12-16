package selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        // Массив, который необходимо отсортировать
        int[] sortArray = {5, 4, 6, 1, 2};

        // Отсортировать массив по возрастанию
        sortAscending(sortArray);

        // Вывести отсортированный массив
        for (int i : sortArray){
            System.out.print(i + " ");
        }

    }

    /**
     * Сортирует массив по возрастанию
     * @param array массив, который необходимо
     *                  отсортировать
     */
    private static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimumElementIndex = i;

            // Определить индекс наименьшего элемента
            for (int j = i + 1; j < array.length; j++){
                if (array[minimumElementIndex] > array[j]){
                    minimumElementIndex = j;
                }
            }

            // Поменять элементы местами
            if (minimumElementIndex != i){
                int temp = array[i];
                array[i] = array[minimumElementIndex];
                array[minimumElementIndex] = temp;
            }
        }
    }
}
