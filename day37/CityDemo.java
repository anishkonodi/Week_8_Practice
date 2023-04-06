//Create a class called "City" with attributes "name" and "population". Create an ArrayList of City objects and add 3 cities to it. Print the name and population of each city. Increase the population of one city by 100,000 and print the updated information.

import java.util.*;

class City {
  String name;
  long population;

  City(String name, long population) {
    this.name = name;
    this.population = population;
  }

  String getName() {
    return name;
  }

  long getPopulation() {
    return population;
  }

}

class CityDemo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    ArrayList<City> city = new ArrayList<City>();
    System.out.println("enter city information");
    for (int i = 0; i < 3; i++) {
      System.out.println("enter name of the city " + (i + 1));
      String name = s.next();
      System.out.println("enter population of city " + (i + 1));
      long population = s.nextLong();
      city.add(new City(name, population));
    }
  System.out.println("Before updating population of the city ");
    for (City c : city) {
      System.out.println(c.getName() + " " + c.getPopulation());
    }

    System.out.println("enter city name to update population");
    String cName = s.next();

    for(City c:city){
      if(c.getName().equals(cName)){
        c.population=c.population+100000;
      }
    }
    System.out.println("After updating population of the city " + cName);
    for (City c : city) {
      System.out.println(c.getName() + " " + c.getPopulation());
    }
 
  }
}