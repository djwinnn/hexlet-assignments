package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
        public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
            List<Map<String, String>> result = new ArrayList<>();

            for (Map<String, String> book : books) {
                boolean match = true;

                for (String key : where.keySet()) {
                    String expectedValue = where.get(key);
                    String actualValue = book.get(key);

                    if (actualValue == null || !actualValue.equals(expectedValue)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    result.add(book);
                }
            }

            return result;
        }
}

