import java.util.ArrayList;

class Book {

    private String title;
    private String author;
    private String genre;
    String copyType;

    

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.copyType = "default";
        
        
    }

    public String getTitle() {
        return title;
    }

    
    public String getAuthor() {
        return author;
    }

    
    
    

    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }

    
    }



class EBook extends Book{

    public EBook(String title, String author, String genre) {
        super(title, author, genre);
        copyType = "E-Book";
    }

}
public class Library{
    public ArrayList<Book> libraryBooks = new ArrayList<>();

    public Library(){
        
        for(int i = 1; i <=10; i++){
            Book x = new Book("Book" + i, "author"+ i, "genre" + i);
            libraryBooks.add(x);
         }

    }
    public void printLibInfp() {
        for(Book b: libraryBooks){
            b.printBookInfo();
        }
    }
    public void appendToLibrary(Book book){
        libraryBooks.add(book);
    }

        public static void main(String[] args) {
        Book book1 = new Book("b1", "a1", "g1");
        Book book2 = new Book("b2", "a2", "g2");
        Book book3 = new Book("b3", "a3", "g3");
        
        

        
        Library plainsboroLibrary = new Library();
        plainsboroLibrary.printLibInfp();
        plainsboroLibrary.appendToLibrary(book1);
        plainsboroLibrary.appendToLibrary(book2);
        plainsboroLibrary.appendToLibrary(book3);
        plainsboroLibrary.printLibInfp();

    }
    

}