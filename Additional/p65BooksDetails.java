// class Books and class Library have been provided in the below code.
// Implement the toString method in Books as required by the output provided in the test cases.
// Library has a private instance variable called books which stores unique records as key value pairs.
// Each key is a combination of title and author as given by the addBook method and each value is a book object.
// Complete the constructor for Library and the searchByGenre method to return the list of books in the library which have the given genre.
// Sample Test Case Output:
// List of books in the Fantasy genre:
// - Book{title='The Lord of the Rings', author='J.R.R. Tolkien', publicationYear=1954, genre='Fantasy'}

import java.util.*;

class Book 
{
    private String title;
    private String author;
    private int publicationYear;
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) 
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getAuthor() 
    {
        return this.author;
    }

    public int getPublicationYear() 
    {
        return this.publicationYear;
    }

    public String getGenre() 
    {
        return this.genre;
    }

    @Override
    public String toString()
    {
        return "Book{title=\'" + this.getTitle() + "\', " + " author=\'" + this.getAuthor() + "\', " + "publicationYear=" + this.getPublicationYear() + ", " + "genre=\'" + this.getGenre() +"\'}";
    }
}


class Library 
{
    private Map<String,Book> books;

    public Library() 
    {
        this.books = new HashMap<>();
    }

   
    public void addBook(Book book) 
    {
        String key = book.getTitle() + "-" + book.getAuthor();
        books.put(key, book);
    }

    public List<Book> searchByGenre(String genre) 
    {
        List<Book> user_category = new ArrayList<>();
        for(Map.Entry<String,Book> entry : books.entrySet())
        {
            if(entry.getValue().getGenre().equals(genre))
            {
                user_category.add(entry.getValue());
            }
        }
        return user_category;
    }
}


public class p65BooksDetails 
{
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy"));
        library.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979, "Science Fiction"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy"));
        library.addBook(new Book("The Martian", "Andy Weir", 2011, "Science Fiction"));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 1813, "Fiction"));

        List<Book> fantasyBooks = library.searchByGenre("Fantasy");

        System.out.println("\nList of books in the Fantasy genre:");
        for (Book book : fantasyBooks) 
        {
            System.out.println("- " + book);
        }
    }
}


