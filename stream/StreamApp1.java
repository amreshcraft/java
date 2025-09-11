import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamApp1 {

    public static void main(String[] args) {

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().map(x -> x * x)
                .collect(Collectors.toList()).forEach(System.out::println);

                
    }
}