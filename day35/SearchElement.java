//Write a Java program to search an element in a array list.

import java.util.*;

class SearchElement {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List item = new ArrayList();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      item.add(s.next());
    }
    System.out.println("enter element to search");
    
    if(item.contains(s.next())){
      System.out.println("Found ");
    }
    else{
      System.out.println("Not found");
    }
    
  }
}