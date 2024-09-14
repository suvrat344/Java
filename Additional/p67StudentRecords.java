// Given a code for student records, implement the code blocks as instructed:
// Class Marks 
//  > instance variables (private): mathMarks,scienceMarks, englishMarks
//  > define the constructor, clone method, and accessor and mutator methods
// Class StudentRecords
//  > define the clone method appropriately
//  > inside the main method, write a code to create the clone for the original student and display the details 
//     of the clone and original after making some changes to the clone's marks as 95,92,88 respectively


class Marks implements Cloneable
{
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;

    public Marks(int mathMarks,int scienceMarks,int englishMarks)
    {
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    public Marks clone() throws CloneNotSupportedException
    {
        return (Marks) super.clone();
    }

    public int getMathMarks()
    {
        return this.mathMarks;
    }

    public int getScienceMarks()
    {
        return this.scienceMarks;
    }

    public int getEnglishMarks()
    {
        return this.englishMarks;
    }

    public void setMathMarks(int marks)
    {
        this.mathMarks = marks;
    }

    public void setScienceMarks(int marks)
    {
        this.scienceMarks = marks;
    }

    public void setEnglishMarks(int marks)
    {
        this.englishMarks = marks;
    }
}


public class p67StudentRecords implements Cloneable 
{
    private String name;
    private int rollNumber;
    private Marks marks;

    
    public p67StudentRecords(String name, int rollNumber, Marks marks) 
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public p67StudentRecords clone() throws CloneNotSupportedException
    {
        p67StudentRecords StudentClone = (p67StudentRecords) super.clone();
        StudentClone.marks = (Marks) marks.clone();
        return StudentClone;
    }

    
    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Math Marks: " + marks.getMathMarks());
        System.out.println("Science Marks: " + marks.getScienceMarks());
        System.out.println("English Marks: " + marks.getEnglishMarks());
    }

    
    public static void main(String[] args)
    {
        Marks originalMarks = new Marks(85, 90, 80);
        p67StudentRecords originalStudent = new p67StudentRecords("Alice", 101, originalMarks);

        
        System.out.println("Original Student Details:");
        originalStudent.displayDetails();
        System.out.println();

        try
        {
            p67StudentRecords clonedStudent = originalStudent.clone();
            clonedStudent.marks.setMathMarks(95);
            clonedStudent.marks.setScienceMarks(92);
            clonedStudent.marks.setEnglishMarks(88);

            System.out.println("Cloned Student Details:");
            clonedStudent.displayDetails();

            System.out.println("Original Student Details after updation in clone:");
            originalStudent.displayDetails();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e.getMessage());
        }
    }   
}