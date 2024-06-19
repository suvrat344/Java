// Create a Book class for a library system.
// • Instance variables: title, author, isbn.
// • Static variable: totalBooks, a counter for the total number of book instances.
// • Instance methods: borrowBook(), returnBook().
// • Static method: getTotalBooks(), to get the total number of books in the library.


class Book
{
  private String title;
  private String author;
  private String isbn;
  private boolean isborrowed;
  private static int totalBooks;

  public Book(String title,String author,String isbn)
  {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public void borrowBook()
  {
    if(isborrowed)
    {
      System.out.println("Book is already borrowed");
    }
    else
    {
      isborrowed = true;
      System.out.println("Enjoy " + this.title);
    }
  }

  public void returnBook()
  {
    if(isborrowed)
    {
      isborrowed = false;
      System.out.println("Hope you enjoyed, Please leave a review.");
    }
    else
    {
      System.out.println("Book is already in the library");
    }
  }


  static
  {
    totalBooks = 0;
  }

  {
    totalBooks++;
  }

  public static void getTotalBooks()
  {
    System.out.println("Total books in the library : " + totalBooks);
  }
}


public class p11Book
{
  public static void main(String[] args) 
  {
      Book b1 = new Book("Programming in C","Yashwant Kanetkar","1234988324");
      b1.borrowBook();
      b1.returnBook();
      Book.getTotalBooks();
  }
}