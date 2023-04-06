import java.util.*;

class EvenInList{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    List<Integer> ls=new ArrayList<Integer>();
    System.out.println("Enter numbers");
    for(int i=0;i<5;i++){
      ls.add(s.nextInt());
    }
    System.out.println("Even numbers in the list is");
    for(Integer n:ls){
      if(n%2==0){
        System.out.println(n);
      }
    }
  }
}