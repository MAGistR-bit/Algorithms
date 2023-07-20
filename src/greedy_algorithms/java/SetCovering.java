package greedy_algorithms.java;

import java.util.*;

/**
 * Задача о покрытии множеств.
 * Вы открываете собственную авторскую программу на радио и хотите,
 * чтобы вас слушали во всех 50 штатах. Нужно решить, на каких
 * радиостанциях должна транслироваться ваша передача. Каждая
 * станция стоит денег, поэтому количество станций необходимо
 * свести к минимуму. Имеется список станций.
 * Каждая станция покрывает определенный набор штатов,
 * эти наборы перекрываются. Как найти минимальный набор станций,
 * который бы покрывал все 50 штатов?
 */
public class SetCovering {
    public static void main(String[] args) {
        // Список штатов
        Set<String> statesNeeded = new HashSet<>(Arrays.asList("mt", "wa",
                "or", "id", "nv", "ut", "ca", "az"));

        // Список станций, из которого будет выбираться покрытие
        Map<String, Set<String>> stations = new LinkedHashMap<>();

        /* Ключи - названия станций, значения - сокращенные обозначения
        штатов, входящих в зону охвата. В данном примере станция kone
        вещает в штатах Айдахо (id), Невада (nv) и Юта (ut)*/
        stations.put("kone",new HashSet<>(Arrays.asList("id","nv","ut")));
        stations.put("ktwo",new HashSet<>(Arrays.asList("wa","id","mt")));
        stations.put("kthree",new HashSet<>(Arrays.asList("or","nv","ca")));
        stations.put("kfour",new HashSet<>(Arrays.asList("nv","ut")));
        stations.put("kfive",new HashSet<>(Arrays.asList("ca","az")));

        // Итоговый набор станций
        Set<String> finalStations = new HashSet<>();

        // Пока множество statesNeeded не станет пустым
        while (!statesNeeded.isEmpty()) {
            // Станция, которая обслуживает больше всего штатов
            String bestStation = null;

            Set<String> statesCovered = new HashSet<>();

            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
                Set<String> covered = new HashSet<>(statesNeeded);
                covered.retainAll(station.getValue());

                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }

                // Штаты, которые входят в зону покрытия станции,
                // больше не нужны
                statesNeeded.removeIf(statesCovered::contains);

                if (bestStation != null) {
                    finalStations.add(bestStation);
                }
            }
        }
        System.out.println(finalStations); // [ktwo, kone, kthree, kfive]
    }
}
