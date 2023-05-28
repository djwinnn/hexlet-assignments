package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String content) {
        Map<String, String> result = new HashMap<>();
        String[] lines = content.split("\n");
        for (String line : lines) {
            if (line.contains("environment")) {
                String[] split1 = line.split("\"");
                String[] env_vars = split1[1].split(",");
                for (String env_var : env_vars) {
                    if (env_var.startsWith("X_FORWARDED_")) {
                        String[] env_var_split = env_var.split("=");
                        String key = env_var_split[0].replace("X_FORWARDED_", "");
                        String value = env_var_split[1];
                        result.put(key, value);
                    }
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : result.entrySet()) {
            builder.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
        }
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }
}