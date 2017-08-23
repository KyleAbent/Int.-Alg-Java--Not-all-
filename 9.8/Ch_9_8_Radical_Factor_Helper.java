import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ch_9_8_Radical_Factor_Helper
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("Ch. 9.8 Factor Helper\n");
      
      int A = 0;
      String A_Variable = "";
      int A_Exponent = 0;
      int B = 0;
      String B_Variable = "";
      int C = 0;
      String C_Variable = "";
      
      System.out.println("Number A: ");
      A = keyboard.nextInt();
      
      
      keyboard.nextLine();
      System.out.println("Enter Variable A: ");
      A_Variable = keyboard.nextLine();
      
      System.out.println("Enter Exponent A: ");
      A_Exponent = keyboard.nextInt(); 
      
      System.out.println("Enter B: ");
      B = keyboard.nextInt();
      
      keyboard.nextLine();
      System.out.println("Enter Variable B: ");
      B_Variable = keyboard.nextLine();
            
      System.out.println("Enter Variable C: ");
      C = keyboard.nextInt();


      
      
      System.out.println(" " + A + A_Variable + "E" + A_Exponent + " " + B + B_Variable + C);

      
      boolean MatchFactor = false;
      double scanningNumberOne = 1.1;
      double scanningNumberTwo = 0.1;
      double Answer = 0;
      boolean isPositive = (C >= 1);
      
        do 
    { 
       scanningNumberOne = scanningNumberOne + 0.1;
       scanningNumberTwo = scanningNumberTwo + (isPositive? 0.1: -0.1);
       Answer = Math.rint(scanningNumberOne * scanningNumberTwo);
      // System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer);  
      if (Answer == C) { MatchFactor = true ; }
    }
    while (!MatchFactor);
    {
      Answer = Math.rint(scanningNumberOne * scanningNumberTwo);
    }  
     if (MatchFactor)
     {
      scanningNumberOne = Math.rint(scanningNumberOne);
      scanningNumberTwo = Math.rint(scanningNumberTwo);
      String AnswerResult = String.format("%.2f", Answer);
      //System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer);  
      System.out.println("Answer: ("+A + "x + " + "("+ scanningNumberOne + ") )" + "(x +(" + scanningNumberTwo + ") )"); 
     }
     
     
     
           

      
   }
   
}
