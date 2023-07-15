package quick_sort.java;

import java.util.Arrays;

/** Задача.
 * Имеется массив чисел. Нужно просуммировать все числа и
 * вернуть сумму. Решить задачу, используя рекурсию.
 */
public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(calculateRecursivelySum(new int[]{2, 4, 6})); // 12
        System.out.println(calculateRecursivelySum(new int[]{1, 2, 3})); // 6
        System.out.println(calculateRecursivelySum(new int[]{})); // 0
        System.out.println(calculateRecursivelySum(new int[]{5})); // 5
    }

    /**
     * Суммирует все числа массива и возвращает сумму
     * @param arr целочисленный массив
     * @return сумма чисел
     */
    private static int calculateRecursivelySum(int[] arr){
        if (arr.length == 0){           // <--- Базовый случай
            return 0;
        } else if (arr.length == 1) {   // <--- Базовый случай
            return arr[0];
        } else {
            return arr[0] + calculateRecursivelySum(Arrays.copyOfRange(arr,
                    1, arr.length));
        }
    }
}
