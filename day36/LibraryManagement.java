import java.util.*;

class Library {
  private String title, author, publisher;
  private int bNum;

  Library(String title, String author, String publisher, int bNum) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.bNum = bNum;
  }

  void setTitle(String title) {
    this.title = title;
  }

  void setAuthor(String author) {
    this.author = author;
  }

  void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  void setBookNumber(int bNum) {
    this.bNum = bNum;
  }

  String getTitle() {
    return this.title;
  }

  String getAuthor() {
    return this.author;
  }

  String getPublisher() {
    return this.publisher;
  }

  int getBookNumber() {
    return this.bNum;
  }
}

class LibraryManagement {
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    ArrayList<Library> book = new ArrayList<Library>();
    for (int i = 0; i < 2; i++) {
      book.add(new Library(sc.next(), sc.next(), sc.next(), sc.nextInt()));
    }
    for (Library Book : book) {
      System.out.println(Book.getBookNumber() + " " + Book.getTitle() + " " + Book.getAuthor() + " " + Book.getPublisher());
    }
  }
}

