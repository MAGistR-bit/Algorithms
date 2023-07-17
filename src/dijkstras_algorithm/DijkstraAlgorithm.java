package dijkstras_algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstraAlgorithm {
    // Граф
    private static Map<String, Map<String, Double>> graph = new HashMap<>();

    // Список отслеживания всех уже обработанных узлов
    private static List<String> processed = new ArrayList<>();


    public static void main(String[] args) {
        graph.put("start", new HashMap<>());

        // Одно ребро ведет из начального узла в А, а
        // другое - из начального узла в В.
        graph.get("start").put("a", 6.0);
        graph.get("start").put("b", 2.0);

        graph.put("a", new HashMap<>());
        graph.get("a").put("fin", 1.0);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("fin", 5.0);

        // У конечного узла нет соседей
        graph.put("fin", new HashMap<>());

        // Хеш-таблица для хранения стоимостей узлов
        Map<String, Double> costs = new HashMap<>();
        costs.put("a", 6.0);
        costs.put("b", 2.0);
        // Стоимость неизвестна, поэтому она считается бесконечной
        costs.put("fin", Double.POSITIVE_INFINITY);

        // Хеш-таблица родителей
        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        // Найти узел с наименьшей стоимостью среди необработанных
        String node = findLowestCostNode(costs);

        while (node != null) {
            Double cost = costs.get(node);
            Map<String, Double> neighbors = graph.get(node);

            // Перебрать всех соседей текущего узла
            for (String n : neighbors.keySet()) {

                double newCost = cost + neighbors.get(n);
                // Если к соседу можно быстрее
                // добраться через текущий узел ...
                if (costs.get(n) > newCost) {
                    // ... обновить стоимость для этого узла
                    costs.put(n, newCost);

                    // Этот узел становится новым родителем для соседа
                    parents.put(n, node);
                }
            }
            // Узел помечается как обработанный
            processed.add(node);

            // Найти следующий узел для обработки и повторить
            // цикл
            node = findLowestCostNode(costs);
        }

        System.out.println("Cost from the start to each node:");
        System.out.println(costs); // { a: 5, b: 2, fin: 6 }

    }

    private static String findLowestCostNode(Map<String, Double> costs) {
        Double lowestCost = Double.POSITIVE_INFINITY;
        String lowestCostNode = null;

        // Перебрать все узлы
        for (Map.Entry<String, Double> node : costs.entrySet()) {
            Double cost = node.getValue();
            // Если это узел с наименьшей стоимостью
            // из уже виденных и он еще не был обработан...
            if (cost < lowestCost && !processed.contains(node.getKey())) {
                // ... он назначается новым узлом
                // с наименьшей стоимостью
                lowestCost = cost;
                lowestCostNode = node.getKey();
            }
        }

        return lowestCostNode;
    }
}
