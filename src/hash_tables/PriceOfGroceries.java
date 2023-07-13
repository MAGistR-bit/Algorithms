package hash_tables;

import java.util.HashMap;
import java.util.Map;

/** Пример из книги.
 * Book - новая хеш-таблица.
 * В хеше book имена продуктов являются ключами,
 * а цены - значениями. Хеш-таблица связывает
 * ключи со значениями.
 */
public class PriceOfGroceries {
    public static void main(String[] args) {
        // Хеш-таблица
        Map<String, Double> book = new HashMap<>();

        // Добавляем продукты в хеш-таблицу
        book.put("apple", 0.67);
        book.put("milk", 1.49);
        book.put("avocado", 1.49);

        System.out.println(book); // {apple=0.67, avocado=1.49, milk=1.49}
    }
}
