import java.util.*;

class MapDemo {
  public static void main(String args[]) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(110, "anish");
    map.put(111, "abcd");
    map.put(112, "yyyy");
    map.putIfAbsent(113, "yzzy");
    System.out.println(map);

    for (Map.Entry m : map.entrySet()) {
      Integer key = 111;
      if (m.getKey() == key) {
        System.out.println("yes " + m.getValue());
      }
      System.out.println(m.getKey() + "  " + m.getValue());
    }
  }
}