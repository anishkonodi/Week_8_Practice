//Create a class called "Student" with attributes "name", "id", and "major". Create an ArrayList of Student objects and add 6 students to it. Print the name and major of each student. Change the major of one student and print the updated information.
import java.util.*;

class Student{
  String name;
  long id;
  String major;

  Student(String name, long id,String major) {
    this.name = name;
    this.id=id;
    this.major=major;
  }
   void setMajor(String major){
     this.major=major;
   }
  String getName() {
    return name;
  }

  long getId() {
    return id;
  }
  String getMajor(){
    return major;
  }

}

class StudentDetails {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    ArrayList<Student> st= new ArrayList<Student>();
    System.out.println("Enter students information");
    for (int i = 0; i < 3; i++) {
      System.out.println("enter name of the student " + (i + 1));
      String name = s.next();
      System.out.println("enter id of student " + (i + 1));
      long id= s.nextLong();
      System.out.println("enter major of student " + (i + 1));
      String major=s.next();
      st.add(new Student(name,id,major));
    }
  System.out.println("Before updating major of the student");
    for (Student stu :st) {
      System.out.println(stu.getName() + " " + stu.getId()+" "+stu.getMajor());
    }

    System.out.println("enter Student name to update major");
    String sName = s.next();

    for(Student stu:st){
      if(stu.getName().equals(sName)){
        System.out.println("enter major to update");
        String major=s.next();
        stu.setMajor(major);
      }
    }
    System.out.println("After updating student major" + sName);
    for (Student stu :st) {
      System.out.println(stu.getName() + " " + stu.getId()+" "+stu.getMajor());
    }
 
  }
}