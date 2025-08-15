import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison {

    public static void main(String[] args) {
        /*
         * Key differences illuminated by the example
            Ordering: This is the most significant difference.
            HashMap does not guarantee any specific order when iterating through its elements. The output order for the HashMap example will likely be different each time you run the code or add/remove elements.
            TreeMap, on the other hand, always maintains its entries in a sorted order based on the natural ordering of its keys (alphabetical for strings in this case). The TreeMap output will consistently list the students in alphabetical order.
            Implementation:
            HashMap uses a hash table internally, which relies on hash codes of keys for efficient storage and retrieval.
            TreeMap uses a Red-Black tree, which is a self-balancing binary search tree. This tree structure is what enables it to maintain the sorted order of its keys.
            Performance:
            HashMap offers, on average, constant-time complexity (O(1)) for operations like put(), get(), and remove(), making it generally faster for basic operations. However, in the worst case (due to hash collisions), performance can degrade to O(n).
            TreeMap has a logarithmic time complexity (O(log n)) for the same operations due to the overhead of maintaining the sorted order in its tree structure.
            Null Handling:
            HashMap allows one null key and multiple null values.
            TreeMap does not allow null keys when using natural ordering, as it relies on compareTo() which would throw a NullPointerException. However, it does allow multiple null values.
            TreeMap-specific Operations: The sorted nature of TreeMap enables specialized methods for range operations, such as firstEntry(), lastEntry(), and subMap(), which are not available in HashMap. 
            Choosing between HashMap and TreeMap
            Use HashMap when:
            You need the fastest possible access and insertion for key-value pairs.
            The order of elements is not important for your application.
            You want to allow a single null key (along with multiple null values).
            Use TreeMap when:
            You need to maintain the keys in a sorted order (naturally or custom).
            You need to perform operations that rely on sorted order, such as finding the smallest/largest key, iterating in order, or querying for keys within a specific range. 
            In this example, we'll demonstrate the differences in behavior between HashMap and TreeMap by performing operations on both data structures.       
          */




        // Using HashMap
        System.out.println("--- HashMap Example ---");
        Map<String, Integer> studentScoresHashMap = new HashMap<>();

        studentScoresHashMap.put("Alice", 85);
        studentScoresHashMap.put("Bob", 92);
        studentScoresHashMap.put("Charlie", 78);
        studentScoresHashMap.put("David", 95);
        studentScoresHashMap.put("Eve", 88);

        // Iterating over HashMap (no guaranteed order)
        System.out.println("HashMap entries (iteration order is unpredictable):");
        for (Map.Entry<String, Integer> entry : studentScoresHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Retrieving a value
        System.out.println("\nBob's score (HashMap): " + studentScoresHashMap.get("Bob"));

        // Using TreeMap
        System.out.println("\n--- TreeMap Example ---");
        Map<String, Integer> studentScoresTreeMap = new TreeMap<>();
        studentScoresTreeMap.put("Charlie", 78);
        studentScoresTreeMap.put("Alice", 85);
        studentScoresTreeMap.put("Bob", 92);
        
        studentScoresTreeMap.put("David", 95);
        studentScoresTreeMap.put("Eve", 88);

        // Iterating over TreeMap (keys are sorted alphabetically)
        System.out.println("TreeMap entries (keys are sorted naturally):");
        for (Map.Entry<String, Integer> entry : studentScoresTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Retrieving a value
        System.out.println("\nBob's score (TreeMap): " + studentScoresTreeMap.get("Bob"));

        // TreeMap-specific operations (based on sorted order)
        System.out.println("\nFirst student alphabetically (TreeMap): " + ((TreeMap<String, Integer>) studentScoresTreeMap).firstEntry());
        System.out.println("Last student alphabetically (TreeMap): " + ((TreeMap<String, Integer>) studentScoresTreeMap).lastEntry());
        System.out.println("Students with keys between C and E (exclusive) (TreeMap): " + ((TreeMap<String, Integer>) studentScoresTreeMap).subMap("C", false, "E", false));
    }
}

