public class Dog1 {
    
    public static void main(String[] args) {
        Dogdostuff firstdog = new Dogdostuff();
        Dogdostuff seconddog = new Dogdostuff();
        Dogdostuff thirddog = new Dogdostuff();
        System.out.println(firstdog.bark());
        System.out.println(seconddog.bark());
        System.out.println(thirddog.bark());
    }



}
class Dogdostuff {
    String name;
    String breed;

    public String bark(){
        return "bark bark!";
    }
}
