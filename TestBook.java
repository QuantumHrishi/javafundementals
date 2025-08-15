import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestBook {
    public static void main(String[] args){

    
    ArrayList<Book> bookList = new ArrayList<>();
    BookCompare x = new BookCompare();
    bookList.add(new Book("x ", 200));
    bookList.add(new Book("y", 200));
    bookList.add(new Book("Z ", 200));
    
    //Option 1:
    //Collections.sort(bookList, new BookCompare());
    //Option 2:
    // Comparator<Book> comp = new Comparator<>(){
    //     public int compare(Book o1, Book o2) {
    //         return o1.getAuthor().compareTo(o2.getAuthor());
    //     }
    // };
    // Collections.sort(bookList, comp);
    //Option 3:
    Collections.sort(bookList, (o1,o2)-> o1.getAuthor().compareTo(o2.getAuthor()));

    //bookList.sort((one,two) -> one.getAuthor().compareTo(two.getAuthor())) ;

        
    System.out.println(bookList);
    }
}
