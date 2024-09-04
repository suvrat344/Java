// You are given a string s consisting of English alphabetic letters only and an integer k. Your task is to find the lexicographically smallest and largest substrings of length k from the string s.
// Input
// A single string s (1 ≤ |s| ≤ 10^4), where s consists of English alphabetic letters (both uppercase and lowercase).
// An integer k (1 ≤ k ≤ |s|), which denotes the length of the substrings to find.
// Output
// Return a string consisting of two lines. The first line should contain the lexicographically smallest substring of length k, and the second line should contain the lexicographically largest substring of length k, separated by a newline character.
// Explanation
// For the given input string welcometojava and k = 3, the substrings of length 3 are:
// "wel"
// "elc"
// "lco"
// "com"
// "ome"
// "met"
// "eto"
// "toj"
// "oja"
// "jav"
// "ava"
// Among these, "ava" is the lexicographically smallest substring and "wel" is the lexicographically largest substring.
// Notes
// Lexicographical order is similar to dictionary order. For example, "apple" comes before "banana" because 'a' is less than 'b'.
// The substrings are considered in a contiguous manner from the string.


import java.util.Scanner;

public class p26SubstringComparison 
{

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int len = s.length();
        for(int i = 0;i < len - k + 1;i++)
        {
            String substr = s.substring(i, i + k);
            if(smallest.isEmpty() || substr.compareTo(smallest) < 0)
            {
                smallest = substr;
            }
            if(largest.isEmpty() || substr.compareTo(largest) > 0)
            {
                largest = substr;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string : ");
        String s = input.next();

        System.out.print("Enter substring length : ");
        int k = input.nextInt();
        input.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}