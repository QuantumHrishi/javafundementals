import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class CompareValues {
     public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
    {
        
        Comparator<K> valueComparator = new Comparator<K>() {
          
                  
                  public int compare(K k1, K k2){
                      int comp = map.get(k1).compareTo(map.get(k2));
                      if (comp == 0)
                          return 1;
                      else
                          return comp;
                  }
          
              };
      
        
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
      
        sorted.putAll(map);
      
        return sorted;
    }
  
    public static void main(String[] args)
    {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        
        map.put("Hrishi", 4);
        map.put("raj", 2);
        map.put("angela", 5);
        map.put("anjali", 3);
       

        
        Map sortedMap = valueSort(map);

       
        Set set = sortedMap.entrySet();

        
        Iterator i = set.iterator();

        
        while (i.hasNext()) {
          
            Map.Entry mp = (Map.Entry)i.next();
            System.out.print(mp.getKey() + ": ");
            System.out.println(mp.getValue());
          
        }
    
    }
}
