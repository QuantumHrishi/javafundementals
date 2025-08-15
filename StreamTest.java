import java.util.*;
import java.util.stream.*;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        List<Integer> sqNumber= new ArrayList<>();
        for (int k= 0; k < 2000; k++) {
            sqNumber.add(k * k);
        }
        // sqNumber.stream().forEach(System.out::println);
        
        // Filter and collect
        List<Integer> evenNumbers = numbers.stream()
             .filter(n -> n % 2 == 0)
             .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        
        // Map and collect
        List<String> upperNames = names.stream()
            .map(s-> s.toUpperCase())
            .collect(Collectors.toList());
        System.out.println("Upper names: " + upperNames);
        
        // Reduce
        int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        
        // Find first
        Optional<String> firstLongName = names.stream()
            .filter(name -> name.length() > 5)
            .findFirst();
        System.out.println("First long name: " + firstLongName.orElse("None"));

        List<String> beans = List.of("Arabica", "Robusta", "Liberica");

        beans.stream()
            .filter(bean -> !bean.equals("Liberica")) // Predicate: skip Liberica
            .map(bean -> bean + " Coffee")            // Function: make drink name
            .forEach(drink -> System.out.println("Serving " + drink)); // Consumer

        }
}
