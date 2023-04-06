import java.util.*;
class CheckItem{
  public static void main(String args[]){
    List<String> st=new ArrayList<String>();
    Scanner s=new Scanner(System.in);
    for(int i=0;i<5;i++){
      st.add(s.next());
    }
    if(st.contains("apple")){
      System.out.println("Found at index"+st.indexOf("apple"));
    }
    else{
      System.out.println("Not Found");
    }
    // int count=0;
    // for(String str:st){
    //   if(str.equals("apple")){
    //      System.out.println("Found at index"+st.indexOf("apple"));
    //     count=1;
    //   }
    // }
    // if(count==0){
    //   System.out.println("Not Found");
    // }
    
  }
}