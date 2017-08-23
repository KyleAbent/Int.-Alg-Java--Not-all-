import java.util.Scanner;
import java.util.Random;
public class Ch_10_2
{ 
  public static void main(String[] args)
  {
   int Number_A = 0;
   int Number_B = 0;
   int Number_C = 0;   
   Random Rand = new Random();
   String name = "Kyle Abent";
   System.out.print(name); 
   System.out.print("Ch.10.2.27");
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter Number_A:  ");
      Number_A = keyboard.nextInt();
      System.out.print("Enter Number_B:  ");
      Number_B = keyboard.nextInt();  
      System.out.print("Enter Number_C: ");
      Number_C = keyboard.nextInt(); 
 
       int Formula_One = (int)Math.rint( Math.pow( Number_B, 2)  -4 * Number_A  * Number_C  );
  
          boolean foundMatch = false;
          double SqrtScanNumber = 0;
          double MultiplyByScanNumber = 0;
          double SquaredRadical = 0;
          int currentcalc = 0;
          
        while (!foundMatch)
       {
           SqrtScanNumber = Rand.nextInt(99) + 1;
           MultiplyByScanNumber = Rand.nextInt(99) + 1;
           SquaredRadical = Math.rint(Math.pow(SqrtScanNumber,2));
           currentcalc = (int)SquaredRadical * (int)MultiplyByScanNumber;
           if ( currentcalc  == Formula_One) 
           {
           foundMatch = true ;
           System.out.println("SqrtScanNumber is " + SqrtScanNumber + 
           " MultiplyByScanNumber is " + MultiplyByScanNumber 
          + "SquaredRadical is " + SquaredRadical + "currentcalc is" + currentcalc);
         }
    }  
     
     
       int Formula_Two = -Number_B  / ( 2 * Number_A ) ;
       int Formula_Three = (int)SqrtScanNumber / Number_A;     
                                    
     System.out.println("Formula_One" + Formula_One);
     System.out.println("Formula_Two" + Formula_Two);
     System.out.println("x = +- " + Formula_Two + " Radical " + MultiplyByScanNumber + " / " + "2" );

       
  }
  }