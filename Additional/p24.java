// Implement the code as instructed in the comments, such that it satisfies the given test cases.

import java.util.*;

interface Iterator
{
    public boolean has_next();
    public Object get_next();
}

class Sequence
{
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr; 
    int size;
    int counter = 0;
    //implement the parameterized constructor to initialize size
    
    public Sequence(int size)
    {
        this.size = size;
        iArr = new int[size];
    }
    //implement addTo(elem) to add an int elem to the sequence 
    public void addTo(int elem)
    {
        iArr[counter++] = elem;
    }
    
    //implement get_Iterator() to return Iterator object
    public Iterator get_Iterator()
    {
        return new SeqIterator();
    }
    
    private class SeqIterator implements Iterator
    {
        int indx;
        public SeqIterator()
        {
            indx = 0;
        }
        
        public boolean has_next()
        {
            return indx < counter;
        }
        public Object get_next()
        {
            return iArr[indx++];
        }
    }
}

public class p24
{
    public static void main(String[] args) 
    {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i < 5; i++) 
        {
            sObj.addTo(sc.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while(i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}