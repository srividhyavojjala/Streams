package in.streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("Even numbers in the list:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(num->System.out.println(num));
    }
}
