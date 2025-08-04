import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestCar {
    public static void main(String[] args){
        // ArrayList<String> stringArr = new ArrayList<>();
        // stringArr.add("a");
        // stringArr.add("a");
        // stringArr.add("a");
        // stringArr.add("b");
        // stringArr.add("c");
        // Set<String> stringSet = new HashSet<>(stringArr);
        // System.out.println(stringArr);
        // System.out.println(stringSet);

    
    ArrayList<Car> carList = new ArrayList<>();

    carList.add(new Car("x ", 200));
    carList.add(new Car("x ", 200));
    carList.add(new Car("x ", 200));
    carList.add(new Car("y ", 200));
    carList.add(new Car("x ", 300));
    carList.add(new Car("z ", 500));
    System.out.println(carList);
    Set<Car> carSetNoDup = new HashSet<>(carList);
    System.out.println(carSetNoDup);
    }
}
