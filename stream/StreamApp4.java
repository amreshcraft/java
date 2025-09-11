import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp4 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./data.txt");
        Stream<String> stream = Files.lines(path,StandardCharsets.UTF_8);
        stream.limit(3).collect(Collectors.toList()).forEach(System.out::println);
    }
}
