class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class TestExecptions {
    public static void main(String[] args) throws MyCustomException {
        System.out.println("before");
        if(1==1){
            throw new MyCustomException("Custom problem occurred");
        }
        else{
            System.out.println("after");
        }
        
        
    }
}
