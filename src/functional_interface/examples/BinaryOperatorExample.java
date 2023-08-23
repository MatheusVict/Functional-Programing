package functional_interface.examples;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    BinaryOperator<Integer> sum = (x, y) -> x + y;

    int result = numbers
            .stream()
            .reduce(0, sum);


    int result1 = numbers
            .stream()
            .reduce(0, Integer::sum);

    System.out.println(result);
    System.out.println("New result: " +result1);
  }
}
