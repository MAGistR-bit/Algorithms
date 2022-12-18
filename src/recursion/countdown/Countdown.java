package recursion.countdown;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        countdown(scanner.nextInt());

    }

    /**
     * Отображает числа от n до 0 (включительно).
     *
     * @param n число, которое указывает пользователь
     */
    private static void countdown(int n) {
        System.out.print(n);
        if (n <= 0) {               // <------- Базовый случай
            return;
        } else {                    // <------- Рекурсивный случай
            System.out.print("...");
            countdown(n - 1);
        }
    }
}
