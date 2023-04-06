import java.util.*;

public class HashSetDemo{
  public static void main(String args[]) {
    HashSet<String> set = new HashSet<String>();
    set.add("red");
    set.add("yellow");
    set.add("Black");
    set.add("black");
    set.add("black");
    set.add("pink");
    System.out.println(set);
  }
}