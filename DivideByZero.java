import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        
        try{
            System.out.println(n1/n2);
        }catch(ArithmeticException e){
            System.out.println("cant divide by zero");

        }

    
    }
    

}
