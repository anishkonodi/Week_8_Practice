//Write a Java program to sort a given array list

import java.util.*;

class SortArrayList {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List<Integer> num = new ArrayList<Integer>();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      num.add(s.nextInt());
    }
    System.out.println("Before sorting ");
    System.out.println(num);
    Collections.sort(num);
    System.out.println("After sorting");
    System.out.println(num);
  }
}