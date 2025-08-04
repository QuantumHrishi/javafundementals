import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class TreeVsHashSet{


    public static void main(String[] args){
        Set<String> lettersh = new HashSet<String>();
        lettersh.add("d");
        lettersh.add("c");
        lettersh.add("a");
        lettersh.add("a");
        lettersh.add("b");

        System.out.println(lettersh);
        // Set<String> letterst = new TreeSet<String>();
        // lettersh.add("d");
        // lettersh.add("c");
        // letterst.add("a");
        // letterst.add("a");
        // letterst.add("b");
        // letterst.add("d");
        // letterst.add("c");
        // System.out.println(letterst);
    }

}