import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
import java.util.*;
public class Book{
    private String author;
    private String name;
    private int cost;
    Book(String author, String name, int cost){
        this.author = author;
        this.cost = cost;
        this.name = name;

    }
    public int compareTo(Object o){
        Book x = (Book)o;
        if(this.cost > x.getCost()) return 1;
        if(this.cost < x.getCost()) return -1;
        else return 0;
    }
    public String getAuthor(){
        return author;

    }
    public void setAuthor(String x){
        author = x;

    }
    public String getName(){
        return name;

    }
    public void setName(String x){
        name = x;

    }
    public int getCost(){
        return cost;

    }
    public void setCost(int y){
        cost = y;
    }
    public String toString(){
        return ("author: " + author + "cost: " + cost);
        
    }
    public static void main(String[] args) {
            Book b1 = new Book("Hrishi", "abc", 20);
            Book b2 = new Book("Hrishi", "abc", 10);
            Book b3 = new Book("Hrishi", "abc", 34235);
            Book b4 = new Book("sfj", "abc",34 );
            Book b5 = new Book("sfs", "abc", 45323);
            Book b6 = new Book("dfg", "abc", 10);
            Book b7 = new Book("dfgdg", "abc",20 );
            Book b8 = new Book("Hrishi", "abc", 40);
            Book b9 = new Book("Hrishi", "abc", 30);
            List<Book> bookList = List.of(b1, b2, b3,b4,b5,b6,b7,b8,b9);

            bookList.stream()
                .filter(b -> b.getAuthor().equals("Hrishi"));


               
            

    }

        

    

    
}
