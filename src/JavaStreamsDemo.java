import java.util.Arrays;
import java.util.List;

public class JavaStreamsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,78,23,98,7,56);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Integer::compareTo)
                .ifPresent(min -> System.out.println("Minimum element: " + min));

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo)
                .ifPresent(max -> System.out.println("Maximum element: " + max));

    }
}
