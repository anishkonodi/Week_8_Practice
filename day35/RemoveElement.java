//Write a Java program to remove the third element from a array list

import java.util.*;

class RemoveElement {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List<Integer> num = new ArrayList<Integer>();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      num.add(s.nextInt());
    }
    System.out.println("Before removing ");
    System.out.println(num);
    System.out.println("Enter index position to retrieve the element ");
    num.remove(s.nextInt());
    System.out.println("After retrieve the specific index position");
    System.out.println(num);
  }
}