//Write a Java program to reverse elements in a array list.

import java.util.*;

class ReverseArrayList {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List item = new ArrayList();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      item.add(s.next());
    }
    System.out.println("Before reverse ");
    System.out.println(item);
    Collections.reverse(item);
    System.out.println("After sorting");
    System.out.println(item);
  }
}