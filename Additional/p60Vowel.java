// Given is a class called Vowels.
// Define the missing constructor and the copy constructor.
// The instance variable count stores the number of vowels in the text, assign its value in the constructor accordingly.
// Use the static method isVowel wherever needed which returns true if a character is vowel and false otherwise.
// The manipulate method replaces every vowel occurence in the text with the character "V" and finally change the value of the instance variable "text" to the new manipulated string.
// Complete all the method definitions in accordance with the test case provided.
// NOTE: assume all characters are lowercase 
// Test Case1
// Input:
// apple
// Output:
// 2
// VpplV
// apple
// Test Case 2:
// Input:
// racecar
// Output:
// 3
// rVcVcVr
// racecar


import java.util.*;

class Vowels{
    private String text;
    private int count;

    public Vowels(String text)
    {
        this.text = text;
        for(char ele : this.text.toCharArray())
        {
            if(Vowels.isVowel(ele)) this.count++;
        }
    }

    public Vowels(Vowels v)
    {
       this.text = v.text;
       this.count = v.count;
    }

    public static boolean isVowel(char x)
    {
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') return true;
        return false;
    }

    public String getOriginalText()
    {
        return this.text;
    }

    public int getCount()
    {
        return this.count;
    }

    public void manipulate()
    {
        String modified_text = "";
        for(char ele : this.text.toCharArray())
        {
            if(Vowels.isVowel(ele))
            {
                modified_text = modified_text + "V";
            }
            else
            {
                modified_text = modified_text + ele;
            }
        }
        this.text = modified_text;
    }
}


public class p60Vowel 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string : ");
        String t = input.nextLine();
        Vowels v1 = new Vowels(t);
        Vowels v2 = new Vowels(v1);

        System.out.println(v2.getCount());
        v2.manipulate();
        System.out.println(v2.getOriginalText());
        System.out.println(v1.getOriginalText());
        input.close();
    }
}