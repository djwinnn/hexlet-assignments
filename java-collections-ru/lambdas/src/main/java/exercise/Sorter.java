package exercise;

import java.time.LocalDate;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> list) {
        return list.stream()
                .filter(pet -> pet.get("gender").equals("male"))
                .sorted((u1, u2) -> {
                    LocalDate b1 = LocalDate.parse(u1.get("birthday"));
                    LocalDate b2 = LocalDate.parse(u2.get("birthday"));
                    return b1.compareTo(b2); // сортируем по возрасту
                })
                .map(pet -> pet.get("name"))
                .collect(Collectors.toList());
    }
}
// END
