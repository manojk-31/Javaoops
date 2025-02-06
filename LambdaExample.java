import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaExample {

    public static void main(String[] args) {
        // List of strings
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("grape");
        words.add("kiwi");

        Collections.sort(words, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted list in reverse alphabetical order: " + words);

        StringProcessor toUpperCaseProcessor = str -> str.toUpperCase();

        System.out.println("Uppercase Strings:");
        for (String word : words) {
            System.out.println(toUpperCaseProcessor.process(word));
        }
    }
}
