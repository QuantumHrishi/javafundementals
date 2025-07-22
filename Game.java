public class Game implements Comparable{
    private String name;
    private String publisher;
    private int cost;
    public Game(String name, int cost, String publisher){
        this.name = name;
        this.cost = cost;
        this.publisher = publisher;

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
    public String getPublisher(){
        return publisher;

    }
    public void getPublisher(String z){
        publisher = z;

    }
    public String toString(){
        return ("Name: " + name + "cost: " + cost + " publisher" + publisher);
        
    }
   
    public int compareTo(Object o) {
        Game s =(Game)o;
    
        if(this.cost<s.getCost()) return 1;
        else if(this.cost==s.getCost()) return 0;
        else return -1;
       

    }

    
}
