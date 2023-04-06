//Create a class called "Rectangle" with attributes "length" and "width". Create an ArrayList of Rectangle objects and add 4 rectangles to it. Print the length and width of each rectangle. Calculate and print the area of each rectangle.

import java.util.*;

class Rectangle {
  double length, width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getLength() {
    return length;
  }

  double getWidth() {
    return width;
  }

  double getArea() {
    double area = length * width;
    return area;
  }
}

class RectangleDemo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    ArrayList<Rectangle> rect = new ArrayList<Rectangle>();
    for (int i = 0; i < 2; i++) {
      System.out.println("Enter rectangle " + (i + 1) + " details :");
      rect.add(new Rectangle(s.nextDouble(), s.nextDouble()));
    }
    int i = 1;
    for (Rectangle obj : rect) {
      System.out.println("Rectangle " + i + " length and width is");
      System.out.println(obj.getLength() + "  " + obj.getWidth());
      System.out.println("The area of the rectangle " + i + " is " + obj.getArea());
      i++;
    }

    System.out.println("If you want to delete one rectangle press 1");
    int choice = s.nextInt();
    if (choice == 1) {
      System.out.println("Enter length of the rectangle to remove");
      double len = s.nextDouble();
      for (Rectangle re : rect) {
        if (len == re.getLength()) {
          rect.remove(rect.indexOf(re));
          break;
        }
      }
    }

    System.out.println("After deleting rectangle");
    i = 1;
    for (Rectangle obj : rect) {
      System.out.println("Rectangle " + i + " length and width is");
      System.out.println(obj.getLength() + "  " + obj.getWidth());
      System.out.println("The area of the rectangle " + i + " is " + obj.getArea());
      i++;
    }
  }
}