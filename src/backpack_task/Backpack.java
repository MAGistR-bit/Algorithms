package backpack_task;

import java.util.Arrays;
import java.util.stream.Collectors;

public record Backpack(Item[] items, int price) {

    // Описание состояния рюкзака
    public String getDescription() {
        return items == null ? "" : Arrays.stream(items)
                .map(Item::name)
                .collect(Collectors.joining("+")) + "-" + price();
    }

}
