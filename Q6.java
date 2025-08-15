import java.util.function.Consumer;

public class Q6{
    public static void main(String[] args){
        
        StringChecker x = str -> x.check(str);

    
        
    }

}
abstract class StringChecker{
    boolean check(String s){
        if(s.length()>5){
            return true;
        }
        else{
            return false;
        }
    }
}