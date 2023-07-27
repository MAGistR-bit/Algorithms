package backpack_task;

/**
 * @param name   Название вещи
 * @param weight Вес
 * @param price  Стоимость
 */
public record Item(String name, int weight, int price) {
    /**
     * Создать объект Item
     *
     * @param name   название вещи
     * @param weight вес
     * @param price  стоимость
     */
    public Item {
    }

    /**
     * Получает название вещи
     *
     * @return название
     */
    @Override
    public String name() {
        return name;
    }

    /**
     * Получает вес вещи
     *
     * @return вес вещи
     */
    @Override
    public int weight() {
        return weight;
    }

    /**
     * Получает стоимость вещи
     *
     * @return стоимость вещи
     */
    @Override
    public int price() {
        return price;
    }
}
