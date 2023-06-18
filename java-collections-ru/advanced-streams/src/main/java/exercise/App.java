package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String configFileContent) {
        Map<String, String> environmentVariables = new HashMap<>();
        Arrays.stream(configFileContent.split("\n"))
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.replace("environment=\"", "").replace("\"", ""))
                .flatMap(line -> Arrays.stream(line.split(",")))
                .filter(pair -> pair.startsWith("X_FORWARDED_"))
                .forEach(pair -> {
                    String[] keyValue = pair.split("=");
                    environmentVariables.put(keyValue[0].replace("X_FORWARDED_", ""), keyValue[1]);
                });
        return environmentVariables.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .sorted()
                .collect(Collectors.joining(","));
    }
}
//END
