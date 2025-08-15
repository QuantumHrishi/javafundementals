import java.util.ArrayList;
import java.util.Collections;

public class ListReverse {
    public static void main(String[] args) {
        ArrayList<Integer> listint = new ArrayList<>();
        listint.add(1);
        listint.add(2);
        listint.add(5);
        listint.add(7);
        listint.add(4);
        listint.add(3);
        listint.add(6);
        listint.add(8);
        System.out.println(listint);
        Collections.sort(listint);
        System.out.println(listint);
        Collections.reverse(listint);
        System.out.println(listint);
        
    }
    
}
