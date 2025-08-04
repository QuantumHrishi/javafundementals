public class Car {
    private String color;
    private int cost;
    public boolean equals(Object x){
        Car y = (Car) x;
        return (cost == y.getCost());
    }
    public int hashCode(){
        return 1;
    }




    Car(String color, int cost){
        this.color = color;
        this.cost = cost;

    }
    public String getColor(){
        return color;

    }
    public void setColor(String x){
        color = x;

    }
    public int getCost(){
        return cost;

    }
    public void setCost(int y){
        cost = y;
    }
    public String toString(){
        return ("color: " + color + " cost: " + cost);
        
    }
    
}
