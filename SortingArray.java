public class SortingArray{
    public static void main(String[] args) {
        int[] arr = {0, 2, 0, 1, 0, 1};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int x = 0; x < n - i - 1; x++) {
                if (arr[x] > arr[x + 1]) {
                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
            
    }
                
}
