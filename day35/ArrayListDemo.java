import java.util.*;
class ArrayListDemo{
public static void main(String args[]){
    List list=new ArrayList();
    list.add(123);
    list.add("Anish");
    list.add(77.77);
    System.out.println(list);
   for( Object obj:list){
     System.out.println(obj);
   }

  List lis=new ArrayList();
    Scanner sc=new Scanner(System.in);
    lis.add(sc.next());
    lis.add(sc.next());
    lis.add(sc.next());
    System.out.println(lis);
    for(Object str:lis){
      System.out.println(str);
    }

    List<Integer> l=new ArrayList<Integer>();
    l.add(123);
    l.add(124);
    l.add(127);
   System.out.println(l);
    for(Integer i:l)
    {
      System.out.println(i);
    }

   List<Float> lt=new ArrayList<Float>();
   // Scanner sc=new Scanner(System.in);
    lt.add(sc.nextFloat());
    lt.add(sc.nextFloat());
    lt.add(sc.nextFloat());
    lt.add(sc.nextFloat());
    System.out.println(lt);
    for(Float i:lt)
    {
      System.out.println(i);
    } 
 }
}
