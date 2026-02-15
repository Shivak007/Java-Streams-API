import java.util.Arrays;
import java.util.List;

public class JavaStreamsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,78,23,98,7,56);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
