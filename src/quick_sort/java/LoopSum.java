package quick_sort.java;

public class LoopSum {
    public static void main(String[] args) {
        // Отобразить сумму элементов массива
        System.out.println(sum(new int[]{1, 7, 3, 5})); // 16
    }

    /**
     * Метод, который вычисляет сумму элементов массива
     * @param arr целочисленный массив
     * @return сумма элементов массива
     */
    private static int sum(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }

        return total;
    }
}
