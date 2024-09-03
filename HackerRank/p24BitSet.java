// The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M(the number of operations to perform), respectively.
// The M subsequent lines each contain an operation in one of the following forms:
// AND <set> <set>
// OR <set> <set>
// XOR <set> <set>
// FLIP <set> <index>
// SET <set> <index>
// In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
// <index> is an integer denoting a bit's index in the BitSet corresponding to <set>.
// For the binary operations AND, OR,and XOR, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:
// AND 2 1
// B2 is the left operand, and B1 is the right operand. This operation should assign the result of B2 AND B1 to B2.
// Output Format
// After each operation, print the respective number of set bits in BitSet B1 and BitSet B2 as 2 space-separated integers on a new line.
// Sample Input
// 5 4
// AND 1 2
// SET 1 4
// FLIP 2 2
// OR 2 1
// Sample Output
// 0 0
// 1 0
// 1 1
// 1 2

import java.util.*;

public class p24BitSet 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter size of bitset separated by space : ");
    String[] s1 = input.nextLine().split(" ");
  
    int size = Integer.parseInt(s1[0]);
    int operations = Integer.parseInt(s1[1]);
  
    BitSet B1 = new BitSet(size);
    BitSet B2 = new BitSet(size);
  
    for(int i = 0;i < operations; i++)
    {
      String[] s2 = input.nextLine().split(" ");
      String operator = s2[0];
      int pos1 = Integer.parseInt(s2[1]);
      int pos2 = Integer.parseInt(s2[2]);
      
      if(operator.equals("AND"))
      {
        if(pos1 == 1)
        {
          B1.and(B2);
        }
        else
        {
          B2.and(B1);
        }
      }
      else if(operator.equals("OR"))
      {
        if(pos1 == 1)
        {
          B1.or(B2);
        }
        else
        {
          B2.or(B1);
        }
      }
      else if(operator.equals("XOR"))
      {
        if(pos1 == 1)
        {
          B1.xor(B2);
        }
        else
        {
          B2.xor(B1);
        }
      }
      else if(operator.equals("FLIP"))
      {
        if(pos1 == 1)
        {
          B1.flip(pos2);
        }
        else
        {
          B2.flip(pos2);
        }
      }
      else
      {
        if(pos1 ==1)
        {
          B1.set(pos2);
        }
        else
        {
          B2.set(pos2);
        }
      }
      System.out.print(B1.cardinality() + " " + B2.cardinality());
      System.out.println();
    }
  }
}
