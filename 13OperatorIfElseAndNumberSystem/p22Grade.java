// .Create a program that calculates grades based on marks 
// A -> above 90% B -> above 75%
// C -> above 60% D -> above 30%
// F -> below 30%

import java.util.Scanner;

public class p22Grade {
  public static void main(String[] args){
    int marks;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter marks : ");
    marks = input.nextInt();

    if(marks >= 90){
      System.out.print("Grade A");
    }
    else if (marks >= 75) {
        System.out.print("Grade B");
    }
    else if(marks >= 60){
      System.out.print("Grade C");
    }
    else if(marks >= 30){
      System.out.print("Grade D");
    }
    else{
      System.out.print("Grade F");
    }
  }
}
