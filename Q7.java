import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q7 {
    public static void main(String[] args) {
        
    List<String> names = List.of("Anna", "Bob", "Alex", "Brian", "Amanda");
    System.out.println(names.parallelStream().filter(s -> s.startsWith(String.valueOf("A"))).collect(Collectors.toList()));


    }
    
}
