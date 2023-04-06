//Write a Java program to join two array lists.

import java.util.*;

class JoinArrayList {
  public static void main(String args[]) {
    List ls = new ArrayList();
    List ls1 = new ArrayList();
    ls.add(123);
    ls.add("abs");
    ls.add(455);
    ls1.add("abcd");
    ls1.add(2344);
    ls1.add(5666);
    ls1.add("egrt");
    List jList = new ArrayList();
    jList.addAll(ls);
    jList.addAll(ls1);
    System.out.println(jList);
  }
}