import java.util.Scanner;

public class Fraction_Exponents_To_Radical
{
   public static void main(String[] args)
   {  
      int a = 1;
      double b = 0.1;
      int Exponent_Fraction_Numerator = 1;
      int Exponent_Fraction_Denominator = 1;
      boolean isEven = false;
      boolean foundMatch = false;
      boolean isPositive = false;
      Scanner keyboard = new Scanner(System.in);  
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("9.2 Fraction Exponents to Radicals\n");
      System.out.println("Enter a ");
      a = keyboard.nextInt();
      System.out.print("Enter Exponent_Fraction_Numerator " );
      Exponent_Fraction_Numerator = keyboard.nextInt();
      System.out.print("Enter Exponent_Fraction_Denominator " );
      Exponent_Fraction_Denominator = keyboard.nextInt();
      isEven = ( Exponent_Fraction_Denominator%2 != 1); 
      isPositive = (a >= 1);
      boolean imaginary = false;
      double Answer = 0 ;
      
      if (isEven) 
     {
      if (!isPositive) { a = a * -1 ; }
      Answer = Math.sqrt(a);
      if (!isPositive) { Answer = Answer * -1 ; }
      System.out.println(" " + a + " w/ an exponent of " + Exponent_Fraction_Numerator + " / " + Exponent_Fraction_Denominator + " == " + Answer );
      System.exit(0);
     }  
     
    do 
    {
       b = b + (isPositive ? 0.01: -0.01);  
       Answer = Math.round(Math.pow(b,Exponent_Fraction_Denominator));
      // System.out.println("b of " + b + "is " + Answer );
      if (Answer == a) { foundMatch = true ; }
      if (b >= 999 || b <= -999) { foundMatch = true ;imaginary = true ; }
    }
    while (!foundMatch);
    {
      if (Math.pow(b, Exponent_Fraction_Denominator) == a) { foundMatch = true ; }
    }  
     if (foundMatch)
     {
       if (!imaginary) {
       String bResult = String.format("%.2f", b);
      System.out.println(" " + bResult + " raised to the " + Exponent_Fraction_Denominator + " power is " + a ); 
      }
      else
      {
      System.out.printf("b is imaginary, I give up scanning!"); 
      } 
      System.exit(0); 
     }
    
   }
   
}
