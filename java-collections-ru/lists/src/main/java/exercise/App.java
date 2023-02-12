package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static boolean scrabble(String charsForWord, String needWord) {
        String[] strSplit = charsForWord.split("");
        List<String> listForWords = new ArrayList<>(Arrays.asList(strSplit));

        String[] strSplit2 = needWord.split("");
        List<String> listNeedWord = new ArrayList<>(Arrays.asList(strSplit2));

        int count = 0;

        for (String needWordLoop: listNeedWord) {
            for (String wordsLoop: listForWords) {
                if (needWordLoop.equalsIgnoreCase(wordsLoop)) {
                    count++;
                }
            }
        }
        return count == needWord.length();
    }
}
