//Write a Java program to copy one array list into another

import java.util.*;

class CopyArrayList{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List ls1 = new ArrayList();
    List ls2=new ArrayList();
    System.out.println("enter the elements");
    for (int i = 0; i < 5; i++) {
      ls1.add(s.next());
    }
    System.out.println("The elements in List one");
    System.out.println(ls1);
   // Collection.copy(ls2,ls1);
    ls2.addAll(ls1);
    System.out.println("After copying contents from list one to list 2");
    System.out.println(ls2);
  }
}