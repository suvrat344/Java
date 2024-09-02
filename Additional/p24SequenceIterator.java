// Implement iterator interface in private class SeqIterator which is present inside class Sequence and override method has_next and get_next.

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
    
    public Sequence(int size)
    {
        this.size = 0;
        iArr = new int[maxLimit];
    }

    public void addTo(int elem)
    {
        iArr[size] = elem;
        size++;
    }
    
    public Iterator get_Iterator()
    {
        _iter = new SeqIterator();
        return _iter;
    }
    
    private class SeqIterator implements Iterator
    {
        int indx;
        public SeqIterator()
        {
            indx = -1;
        }
        
        @Override
        public boolean has_next()
        {
            if(indx < size - 1) return true;
            return false;
        }

        @Override
        public Object get_next()
        {
            return iArr[++indx];
        }
    }
}


public class p24SequenceIterator
{
    public static void main(String[] args) 
    {
        Sequence sObj = new Sequence(5);
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter element");
        for(int i = 0; i < 5; i++) 
        {
            sObj.addTo(input.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while(i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}