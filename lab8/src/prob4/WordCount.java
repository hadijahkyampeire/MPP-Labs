package prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordCount {
    public int countWords(List<String> words, char c, char d, int len) {
        List<String> filtered = words.stream()
                .filter(word -> containsCharacter(word, c)
                        && doesNotContainCharacter(word, d)
                        && word.length() == len)
                .collect(Collectors.toList());
        return filtered.size();
    }

    public static boolean containsCharacter(String s, char c) {
        return s.indexOf(c) >= 0;
    }

    public static boolean doesNotContainCharacter(String s, char c) {
        return s.indexOf(c) == -1;
    }

    public static void main(String[] args) {
        WordCount wordCount = new WordCount();
        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("cats");
        words.add("dog");
        words.add("dogs");
        System.out.println(wordCount.countWords(words, 'c', 's', 3));
    }
}
