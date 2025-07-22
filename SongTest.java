import java.util.ArrayList;
import java.util.Collections;

public class SongTest {
    public static void main(String[] args){
        ArrayList<Song> songList = new ArrayList<>();
        // for(int i = 1;i <=5;i++){
        //     Song x = new Song("Song " + i, i);
        //     songList.add(x);
        // }
        songList.add(new Song("Hare Rama ", 200));
        songList.add(new Song(" Rama ", 100));
        songList.add(new Song("Apple ", 400));
        songList.add(new Song("Zebra", 200));
        songList.add(new Song("Zebra", 300));
        songList.add(new Song("Zebra", 300));


        Collections.sort(songList, );
        
        System.out.println(songList);

     
    }
    
}
