import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        new Gamex().play();
    }
}

class Gamex {
    private int target;
    Scanner in;
    
    public Gamex() {
        target = new Random().nextInt(100) + 1;
        in = new Scanner(System.in);
    }
    
    public void play() {
        for (int tries = 1; tries <= 7; tries++) {
            System.out.print("Guess " + tries + "/7: ");
            int guess = in.nextInt();
            
            if (guess == target) {
                System.out.println("You won in " + tries + " tries.");
                return;
            }
            System.out.println(guess > target ? "Too high" : "Too low");
        }
        System.out.println("The number was " + target);
    }
}