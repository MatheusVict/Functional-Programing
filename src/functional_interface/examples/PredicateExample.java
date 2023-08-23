package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("hello", "functional", "interface", "world");

    // it's always boolean 'cause it's a predicate
    Predicate<String> isLongerThanFive = word -> word.length() > 5;

    words.stream()
            .filter(isLongerThanFive)
            .forEach(System.out::println);

    words.stream()
            .filter(w -> w.length() > 5)
            .forEach(System.out::println);
  }
}
