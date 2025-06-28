public class Temperature {
    public static void main(String[] args){
        
        System.out.println(celsiusToFahrenheit(0));
        System.out.println(celsiusToFahrenheit(37));
        System.out.println(celsiusToFahrenheit(100));
    }
    public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9.0 / 5.0) + 32.0;
    }

}