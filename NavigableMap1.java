import java.util.NavigableMap; 
import java.util.TreeMap;

public class NavigableMap1 {
  public static void main(String args[]) {
    
    NavigableMap<String, String> nav = new TreeMap<String, String>();
    nav.put("A", "a");
    nav.put("B", "b");
    nav.put("C", "c");
    nav.put("D", "d");
    nav.put("E", "e");
    nav.put("F", "f");
    
    
  System.out.println(nav.ceilingKey("B"));
  System.out.println(nav.floorKey("B"));
  System.out.println(nav.pollFirstEntry());
  System.out.println(nav.pollLastEntry());
  System.out.println(nav.subMap("A", "D"));
    
 
  }
}
  