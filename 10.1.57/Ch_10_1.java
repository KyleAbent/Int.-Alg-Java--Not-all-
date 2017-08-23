import java.util.Scanner;
import java.util.Random;
public class Ch_10_1
{ 
  public static void main(String[] args)
  {
   int Number_A = 0;
   int Number_B = 0;
   int Number_C = 0;   
   Random Rand = new Random();
   String name = "Kyle Abent";
   System.out.print(name); 
   System.out.print("Ch.10.1.57");
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter Number_A:  ");
      Number_A = keyboard.nextInt();
      System.out.print("Enter Number_B:  ");
      Number_B = keyboard.nextInt();  
      System.out.print("Enter Number_C: ");
      Number_C = keyboard.nextInt(); 
 
       int Number_CC = (Number_B/2); Number_CC =  Number_CC * Number_CC;
       System.out.println("Number_CC is " + Number_CC);
       int Number_D = -Number_C + Number_CC;
         System.out.println("Number_D is " + Number_D);
       int Formula_One = 0;
  
  
    boolean MatchFactor = false;
      double scanningNumberOne = 0.0;//Randomized
      double scanningNumberTwo = 1.0;//Randomized
      double One_Neg = 0.0;         //Tuned    
      double Two_Neg = -1.0;         ///Tuned      
      double Answer = 0;
      int factor_B = 0;
      
      boolean checksToB = false;
      
      
    while (!MatchFactor)
    {

       scanningNumberOne =  Rand.nextInt(20) + 2;
       scanningNumberTwo =  Rand.nextInt(20) + 2;
       One_Neg = One_Neg - 1.0;
       Two_Neg = Two_Neg - 1.0;
                               // Updated with random numbers
       if ( ( One_Neg ) + scanningNumberTwo == Number_B)
         { checksToB = true; scanningNumberOne = One_Neg ; }
         
       if (!checksToB && ( scanningNumberOne + ( Two_Neg ) == Number_B ) ) 
         { scanningNumberTwo = Two_Neg ; }
       
       
       Answer = Math.rint(scanningNumberOne * scanningNumberTwo);
      // System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer); 
      if (Answer == Number_CC) { MatchFactor = true ; }
    }  
     if (MatchFactor)
     {
      scanningNumberOne = Math.rint(scanningNumberOne);
      scanningNumberTwo = Math.rint(scanningNumberTwo);
      String AnswerResult = String.format("%.2f", Answer);
      //System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer);
        
      System.out.println("Factored: ("+Number_A + "x + " + "("+ scanningNumberOne + ") )" +
       "(x +(" + scanningNumberTwo + ") )" + " = " + Number_D ); 
       
        System.out.println("Sqrted: x +  " + scanningNumberOne + "= "   + "+- " + " Radical " + Number_D );  
           
            scanningNumberOne = -scanningNumberOne; 
            String imaginary = "";
            boolean isPos = (Number_D>= 1);
            if (!isPos) {Number_D = Number_D * -1; imaginary = "i"; }
            Number_D = (int)Math.sqrt(Number_D);
            
            
      System.out.println("x =  " + scanningNumberOne + "+- " + Number_D+imaginary ); 
  }     
  }
  }