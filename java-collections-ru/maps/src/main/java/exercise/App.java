package exercise;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class App {
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.isEmpty()) {
                return wordCount;
            } else {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder result = new StringBuilder();
        result.append("{\n");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (Objects.equals(entry.getKey(), "")) {
                return "{}";
            } else {
                result.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
        }
        result.append("}");
        return result.toString();
    }
}
