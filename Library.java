import java.util.ArrayList;
import java.util.Scanner;

class Book {

    private String title;
    private String author;
    private String genre;
    String copyType = "default";

    

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
    public String getType() {
        return copyType;
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
        copyType = "EBook";
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
    public void removeFromLibrary(Book book){
        libraryBooks.remove(book);
        
    }
    public ArrayList<Book> searchByTitle(String input){
        ArrayList<Book> a = new ArrayList<>();
        for(int i = 0; i < this.libraryBooks.size(); i++){
            Book x = this.libraryBooks.get(i);
            if(x.getTitle().equalsIgnoreCase(input)){
                a.add(x);
            }
        }
        return a;

    }
    public ArrayList<Book> searchByType(String input){
        ArrayList<Book> a = new ArrayList<>();
        for(int i = 0; i < this.libraryBooks.size(); i++){
            Book x = this.libraryBooks.get(i);
            if(x.getType().equalsIgnoreCase(input)){
                a.add(x);
            }
        }
        return a;

    }
        public static void main(String[] args) {
        Book book1 = new Book("b1", "a1", "g1");
        Book book2 = new EBook("b2", "a2", "g2");
        Book book3 = new EBook("b3", "a3", "g3");
        
        
        Scanner sc = new Scanner(System.in);
        
        Library plainsboroLibrary = new Library();
        plainsboroLibrary.printLibInfp();
        plainsboroLibrary.appendToLibrary(book1);
        plainsboroLibrary.appendToLibrary(book2);
        plainsboroLibrary.appendToLibrary(book3);
        plainsboroLibrary.printLibInfp();
        plainsboroLibrary.removeFromLibrary(book2);
        plainsboroLibrary.printLibInfp();
        String in = sc.nextLine();
        System.out.println(plainsboroLibrary.searchByTitle(in));
        
        String in1 = sc.nextLine();
        System.out.println(plainsboroLibrary.searchByType(in1));

    }
    

}