import java.util.Scanner;
import java.util.Random;
public class Ch_10_1_65
{ 
  public static void main(String[] args)
  {
   int Number_A = 0;
   int Number_B = 0;
   int Number_C = 0;   
   Random Rand = new Random();
   String name = "Kyle Abent";
   System.out.print(name); 
   System.out.print("Ch.10.1.59");
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter Number_A:  ");
      Number_A = keyboard.nextInt();
      System.out.print("Enter Number_B:  ");
      Number_B = keyboard.nextInt();  
      int Number_D = 0;
      System.out.print("Enter Number_D: ");
      Number_D = keyboard.nextInt(); 
      
      Number_B = Number_B * -1;
 
        Number_C = (Number_B/2); Number_C =  Number_C * Number_C;
       System.out.println("Number_C is " + Number_C);
        Number_D = Number_D + Number_C;
         System.out.println("Number_D is " + Number_D);
       int Formula_One = 0;
  
  
    boolean MatchFactor = false;
      double scanningNumberOne = 0.0;//Randomized
      double scanningNumberTwo = 1.0;//Randomized      
      double Answer = 0;
      int factor_B = 0;
      
      boolean checksToB = false;
      boolean isFactorPos = (Number_B>= 1 && Number_B<=-1);
      
    while (!MatchFactor)
    {

       scanningNumberOne =  Rand.nextInt(20) + 2;
       scanningNumberTwo =  Rand.nextInt(20) + 2;
                               // Updated with random numbers
       if ( ( scanningNumberOne * -1 ) + scanningNumberTwo == Number_B)
         { checksToB = true; scanningNumberOne = scanningNumberOne * -1 ; }
         
       if (!checksToB && ( scanningNumberOne + ( scanningNumberTwo * -1 ) == Number_B ) ) 
         { scanningNumberTwo = scanningNumberTwo * -1 ; }
         
         if (!isFactorPos) { scanningNumberOne = scanningNumberOne * -1; scanningNumberTwo = scanningNumberTwo * -1;}
       
       
       Answer = Math.rint(scanningNumberOne * scanningNumberTwo);
      // System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer); 
      if (Answer == Number_C) { MatchFactor = true ; }
    }  
     if (MatchFactor)
     {
      scanningNumberOne = Math.rint(scanningNumberOne);
      scanningNumberTwo = Math.rint(scanningNumberTwo);
      String AnswerResult = String.format("%.2f", Answer);
      //System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + Answer);
        
      System.out.println("Factored: ("+Number_A + "x + " + "("+ scanningNumberOne + ") )" +
       "(x +(" + scanningNumberTwo + ") )" + " = " + Number_D ); 
       
        System.out.println("Sqrted: x +  " + scanningNumberOne + " = "   + "+- " + " Radical " + Number_D );  
           
            scanningNumberOne = -scanningNumberOne; 
            //Number_D = (int)Math.sqrt(Number_D);
            
            
      System.out.println("x =  " + scanningNumberOne + " +- " + "Radical "+ Number_D ); 
  }     
  }
  }