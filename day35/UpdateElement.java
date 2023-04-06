//Write a Java program to update specific array element by given element

import java.util.*;

class UpdateElement {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List item = new ArrayList();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      item.add(s.next());
    }
    System.out.println("Before Updating");
    System.out.println(item);
    System.out.println("enter the element to replace with new value ");
 
    int index = item.indexOf(s.next());
    System.out.println("enter element to be replced ");
    item.set(index, s.next());
    System.out.println("After the Updation");
    System.out.println(item);
  }
}