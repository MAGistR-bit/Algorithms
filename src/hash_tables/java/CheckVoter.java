package hash_tables.java;

import java.util.HashMap;
import java.util.Map;

public class CheckVoter {
    // Хеш-таблица
    private static final Map<String, Boolean> voted = new HashMap<>();

    public static void main(String[] args) {
        checkVoter("tom");  // let them vote!
        checkVoter("mike"); // let them vote!
        checkVoter("mike"); // kick them out!
    }


    /**
     * Метод, который проверяет, присутствует ли имя
     * определенного человека в хеше
     * @param name имя человека
     */
    private static void checkVoter(String name) {
        // Проверяем, содержится ли такой ключ
        if (voted.containsKey(name)) {
            System.out.println("kick them out!");
        } else {
            // Добавляем и разрешаем проголосовать
            voted.put(name, true);
            System.out.println("let them vote!");
        }
    }
}
