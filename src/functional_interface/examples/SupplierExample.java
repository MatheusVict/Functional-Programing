package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

  public static void main(String[] args) {
    Supplier<String> greeting = () -> "Hello world!";

    List<String> greetingList = Stream
            .generate(greeting)
            .limit(10)
            .toList();


    greetingList.forEach(System.out::println);
  }
}
