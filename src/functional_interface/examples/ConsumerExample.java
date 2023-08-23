package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    numbers
            .stream().filter(number -> number % 2 == 0)
            .forEach(System.out::println);
    numbers.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer integer) {
        if (integer % 2 == 0) {
          System.out.println(integer);
        }
      }
    });

    numbers.forEach(integer -> {
              if (integer % 2 == 0) {
                System.out.println(integer);
              }
            }
    );
  }
}
