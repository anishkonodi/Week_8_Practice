import java.util.*;
class Employe{
  private String name;
  private double salary;
  private long eId;
  Employe(String name,double salary,long eId){
    this.name=name;
    this.salary=salary;
    this.eId=eId;
  }

  void setName(String name){
    this.name=name;
  }
  void setSalary(double salary){
    this.salary=salary;
  }
  void setEmployeeId(long eId){
    this.eId=eId;
  }
  String getName(){
    return this.name;
  }
  long getEmployeeId(){
    return this.eId;
  }
  double getSalary(){
    return this.salary;
  }
}

class Employees{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Employe> workers=new ArrayList<Employe>();
    System.out.println("Enter number of employees to add ");
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      workers.add(new Employe(s.next(),s.nextDouble(),s.nextLong()));
    }
    int i=1;
    for(Employe worker:workers){
      System.out.println("Employee "+i+" Details");
      System.out.println(worker.getName()+" "+worker.getSalary()+" "+worker.getEmployeeId());
      i++;
    }
  }
}