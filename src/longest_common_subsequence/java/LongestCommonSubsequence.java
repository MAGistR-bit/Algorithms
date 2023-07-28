package longest_common_subsequence.java;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        // Строки
        String wordA = "hish";
        String wordB = "fish";

        // Создать таблицу (двумерный массив)
        int[][] cell = new int[wordA.length()][wordB.length()];

        for (int i = 0; i < wordA.length(); i++) {
            for (int j = 0; j < wordB.length(); j++) {
                // Буквы совпадают
                if (wordA.charAt(i) == wordB.charAt(j)) {
                    if (i > 0 && j > 0) {
                        cell[i][j] = cell[i - 1][j - 1] + 1;
                    } else {
                        cell[i][j] = 1;
                    }
                } else {
                    // Буквы не совпадают
                    if (i == 0 && j > 0) {
                        cell[i][j] = cell[i][j - 1];
                    } else if (i > 0 && j == 0) {
                        cell[i][j] = cell[i - 1][j];
                    } else if (i > 0) {
                        cell[i][j] = Math.max(cell[i - 1][j], cell[i][j - 1]);
                    } else {
                        cell[i][j] = 0;
                    }
                }
            }
        }

        printResult(cell);
    }

    /**
     * Печатает массив данных
     * @param arr целочисленный двумерный массив
     */
    private static void printResult(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
