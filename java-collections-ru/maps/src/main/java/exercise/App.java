package exercise;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder result = new StringBuilder();

        result.append("{");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            result.append("\n");
            if (entry.getKey().isEmpty()) {
                result.append("");
            } else {
                result.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }

        }
        result.append("}");
        return result.toString();
    }
}
