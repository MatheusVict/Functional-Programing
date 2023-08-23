package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    Function<Integer, Integer> getDouble = x -> x * 2;

    List<Integer> doubleNumbers = numbers
            .stream()
            .map(getDouble)
            .toList();

    doubleNumbers.forEach(System.out::println);
  }
}
