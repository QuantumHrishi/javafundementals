public class Song implements Comparable{
    private String singer;
    private int cost;
    Song(String singer, int cost){
        this.singer = singer;
        this.cost = cost;

    }
    public String getSinger(){
        return singer;

    }
    public void setSinger(String x){
        singer = x;

    }
    public int getCost(){
        return cost;

    }
    public void setCost(int y){
        cost = y;
    }
    public String toString(){
        return ("singer: " + singer + "cost: " + cost);
        
    }
   
    public int compareTo(Object o) {
        Song s =(Song)o;
        if(this.singer.equals(s.getSinger())){
            if(this.cost<s.getCost()) return 1;
            if(this.cost==s.getCost()) return 0;
            else return -1;
        }
        else{
            return (this.singer.compareTo(s.getSinger()));
        }

    }

}