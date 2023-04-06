//Write a Java program to create a new array list, add some colors (string) and print out the collection

import java.util.*;
class Colour{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    List<String> str=new ArrayList<String>();
    System.out.println("enter the colours");
    for(int i=0;i<5;i++){
      str.add(s.next());
    }
    System.out.println("The colour collection is :: ");
    System.out.println(str);
  }
}