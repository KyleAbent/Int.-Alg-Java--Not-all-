import java.util.Scanner;

public class Rational_Exponents
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);
   String Input = "";
   int a = 1;
   int a_Rational_Numerator = 1;
   int a_Rational_Denominator = 1;
   
   int b = 1;
   int b_Rational_Numerator = 0;
   int b_Rational_Denominator = 0;
   double Answer = 0;
   double numberToScan = 0;
   boolean LCDFound = false;
   double LCD = 1;
   boolean simplified = false;
   int simplifyby = 0;
   
   int Combined_Rational_Numerator = 0;
   int Combined_Rational_Denominator = 0;
   
    System.out.println("Kyle Abent");
    System.out.println("Intermediate Algebra");
    System.out.println("9.3 Simplifying Expressions Involving Rational Epxponents pg. 629\n");
    
          System.out.println("Add or Subtract?(A or S)) ");
      Input = keyboard.nextLine();
      
      System.out.println("Enter a ");
      a = keyboard.nextInt();
      
      System.out.println("Enter a_Rational_Numerator ");
      a_Rational_Numerator = keyboard.nextInt();
      
      System.out.println("Enter a_Rational_Denominator ");
      a_Rational_Denominator = keyboard.nextInt();
     
      
   
       System.out.println("Enter b ");
       b = keyboard.nextInt();  
      
       
       System.out.println("Enter b_Rational_Numerator ");
       b_Rational_Numerator = keyboard.nextInt();
      
       System.out.println("Enter b_Rational_Denominator ");
       b_Rational_Denominator = keyboard.nextInt();
       
       
       do 
        { 
         numberToScan = numberToScan + 1; 
           double answerof = Math.round(numberToScan * a_Rational_Denominator);
        //   System.out.println("numberToScan is " + numberToScan + "answerof is " + answerof );
         if (answerof == b_Rational_Denominator)
          {
           LCDFound = true;
           LCD = (int)numberToScan;
          }
        }
       while (!LCDFound); 
       {
         if (numberToScan * a_Rational_Denominator == b_Rational_Denominator)
          {
           LCD = (int)numberToScan;
           LCDFound = true;
          }
       }
       
       a_Rational_Numerator = a_Rational_Numerator * (int)LCD;
       a_Rational_Denominator = a_Rational_Denominator * (int)LCD;
     
      if (Input.equals("A"))
      {
       Combined_Rational_Numerator = a_Rational_Numerator + b_Rational_Numerator;
       }
     else if (Input.equals("S"))
     {
     Combined_Rational_Numerator = a_Rational_Numerator - b_Rational_Numerator;
     }
       
       Combined_Rational_Denominator = a_Rational_Denominator;
       
       Answer = a;
       System.out.println("Answer is " + Answer + " with a rational exponent of " + Combined_Rational_Numerator + "/" + Combined_Rational_Denominator + " (NOT SIMPLIFIED!) ");
       
       //do another do while loop to scan for simplification of numerator and denominator
       
        
      int  byTwoNum = 0;
      int  byTwoDen = 0;
      boolean isEven = false;
       do
       {
             byTwoNum = Combined_Rational_Numerator / 2;
             byTwoDen = Combined_Rational_Denominator / 2;          
            isEven = ( byTwoNum%2 != 1 && byTwoDen != 1 );
        //   System.out.println("numberToScan is " + numberToScan + "answerof is " + answerof );
         if (!isEven)
          {
           simplified = true;
          }
         else
         {
         Combined_Rational_Numerator = Combined_Rational_Numerator / 2;
         Combined_Rational_Denominator = Combined_Rational_Denominator / 2;
         }
       }
       
       while (!simplified);
       {
             byTwoNum = Combined_Rational_Numerator / 2;
             byTwoDen = Combined_Rational_Denominator / 2;          
            isEven = ( byTwoNum%2 != 1 && byTwoDen != 1 );
        //   System.out.println("numberToScan is " + numberToScan + "answerof is " + answerof );
         if (!isEven)
          {
           simplified = true;
          }
         else
         {
         Combined_Rational_Numerator = Combined_Rational_Numerator / 2;
         Combined_Rational_Denominator = Combined_Rational_Denominator / 2;
         }
       }
       
      System.out.println("Answer is " + Answer + " with a rational exponent of " + Combined_Rational_Numerator + "/" + Combined_Rational_Denominator + " (SIMPLIFIED!) ");
      System.out.println("Warning, denominator did not simplify into numerator, it may not be simplified after all!");
      
      //now for the 9.2 formula of the nth power denominator, 
       //followed by that answer having an exponent of numerator.
       
       int exponent = Combined_Rational_Numerator;
       int index = Combined_Rational_Denominator;
       boolean imaginary = false;
       double scanNumber = 0.1;
       double AnswerAnswer =  0.1;
       boolean foundMatch = false; 
       //This code is a little messy im aware,
        // having 3 loops with recooperating names
         do 
    {
        scanNumber = scanNumber + 0.1;
       //b = b + (isPositive ? 0.01: -0.01);  
       AnswerAnswer = Math.round(Math.pow(scanNumber,index));
      // System.out.println("b of " + b + "is " + Answer );
      if (AnswerAnswer == a) { foundMatch = true ; }
      if (scanNumber >= 999 || scanNumber <= -999) { foundMatch = true ;imaginary = true ; }
    }
    while (!foundMatch);
    {
      if (Math.pow(scanNumber, index) == a) { foundMatch = true ; }
    }  
     if (foundMatch)
     {
       if (!imaginary) {
       String scanNumberResult = String.format("%.2f", scanNumber);
      System.out.println(" " + scanNumberResult + " raised to the " + index + " power is " + a ); 
      }
      else
      {
      System.out.printf("b is imaginary, I give up scanning!"); 
       System.exit(0); 

      } 
     }
          
              // and finally the exponent
           // applied to give the final answer
      
           double finalAnswer = Math.pow(scanNumber, exponent); //finalAnswer = Math.pow(scanNumberResult, exponent);
           System.out.printf("final answer is " + finalAnswer); 
           
           
   }
}
