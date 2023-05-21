package exercise;

import java.util.List;
import java.util.Arrays;

public class App {
    public static long getCountOfFreeEmails(List<String> list) {

        return list.stream()
                .filter(num -> num.contains("gmail.com"))
                //.filter(num -> num.contains("yandex.ru"))
                //.filter(num -> num.contains("hotmail.com"))
                .count();
    }

}
