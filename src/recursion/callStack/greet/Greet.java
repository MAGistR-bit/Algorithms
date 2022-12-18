package recursion.callStack.greet;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");

        // 1. Вызывается greet(name)
        greet(scanner.next());
    }

    /**
     * Приветствует пользователя
     * @param name имя пользователя
     */
    private static void greet(String name) {
        // 2. Приветствуем пользователя.
        System.out.println("Hello, " + name + "!");

        greet2(name);   // <---- 3. Вызывается greet2(name).
                        // Вызывающая функция (greet) приостанавливается.

        // 5. Готовимся сказать "пока"
        System.out.println("Getting ready to say bye...");

        bye();      // <---- 6. Вызываем bye()
    }

    /**
     * Обращается к пользователю по имени
     * @param name имя пользователя
     */
    private static void greet2(String name) {
        // 4. Задаем вопрос пользователю
        System.out.println("How are you, " + name + "?");
    }

    /**
     * Прощается с пользователем
     */
    private static void bye(){
        // 7. Прощаемся с пользователем.
        System.out.println("Ok bye!");
    }
}
