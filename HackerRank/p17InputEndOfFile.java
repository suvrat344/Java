// The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
// Hint: Java's Scanner.hasNext() method is helpful for this problem.
// Input Format
// Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
// Output Format
// For each line, print the line number, followed by a single space, and then the line content received as input.

import java.util.*;

public class p17InputEndOfFile 
{

    public static void main(String[] args) 
    {
        int i = 1;
        Scanner input = new Scanner(System.in);

        while(input.hasNext())
        {
            String line = input.nextLine();
            System.out.println(i + " " + line);
            i++;
        }
    }
}
