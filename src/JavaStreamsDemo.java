import java.util.Arrays;
import java.util.List;

public class JavaStreamsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,78,23,98,7,56);

        List<Integer> doubled =
                numbers.stream()
                        .map(n -> n * 2)
                        .collect(java.util.stream.Collectors.toList());

        System.out.println(doubled);

    }
}
