public class MusicPlaylist {
    public static void main(String[] args){
        String[][] musicPlaylist = {
            {"s1","a1"},
            {"s2","a2"},
            {"s3","a3"},

        };
        for (int i = 0; i < musicPlaylist.length; i++) { // outer loop each slot
            for (int j = 0; j < musicPlaylist[i].length; j++) { // inner loop for each song and artist of song
                if(j==0){ // checking to label the values with either song or artist
                    System.out.print("Song:");
                }
                else{
                    System.out.print("Artist:");
                }
                System.out.print(musicPlaylist[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
