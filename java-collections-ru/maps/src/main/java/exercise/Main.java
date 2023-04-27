package exercise;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String sentence = "java is the best programming language java";
        Map wordsCount = App.getWordCount(sentence);
        System.out.println(wordsCount);

        String sentence2 = "the java is the best programming language java";
        Map wordsCount2 = App.getWordCount(sentence);
        String result = App.toString(wordsCount2);
        System.out.println(result);

        Map wordsCount3 = App.getWordCount("");
        String result2 = App.toString(wordsCount3);
        System.out.println(result2);
    }
}
