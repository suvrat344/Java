// Complete the following code to get the given output.
// The Library class has a static variable No_Of_Books which gets incremented using the default constructor
// The displayBookInfo method uses the concept of dependency of Library on Books and takes Books object as a parameter and displays its information accordingly
// The changeBookName method takes as argument a new book name and uses it to set the book name using the appropriate mutator method
// The Books class has a method readBook which prints "Reading a book..." 
// The Special_Books class has to Overridethis readBook method and print "Reading a special book..." as shown in the output
// REQUIRED OUTPUT:
// Reading a book...
// Reading a special book...
// Name : book 2
// Author Name : author 2
// ISBN : 5341
// Changed Book Name : new book 1
// Total number of books : 2   


class Library
{
    public static int No_Of_Books;
    public String Name;

    public Library()
    {
        No_Of_Books++;      
    }

    public Library(String Name)
    {
        this.Name = Name;
    }
    
    public void displayBookInfo(Books obj)
    {
        System.out.println("Name : " + obj.getName());
        System.out.println("Author Name : " + obj.getAuthor());
        System.out.println("ISBN : " + obj.getISBN());
    }
    
    public void changeBookName(Books obj,String name)
    {
        obj.setName(name);
    }
}  


class Books extends Library
{
    private String Name;
    private String Author;
    private int ISBN;
                                                                                                            
    public Books(String Name, String Author, int ISBN)
    {
        this.Name = Name;
        this.Author = Author;
        this.ISBN = ISBN;
    }                                                                                                                                            
    public String getName()
    {
        return this.Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getAuthor()
    {
        return this.Author;
    }

    public void setAuthor(String author)
    {
        this.Author = author;
    }

    public int getISBN()
    {
        return this.ISBN;
    }

    public void setISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }

    public void readBook()
    {
        System.out.println("Reading a book...");
    } 
}                                                                                                                                                      
                                                                                                                                                   
class Special_Books extends Books
{
    private String Genre;

    public Special_Books(String Name, String Author, int ISBN, String Genre)
    {
        super(Name, Author, ISBN);
        this.Genre = Genre;
    }

    public String getGenre()
    {
        return this.Genre;
    }

    public void setGenre(String Genre)
    {
        this.Genre = Genre;
    }

    @Override
    public void readBook()
    {
        System.out.println("Reading a special book...");
    }
}


public class p61Library
{
    public static void main(String args[])
    {
        Books b1 = new Books("book 1", "author 1", 1273);
        b1.readBook();

        Books b2 = new Special_Books("book 2", "author 2", 5341,"Fiction");
        b2.readBook();

        Library l = new Library("New Library");
        l.displayBookInfo(b2);
        l.changeBookName(b1, "new book 1");
        System.out.println("Changed Book Name : " + b1.getName());
        System.out.println("Total number of books : " + Library.No_Of_Books);
    }
}