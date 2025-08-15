import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap{
    public static void main(String[] args) {
        List<String> strings = List.of("h","d","w");
        System.out.println(strings);
        Set<Book> books= Set.of(new Book("hrishi",20),new Book("mom",30),new Book("dad",10));
        System.out.println(books);
        Map<String,String> letters = Map.ofEntries(Map.entry("a","z"),Map.entry("b","y"),Map.entry("c","x"));
        System.out.println(letters);
    }
}