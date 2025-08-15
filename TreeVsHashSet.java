import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class TreeVsHashSet{
    /*
     * Natural Order:
        Concept:
        Natural order is the inherent ordering of objects within a class, typically defined by implementing the Comparable interface and its compareTo() method.
        Examples:
        Numeric types (integers, floats, doubles): Sorted in numerical order (e.g., 1, 2, 10, 20).
        Character and String types: Sorted in lexicographical (alphabetical) order, based on Unicode values (e.g., "apple", "banana", "zebra"). This also means uppercase letters come before lowercase letters by default (e.g., "Apple" before "apple").
        Custom objects: If a custom class implements Comparable, its compareTo() method dictates its natural order.
        Alphabetical Order:
        Concept:
        .
        Alphabetical order is the specific natural order applied to String objects, arranging them based on the lexicographical comparison of their characters.
        Case Sensitivity:
        .
        By default, alphabetical order in Java is case-sensitive, meaning uppercase letters are considered "smaller" than their lowercase counterparts due to their Unicode values (e.g., "A" comes before "a").
        Numeric Strings:
        .
        When comparing strings containing numbers, alphabetical order treats each character individually. For example, "10" would come before "2" because '1' is lexicographically smaller than '2'. This differs from a "natural sort" for strings containing numbers, which would treat "10" as a single numerical value and place it after "2". 
        In summary: Alphabetical order is the natural order for strings in Java, but the broader concept of natural order applies to various data types, each with its own inherent ordering. It's important to remember the case-sensitive nature of standard alphabetical sorting in Java and how it handles numeric strings differently than a true "natural sort" algorithm designed for mixed alphanumeric data.

     * 
     */




    public static void main(String[] args){
        Set<String> lettersh = new HashSet<String>();
        lettersh.add("dog");
        lettersh.add("cat");
        lettersh.add("abc");
        lettersh.add("acd");
        lettersh.add("boy");
        lettersh.add("dog");

        System.out.println("HashSet "+ lettersh);
        System.out.println("Duplicates are not allowed in HashSet. There is no order in HashSet, so the output may vary each time you run the program.  ");
        Set<String> letterst = new TreeSet<String>();
        letterst.add("dog");
        letterst.add("cat");
        letterst.add("abc");
        letterst.add("acd");
        letterst.add("boy");
        letterst.add("dog");
        System.out.println("TreeSet " + letterst);
        System.out.println("Duplicates are not allowed in TreeSet. The elements are sorted in natural order, so the output will always be the same.");
        
        Book red = new Book("red", 0);
        Book blue = new Book("blue", 20);
        Book green = new Book("green", 10);
        Set intSet = new TreeSet<Book>();
        intSet.add(red);
        intSet.add(green);
        intSet.add(blue);
        intSet.add(green);
        System.out.println("TreeSet " + intSet);
    }

}