public class MusicPlaylist {
    public static void main(String[] args){
        String[][] musicPlaylist = {
            {"s1","a1"},
            {"s2","a2"},
            {"s3","a3"},

        };
        for (int i = 0; i < musicPlaylist.length; i++) {
            for (int j = 0; j < musicPlaylist[i].length; j++) {
                if(j==0){
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
