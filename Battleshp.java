import java.util.*;

class GameLogic {
    int[] shipRows = new int[3];
    int[] shipCols = new int[3];
    boolean[] shipHits = new boolean[3];
    
    GameLogic() {
        Random rand = new Random();
        for(int i = 0; i < 3; i++) {
            shipRows[i] = rand.nextInt(5);
            shipCols[i] = rand.nextInt(5);
        }
    }
    
    int makeGuess(int row, int col) {
        for(int i = 0; i < 3; i++) {
            if(row == shipRows[i] && col == shipCols[i] && !shipHits[i]) {
                shipHits[i] = true;
                return 1; // hit
            }
        }
        return 0; // miss
    }
    
    boolean allShipsSunk() {
        return shipHits[0] && shipHits[1] && shipHits[2];
    }
}

public class Battleshp {
    public static void main(String[] args) {
        GameLogic game = new GameLogic();
        Scanner sc = new Scanner(System.in);
        
        
        
        while(true) {
            System.out.print("Give Row(0-4): ");
            int row = sc.nextInt();
            System.out.print("Give Column(0-4): ");
            int col = sc.nextInt();
            
            int result = game.makeGuess(row, col);
            if(result == 1) {
                System.out.println("hit");
                if(game.allShipsSunk()) {
                    System.out.println("sunk all ships, you  win");
                    break;
                }
            } else {
                System.out.println("miss");
            }
        }
    }
}
