public class PracticeExecptions {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try{
        System.out.println(arr[5]); 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index is out of bounds");

        }
    }
}


    

