package streamapi.all;

import java.util.ArrayList;
import java.util.List;

public final class SampleData {
    public static final List<Integer> INTEGERS = List.of(
            1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            0, -1, 42, 42, 7,
            100, 101, 2, 2, 5
    );

    public static final List<String> STRINGS = List.of(
            "apple", "Banana", "avocado", "Blueberry", "cherry",
            "apricot", "mango", "kiwi", "strawberry", "Aardvark",
            "umbrella", "Anu", "guru", "value", "alpha",
            "delta", "unique", "Focus", "fbd", "fbd", "Zebra"
    );

    private SampleData() {}

    public static List<Integer> mutableIntegers() {
        return new ArrayList<>(INTEGERS);
    }

    public static List<String> mutableStrings() {
        return new ArrayList<>(STRINGS);
    }
}


