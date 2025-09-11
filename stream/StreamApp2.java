import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp2 {
    public static void main(String[] args) {
        Stream.iterate(0,x->x+2).limit(11).collect(Collectors.toList()).forEach(System.out::println);
    }
}
