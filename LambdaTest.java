import java.util.*;
import java.util.function.*;

public class LambdaTest {
    public static void main(String[] args) {
        
        // 1. Basic lambda with no parameters
        Runnable greet = () -> System.out.println("Hello Lambda!");
        greet.run();
        
        // 2. Lambda with one parameter
        Consumer<String> print = name -> System.out.println("Name: " + name);
        print.accept("Alice");
        
        // 3. Lambda with two parameters
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(5, 3));
        
        // 4. Lambda returning a value
        Function<String, Integer> getLength = str -> str.length();
        System.out.println("Length: " + getLength.apply("Lambda"));
        
        // 5. Lambda with condition (Predicate)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        
        // 6. Lambda with multiple statements
        Consumer<List<String>> printList = list -> {
            System.out.println("List size: " + list.size());
            list.forEach(System.out::println);
        };
        printList.accept(Arrays.asList("Java", "Python", "C++"));
        
        // 7. Lambda for comparison
        Comparator<String> byLength = (s1, s2) -> s1.length() - s2.length();
        List<String> words = Arrays.asList("cat", "elephant", "dog");
        words.sort(byLength);
        System.out.println("Sorted by length: " + words);
        
        // 8. Lambda with stream filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
            .filter(n -> n > 3)
            .forEach(n -> System.out.println("Greater than 3: " + n));
        
        // 9. Lambda with stream map
        List<String> names = Arrays.asList("john", "jane", "bob");
        names.stream()
            .map(name -> name.toUpperCase())
            .forEach(name -> System.out.println("Upper: " + name));
        
        // 10. Lambda with custom functional interface
        Calculator multiply = (x, y) -> x * y;
        Calculator divide = (x, y) -> x / y;
        System.out.println("Multiply: " + multiply.calculate(6, 4));
        System.out.println("Divide: " + divide.calculate(8, 2));
    }
    
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }
}