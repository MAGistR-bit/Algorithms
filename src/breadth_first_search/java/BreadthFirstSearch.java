package breadth_first_search.java;

import java.util.*;

/**
 * Реализация алгоритма BFS.
 * Задача. Найти продавца (из списка контактов), который
 * продает замечательные манго.
 */
public class BreadthFirstSearch {

    // Создать хеш-таблицу (для реализации графа)
    private static final Map<String, List<String>> graph = new HashMap<>();

    private static boolean search(String name) {
        // Создать двунаправленную очередь
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));

        // Список для отслеживания уже проверенных людей
        List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {    // <--- Пока очередь не пуста
            // Извлекаем первого человека
            String person = searchQueue.poll();

            // Чеповек проверяется топько в том спучае,
            // если он не проверялся ранее
            if (!searched.contains(person)) {
                if (person_is_seller(person)) {
                    System.out.println(person + " is a mango seller!");
                } else {
                    // Все друзья этого человека добавляются
                    // в очередь поиска
                    searchQueue.addAll(graph.get(person));

                    // Человек помечается как проверенный
                    searched.add(person);
                }
            }
        }
        return false;
    }

    /**
     * Проверяет, является ли человек продавцом манго
     * @param name имя человека
     * @return true - человек является продавцом (имя заканчивается
     * на букву m),
     *         false - человек НЕ является продавцом манго
     */
    private static boolean person_is_seller(String name) {
        return name.endsWith("m");
    }

    public static void main(String[] args) {
        // Создать граф
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search("you");
    }
}
