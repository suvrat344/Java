// You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d. That also implies  (a,b) is not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.
// Input Format
// In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will contain two strings seperated by a single space.
// Output Format
// Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.
// Sample Input
// 5
// john tom
// john mary
// john tom
// mary anna
// mary anna
// Sample Output
// 1
// 2
// 2
// 3
// 3

import java.util.*;

public class p19HashSet 
{
 public static void main(String[] args) 
 {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int t = input.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) 
        {
            pair_left[i] = input.next();
            pair_right[i] = input.next();
        }

        HashSet<List<String>> uniqueSet = new HashSet<>();

        for(int i = 0;i < pair_left.length;i++)
        {
            List<String> l1 = new ArrayList<>();
            l1.add(pair_left[i]);
            l1.add(pair_right[i]);
            uniqueSet.add(l1);
            System.out.println(uniqueSet.size());
        }
   }
}