public class Dog{
    public static void main(String[] args){
        DogClass dog1 = new DogClass(90);
        DogClass dog2 = new DogClass(30);
        DogClass dog3 = new DogClass(10);
        DogClass dog4 = new DogClass(0);
        dog1.bark();
        dog2.bark();
        dog3.bark();
        dog4.bark();
    }
}
class DogClass(int weight){
    int size = weight;
    
    String bark(){
        if (size > 50){
            return "Bark Bark";
        }
        else if (size >20){
            return " ruff ruff";
        }
        else if (size > 0){
            return "Yip Yip";
        }
        else{
            return "dead dog";
        }
    }
}