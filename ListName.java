import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> nameList = new HashSet<>();

        String x = in.nextLine();
        while(!(x.equalsIgnoreCase("q"))){
            nameList.add(x.toLowerCase());
            x = in.nextLine();
        }
        in.close();
        
        System.out.println(nameList);

        
    }
    
}
