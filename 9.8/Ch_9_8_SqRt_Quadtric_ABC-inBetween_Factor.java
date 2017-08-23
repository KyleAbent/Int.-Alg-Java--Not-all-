import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ch_9_8_SqRt_Quadtric_ABC_inBetween_Factor{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("Ch. 9.8 Simple Visual \n");
      
      
      
      int Left_Number = 0;
      int Middle_Number = 0;
      int Right_Number = 0;
      
      String Left_Number_Variable = "";
      String Right_Nuber_Variable = "";
      
      int A = 0;
      int B = 0;
      int C = 0;
      
      String A_Variable = "";
      String B_Variable = "";
      
      int A_Exponent = 0; // for now ;)
    

      
       System.out.println("Enter SqRt Left_Number: ");
      Left_Number = keyboard.nextInt();
      
       keyboard.nextLine();
       
      System.out.println("Enter SqRt Left_Number Variable: ");
      Left_Number_Variable = keyboard.nextLine();
      
       System.out.println("Enter SqRt Middle_Number: ");
      Middle_Number = keyboard.nextInt();
      
       System.out.println("Enter SqRt Equals TO : Right_Number: ");
      Right_Number = keyboard.nextInt();
      
       keyboard.nextLine();
      
       System.out.println("Enter SqRt Right_Number Variable: ");
      Right_Number_Variable = keyboard.nextLine();
      
      
          System.out.println("Sqrt of: " + Left_Number + Left_Number_Variable + "+ " + 
          Middle_Number + " = " + Right_Number + Right_Number_Variable );
      
      
      A = Left_Number;
      A_Exponent = 2; // Puff, out of thin air, due to square root transfer.
      A_Variable = Left_Number_Variable;
      
      B = Right_Number * -1; //Adjust vision // Zoom Accordingly (Move to other side!)
      B_Variable = Right_Number_Variable;
       
      C = keyboard.nextInt();
      C = Middle_Number * -1; // Same as above, evenly done.

      
      
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
