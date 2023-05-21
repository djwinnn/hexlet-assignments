package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
    public static long getCountOfFreeEmails(List<String> list) {

        return list.stream()
                .filter(num -> num.endsWith("gmail.com") || num.endsWith("yandex.ru") || num.endsWith("hotmail.com"))
                .count();
    }
}
