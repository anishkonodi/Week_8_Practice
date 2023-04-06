
//Create a class called "Person" with attributes "name" and "age". Create an ArrayList of Person objects and add 7 people to it. Print the name and age of each person. Find the person with the highest age and print their name and age.
import java.util.*;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String getName() {
    return this.name;
  }

  int getAge() {
    return this.age;
  }
}

class PersonDemo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    ArrayList<Person> man = new ArrayList<Person>();
    for (int i = 0; i < 3; i++) {
      man.add(new Person(s.next(), s.nextInt()));
    }
    System.out.println("Name : age:");
    int hAge = 0;
    String pName=" ";
    for (Person p : man) {
      System.out.println(p.getName() + " " + p.getAge());
      if (hAge < p.getAge()) {
        hAge = p.getAge();
        pName = p.getName();
      }
    }
    System.out.println(" The person with the highest age is:");
    System.out.println(pName + "  Age is  " + hAge);
  }
}