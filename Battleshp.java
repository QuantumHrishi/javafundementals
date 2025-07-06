import java.util.*;

class GameLogic {
    char[][] board = new char[5][5];
    int shipCount = 3;
    
    GameLogic() {
        // Initialize board
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                board[i][j] = '0';
            }
        }
        
        // place ships randomly
        Random rand = new Random();
        int placed = 0;
        while(placed < shipCount) {
            int row = rand.nextInt(5);// ship n row coord
            int col = rand.nextInt(5);// ship n col coord
                board[row][col] = '1'; // place ship marker
                placed++;
            }
        }
    }
    
    int makeGuess(int row, int col) {
        if(board[row][col] == '1') {
            board[row][col] = '1'; // hit
            shipCount--;
            return 1;
        } else if(board[row][col] == '0') {
            board[row][col] = 'O'; // miss
            return 0;
        }
        return -1; // already guessed
    }
    
    boolean allShipsSunk() {
        return shipCount == 0;
    }
    
    void printBoard() {
        System.out.println("  0 1 2 3 4");
        for(int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            for(int j = 0; j < 5; j++) {
                char display = board[i][j];
                System.out.print(display + " "); // display whole board to user
            }
            System.out.println();
        }
    }
}

public class Battleshp {
    public static void main(String[] args) {
        GameLogic game = new GameLogic();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            game.printBoard();
            System.out.print("Give Row(0-4): ");
            int row = sc.nextInt();
            System.out.print("Give Column(0-4): ");
            int col = sc.nextInt();
            
            int result = game.makeGuess(row, col);
            if(result == 1) {
                System.out.println("hit");
                game.board[row][col] = '0';// stops the user from hitting same place 3 times and getting all sunk result from it
                if(game.allShipsSunk()) {
                    game.printBoard();
                    System.out.println("sunk all, you win");
                    break;
                }
            } else if(result == 0) {
                System.out.println("miss");
            } 
            
        }
        sc.close();
    }
}
