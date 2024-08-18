// Write a Java program that, given a list of books, prints the title of books whose publication year is between 2000 and 2022 (including 2000, 2022). Otherwise the program raises an exception and prints custom message. Complete the program as specified below.
// • Class PublicationYearOutOfBoundsException extends the Exception class and should have the following member:
//    – Constructor public PublicationYearOutOfBoundsException(String t) that takes the title of the book as argument. The constructor, initializes the error message as "Publication year of <book-title> is outside the acceptable range".
// • Class Book has/should have the following members:
//    – Private instance variables String title and int publicationYear
//    – Constructor to initialize these variables
//    – Method checkAndGetTitle should return the title of the book if the publicationYear is within the given limits. Otherwise, it should throw PublicationYearOutOfBoundsException.
// • Class ExceptionTest has the main method. It takes the title and publicationYear of four books as input, and invokes the method checkAndGetTitle of class Book to produce the specified output.
// What you have to do
// • Define class PublicationYearOutOfBoundsException
// • Define method checkAndGetTitle() in class Book

import java.util.ArrayList;

class PublicationYearOutOfBoundsException extends Exception
{
  public PublicationYearOutOfBoundsException(String message)
  {
    super(message);
  }
}


class Book 
{
  private String title;
  private int publicationYear;
  public Book(String title, int year) 
  {
    this.title = title;
    this.publicationYear = year;
  }
  public String checkAndGetTitle() throws PublicationYearOutOfBoundsException 
  {
    if(this.publicationYear >= 2000 && this.publicationYear <= 2022)
    {
      return this.title;
    }
    throw new PublicationYearOutOfBoundsException("Publication year of \"" +  this.title  + "\" is outside the acceptable range");
  }
}


public class p57BookAndPublicationException
{
  public static void main(String[] args) 
  {
    ArrayList<Book> bookList = new ArrayList<>();
    Book book1 = new Book("Book1", 1998);
    bookList.add(book1);
    Book book2 = new Book("Book2", 2025);
    bookList.add(book2);
    Book book3 = new Book("Book3", 2018);
    bookList.add(book3);
    Book book4 = new Book("Book4", 2015);
    bookList.add(book4);

    for (Book b : bookList) 
    {
      try 
      {
        String title = b.checkAndGetTitle();
        System.out.println(title);
      } 
      catch (PublicationYearOutOfBoundsException pe) 
      {
        System.out.println(pe.getMessage());
      }
    }
  }
}