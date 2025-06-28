public class Dog{
    public static void main(String[] args){
        DogClass dog1 = new DogClass(90);
        DogClass dog2 = new DogClass(30);
        DogClass dog3 = new DogClass(10);
        DogClass dog4 = new DogClass(0);
        System.out.println(dog1.bark());
        System.out.println(dog2.bark());
        System.out.println(dog3.bark());
        System.out.println(dog4.bark());
    }
}
class DogClass {
    int size =0;
    DogClass(int weight){
        size = weight;
    }
    
    
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