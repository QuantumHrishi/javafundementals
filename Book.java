import java.util.Comparator;

public class Book{
    private String author;
    private int cost;
    Book(String author, int cost){
        this.author = author;
        this.cost = cost;

    }
    public String getAuthor(){
        return author;

    }
    public void setAuthor(String x){
        author = x;

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
   
    

    
}
class BookCompare implements Comparator<Book>{


    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
        
        
        
    }
}