// Write a Java program that, given as input, details of an original book, represented by Book b1. The details include the book’s title, author’s name, and author’s age. Subsequently, the program should clone the original book to create a new book, denoted as Book b2. The cloning process should ensure that modifications to the details of either b1 or b2 do not affect the other.Finally, the program displays the details of both the original and cloned books.
// Complete the program as specified below.
// • Class Author implements Cloneable interface and has/should have the following members:
//    – Private instance variables String name and int age
//    – A constructor to initialize the instance variables
//    – Accessor and Mutator methods for the name and age
//    – Method toString to print in the format shown in the test cases
//    – Implement the clone() method
// • Class Book implements Cloneable interface and has/should have the following members:
//    – Private instance variables String title and an instance of the Author class.
//    – A constructor to initialize instance variables,taking the book’s title and an Author object.
//    – Method toString to print in the format shown in the test cases
//    – Mutator method to set new author
//    – Implement the clone() method
// • Class CloningTest contains the main method that takes the inputs in the order of book’s title, author’s name and age and invokes appropriate methods to achieve the functionality
// What you have to do
// • Define method clone in class Book
// • Define method clone in class Author

class Author implements Cloneable 
{
  private String name;
  private int age;

  public Author(String name, int age) 
  {
    this.name = name;
    this.age = age;
  }

  public String getName() 
  {
    return this.name;
  }

  public int getAge() 
  {
    return this.age;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public void setAge(int age) 
  {
    this.age = age;
  }

  @Override
  public String toString() 
  {
    return "Author: " + this.name + " (Age: " + this.age + ")";
  }

  // define method clone
  public Author clone() throws CloneNotSupportedException
  {
    return (Author)super.clone();
  }
}


class Book implements Cloneable 
{
  private String title;
  private Author author;

  public Book(String title, Author author) 
  {
    this.title = title;
    this.author = author;
  }

  public void setAuthor(Author author) 
  {
    this.author.setName(author.getName());
    this.author.setAge(author.getAge());
  }

  @Override
  public String toString() 
  {
    return "Book: " + this.title + "\n" + this.author;
  }
  // define method clone

  public Book clone() throws CloneNotSupportedException
  {
    Book clonedbook = (Book) super.clone();
    clonedbook.author = this.author.clone();
    return clonedbook;
  }
}


public class p54BookAndAuthorClone 
{
  public static void main(String[] args) throws CloneNotSupportedException 
  {
    Book b1 = new Book("Programming_Java", new Author("Alice",25));
    Book b2 = b1.clone();
    b2.setAuthor(new Author("Bob",28));
    System.out.println("Original Book:\n" + b1);
    System.out.println("Cloned Book:\n" + b2);
  }
}