//Write a Java program to insert an element into the array list at the first position

import java.util.*;

class InsertFirst{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List<Integer> num = new ArrayList<Integer>();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      num.add(s.nextInt());
    }
    System.out.println("Before inserting ");
    System.out.println(num);
    System.out.println("Enter element to insert at first position");
    num.add(0, s.nextInt());
    System.out.println("After inserting at first position");
    System.out.println(num);
  }
}