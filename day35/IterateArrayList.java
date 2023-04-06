//Write a Java program to iterate through all elements in a array list

import java.util.*;

class IterateArrayList {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List<Integer> num = new ArrayList<Integer>();
    System.out.println("enter the elements to add ");
    for (int i = 0; i < 5; i++) {
      num.add(s.nextInt());
    }
    System.out.println("The elements added in the ArrayList is :: ");
    for (Integer n : num) {
      System.out.println(n);
    }

  }
}