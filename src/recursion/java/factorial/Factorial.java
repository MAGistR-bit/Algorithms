package recursion.java.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();

        int res = factorial(x);
        System.out.println(x + "! = " + res);
    }

    /**
     * Вычисляет факториал числа
     * @param x число, которое было введено пользователем
     * @return факториал числа
     */
    private static int factorial(int x){
        if (x == 1){
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}
