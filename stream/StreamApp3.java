import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp3 {
    public static void main(String[] args) {
        Stream.generate(Math::random).map(x->Math.round(x*100)).limit(11).collect(Collectors.toList()).forEach(System.out::println);
    }
}
