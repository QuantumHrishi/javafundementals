import java.util.ArrayList;
import java.util.Collections;

public class TestBook {
    public static void main(String[] args){

    
    ArrayList<Book> bookList = new ArrayList<>();
    BookCompare x = new BookCompare();
    bookList.add(new Book("x ", 200));
    bookList.add(new Book("y", 200));
    bookList.add(new Book("Z ", 200));
    


    Collections.sort(bookList,x);
        
    System.out.println(bookList);
    }
}
