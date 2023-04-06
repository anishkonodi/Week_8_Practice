//Write a Java program of swap two elements in an array list.

import java.util.*;

class SwapArrayList {
  public static void main(String args[]) {
    List ls = new ArrayList();
    ls.add(32);
    ls.add("abac");
    ls.add("abacahdsd");
    ls.add(342343);
    System.out.println(ls);
    Collections.swap(ls, 1, 3);

    System.out.println("After swaping ");
    System.out.println(ls);
  }
}