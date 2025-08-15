import java.util.List;

public class PracticeTest {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "apple", "dog", "ant");
        words.stream()
            .filter(word -> word.startsWith("C")) // Filter for names starting with 'C'
            .findFirst();
            
    }
    
}
