package exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("X_FORWARDED_\\w+=");

        String[] parts = config.split("(environment=|,)");
        for (String part : parts) {
            Matcher matcher = pattern.matcher(part);
            if (matcher.find()) {
                String varName = matcher.group().substring(13, matcher.group().length() - 1);
                String varValue = part.substring(matcher.end(), part.length());
                result.append(varName).append("=").append(varValue).append(",");
            }
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}
//END
