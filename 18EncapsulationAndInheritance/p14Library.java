// Start with a base class LibraryItem that includes common attributes like itemID, title, and author, and methods like checkout() and returnItem(). Create subclasses such as Book, Magazine, and DVD, each inheriting from LibraryItem. Add unique attributes to each subclass, like ISBN for Book, issueNumber for Magazine, and duration for DVD


class LibraryItem
{
  public String itemID;
  public String title;
  public String author;

  public void checkout()
  {
    System.out.println("Item has to be taken by customer.");
  }

  public void returnItem()
  {
    System.out.println("Item has to be returned by customer.");
  }
}


class Book extends LibraryItem
{
  public String isbn;

  public void displayBookDetail()
  {
    System.out.println("\nBook Detail");
    System.out.println("Item ID : " + itemID);
    System.out.println("Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("ISBN : " + isbn);
  }
}

class Magazine extends LibraryItem
{
  public String issueNumber;

  public void displayMagazineDetail()
  {
    System.out.println("\nMagazine Detail");
    System.out.println("Item ID : " + itemID);
    System.out.println("Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("Issue Number : " + issueNumber);
  }
}

class DVD extends LibraryItem
{
  public String duration; 

  public void displayDVDDetail()
  {
    System.out.println("\nDVD Detail");
    System.out.println("Item ID : " + itemID);
    System.out.println("Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("Duration : " + duration);
  }
}


public class p14Library
{
  public static void main(String[] args) 
  {
      Book b1 = new Book();
      b1.itemID = "101";
      b1.title = "Goes Far";
      b1.author = "Jones F";
      b1.isbn = "123-456-789";
      b1.displayBookDetail();

      Magazine m1 = new Magazine();
      m1.itemID = "201";
      m1.title = "Goes Beyond";
      m1.author = "Times";
      m1.issueNumber = "378-423-582";
      m1.displayMagazineDetail();

      DVD d1 = new DVD();
      d1.itemID = "301";
      d1.title = "Infinity";
      d1.author = "Reynolds";
      d1.duration = "243";
      d1.displayDVDDetail();  
  }
}