import java.util.ArrayList;
import java.util.Collections;

public class GameTest {
    public static void main(String[] args){
        ArrayList<Game> listGames = new ArrayList<>();
        
        listGames.add(new Game("snake", 2, "1"));
        listGames.add(new Game("Snake 2", -4, "2"));
        listGames.add(new Game("minesweeper", 1, "3"));
        listGames.add(new Game("abc", 3, "4"));
        

        System.out.println(listGames);
        Collections.sort(listGames);
        
        System.out.println(listGames);

    }
}
