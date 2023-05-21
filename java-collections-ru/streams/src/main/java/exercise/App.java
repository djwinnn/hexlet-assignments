package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
    public static long getCountOfFreeEmails(List<String> list) {

        return list.stream()
                .filter(num -> num.contains("gmail.com") && num.contains("yandex.ru") && num.contains("hotmail.com"))
                .count();
    }
}
