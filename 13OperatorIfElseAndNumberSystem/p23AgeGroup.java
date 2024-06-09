// Create a program that categorize a person into different age groups 
// Child -> below 13 Teen -> below 20
// Adult -> below 60 Senior-> above 60

import java.util.Scanner;

public class p23AgeGroup {
  public static void main(String[] args) {
    int age;

    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter age : ");
    age = input.nextInt();

    if (age <= 13) {
        System.out.print("Child");
    }
    else if(age <= 20){
      System.out.print("Teen");
    }
    else if(age <= 60){
      System.out.print("Adult");
    }
    else{
      System.out.print("Senior");
    }
  }
}
