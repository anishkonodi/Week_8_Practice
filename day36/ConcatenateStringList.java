//Write a program that takes a list of strings as input and returns the concatenated string of all the elements in the list

import java.util.*;

class ConcatenateStringList{
  public static void main(String args[]) {
    List<String> ls = new ArrayList<String>();
    String newStr=" ";
    ls.add("32");
    ls.add("abac");
    ls.add("abacahdsd");
    ls.add("343");
    System.out.println(ls);
    System.out.println("After Concatenate all the strings in List");
    for(String str:ls){
      newStr=newStr+str;
    }
    System.out.println(newStr);
  }
}