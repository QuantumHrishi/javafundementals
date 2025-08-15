import java.util.*;
import java.util.stream.*;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        
        // 1. filter() - Get even numbers
        List<Integer> evens = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
        
        // 2. map() - Convert to uppercase
        List<String> upperNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("Uppercase names: " + upperNames);
        
        // 3. forEach() - Print each element
        System.out.print("Numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        // 4. reduce() - Sum all numbers
        int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        
        // 5. sorted() - Sort names alphabetically
        List<String> sortedNames = names.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);
        
        // 6. distinct() - Remove duplicates
        List<Integer> withDuplicates = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
        List<Integer> unique = withDuplicates.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Unique numbers: " + unique);
        
        // 7. limit() - Get first 3 elements
        List<String> firstThree = names.stream()
            .limit(3)
            .collect(Collectors.toList());
        System.out.println("First 3 names: " + firstThree);
        
        // 8. count() - Count elements matching condition
        long longNames = names.stream()
            .filter(name -> name.length() > 4)
            .count();
        System.out.println("Names longer than 4 chars: " + longNames);
        
        // 9. anyMatch() - Check if any element matches
        boolean hasLongName = names.stream()
            .anyMatch(name -> name.length() > 6);
        System.out.println("Has name longer than 6 chars: " + hasLongName);
        
        // 10. findFirst() - Get first matching element
        Optional<Integer> firstEven = numbers.stream()
            .filter(n -> n % 2 == 0)
            .findFirst();
        System.out.println("First even number: " + firstEven.orElse(-1));
    }
}