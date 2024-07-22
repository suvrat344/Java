//  Write a program that checks for balanced parentheses in an expression i.e. whether the pairs and the order of "{ ",  ""}"", "(", ")”, "[", "]” are correct in the given input.
// The program should keep taking expressions as input one after the other, until the user enters the word 'done' (not case-sensitive). After all the expressions are input, for each input, the program should print whether the given expression is balanced or not (the order of the output should match the order of the input). If an input expression is balanced, print Balanced else print Not Balanced

import java.util.*;

public class p32BalancedParenthesis
{
    public static boolean balanceCheck(String sequence) 
    {
        Stack<Character> stack = new Stack<>();
        boolean result = true;

        for(char element : sequence.toCharArray())
        {
            if(element == '{' || element == '[' || element == '(')
            {
                stack.push(element);
            }
            else if(element == '}' || element == ']' || element == ')')
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char ele = stack.pop();
                if((ele == '(' && element == ')') || (ele == '{' && element == '}') || (ele == '[' && element == ']'))
                {
                    result = true;
                }
                else
                {
                    result = false;
                    return result;
                }
            }
        }

        if(!stack.isEmpty())
        {
            return false;
        }
        return result;
    }
   
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> expr_arr= new ArrayList<>();
        String inp = null;
        
        do
        {
            System.out.print("Enter expression : ");
            inp = input.nextLine();
            if(!inp.equalsIgnoreCase("Done"))
            {
                expr_arr.add(inp);
            } 
        }while(!inp.equalsIgnoreCase("Done"));

        for(String expr : expr_arr) 
        {
            if(balanceCheck(expr)) 
            {
                System.out.println("Balanced");
            }
            else 
            {
                System.out.println("Not Balanced");
            }
        }
    }
}     
