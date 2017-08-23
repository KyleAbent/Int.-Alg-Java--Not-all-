import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ch_9_8_SqRt_Quadtric_ABC_inBetween_Factor{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("Ch. 9.8.37 Homework #13 \n");
      
      int Left_Number = 0;
      int Middle_Number = 0;
      int Right_Number = 0;
      
      String Left_Number_Variable = "";
      String Right_Number_Variable = "";
      
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
       
      C = Middle_Number * -1; // Same as above, evenly done.     
      
      System.out.println(" " + A + A_Variable + "E" + 
      A_Exponent + " " + B + B_Variable + C);

      
      boolean MatchFactor = false;
      double scanningNumberOne = 0.0;//Tune
      double scanningNumberTwo = 1.0;//Tune
      double One_Neg = 0.0;         //Tune    
      double Two_Neg = -1.0;         ///Tune      ((For ex: better as rand. 1-9?))
      double Answer = 0;
      int factor_B = 0;
      
      boolean checksToB = false;
      
      
        do 
    {                                         
      if (scanningNumberOne >= 15) { MatchFactor = true ; }
       scanningNumberOne =  scanningNumberOne + 1.0;
       scanningNumberTwo =  scanningNumberTwo + 1.0;
       One_Neg = One_Neg - 1.0;
       Two_Neg = Two_Neg - 1.0;
                               // Updated to find its own negative/positive dynamic
       if ( ( One_Neg ) + scanningNumberTwo == B)
         { checksToB = true; scanningNumberOne = One_Neg ; }
         
       if (!checksToB && ( scanningNumberOne + ( Two_Neg ) == B ) ) 
         { scanningNumberTwo = Two_Neg ; }
       
       
       Answer = Math.rint(scanningNumberOne * scanningNumberTwo);
      // System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer); 
      if (Answer == C) { MatchFactor = true ; }
    }
    while (!MatchFactor);
    {
      //Answer = Math.rint(scanningNumberOne * scanningNumberTwo);
    }  
     if (MatchFactor)
     {
      scanningNumberOne = Math.rint(scanningNumberOne);
      scanningNumberTwo = Math.rint(scanningNumberTwo);
      String AnswerResult = String.format("%.2f", Answer);
      //System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer);
        
      System.out.println("Factored: ("+A + "x + " + "("+ scanningNumberOne + ") )" +
       "(x +(" + scanningNumberTwo + ") )"); 
       
      //zero mult rule, h8 me for int in loop
      
      int zeroMultRule_One = (int)scanningNumberOne * -1;
      int zeroMultRule_Two = (int)scanningNumberTwo * - 1;
      
      //now plug in and check manually 4 now
      //excuse me, this is messy translation
      //code may be hard to understand
      //but in this way my brain knows
      //exactly what's going on! xD
      
      int checkoneAnswer = (int)Math.sqrt(zeroMultRule_One + Middle_Number) ;
      int checktwoAnser = (int)Math.sqrt(zeroMultRule_Two + Middle_Number) ;
      //System.out.println("checkoneAnswer " + checkoneAnswer + " checktwoAnser " + checktwoAnser );
      
      boolean oneCheck = (checkoneAnswer == zeroMultRule_One);
      boolean twoCheck = (checktwoAnser == zeroMultRule_Two);
      

      System.out.println("Check of " + zeroMultRule_One + " returns " + oneCheck );
      System.out.println("Check of " + zeroMultRule_Two + " returns  " + twoCheck );
      
      }
    
   }
}
