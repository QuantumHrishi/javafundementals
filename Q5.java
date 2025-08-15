import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        
    
    List<Integer> nums = List.of(1, 2, 3, 4);
    int runningTotal = 0;
    for (Integer n : nums) {
        runningTotal += n;
    }
    System.out.println(runningTotal);

    System.out.println(nums.stream().reduce(0, (int1,int2) -> int1+int2));
    
    }
                
}
