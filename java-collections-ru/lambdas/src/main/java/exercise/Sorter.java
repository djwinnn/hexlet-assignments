package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> list) {
        return list.stream()

                .map(pet -> pet.get("name"))
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}
// END
