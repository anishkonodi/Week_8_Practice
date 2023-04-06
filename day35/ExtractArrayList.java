//Write a Java program to extract a portion of a array list.

import java.util.*;

class ExtractArrayList {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List item = new ArrayList();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      item.add(s.next());
    }
    System.out.println("Array elements");
    System.out.println(item);
    System.out.println("Extracted portion");
    System.out.println(item.subList(1, 3));
  }
}