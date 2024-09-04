// Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
// Function Description
// Complete the isAnagram function.
// isAnagram has the following parameters:
// string a: the first string
// string b: the second string
// Returns
// boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
// Input Format
// The first line contains a string .
// The second line contains a string .
// Sample Input
// anagram
// margana
// Sample Output
// Anagrams
// Explanation
// Character	Frequency: anagram	Frequency: margana
// A or a	                 3	           3
// G or g	                 1	           1
// N or n	                 1	           1
// M or m	                 1	           1
// R or r	                 1	           1
// The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

import java.util.*;

public class p25Anagram 
{
    static boolean isAnagram(String a, String b) 
    {
        Map<Character,Integer> frequency_counter1 = new TreeMap<>();
        Map<Character,Integer> frequency_counter2 = new TreeMap<>();

        if(a.length() != b.length())
        {
            return false;
        }

        char[] a1 = a.toLowerCase().toCharArray();
        char[] a2 = b.toLowerCase().toCharArray();

        for(char ch : a1)
        {
            frequency_counter1.put(ch,frequency_counter1.getOrDefault(ch, 0)+1);
        }

        for(char ch : a2)
        {
            frequency_counter2.put(ch,frequency_counter2.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry : frequency_counter1.entrySet())
        {
            if(!Objects.equals(entry.getValue(), frequency_counter2.get(entry.getKey())))
            {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String a = input.next();

        System.out.print("Enter second string : ");
        String b = input.next();

        input.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }   
}