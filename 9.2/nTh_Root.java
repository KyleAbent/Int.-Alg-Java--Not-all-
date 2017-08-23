import java.util.Scanner;

public class nTh_Root
{
   public static void main(String[] args)
   {  
      int a = 1;
      double b = 0.1;
      int index = 1;
      boolean isEven = false;
      boolean foundMatch = false;
      boolean isPositive = false;
      Scanner keyboard = new Scanner(System.in);  
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("9.2 Evaluate nth Roots\n");
      System.out.print("Enter index " );
      index = keyboard.nextInt();
      System.out.println("Enter a ");
      a = keyboard.nextInt();
      isEven = ( index%2 != 1); 
      isPositive = (a >= 1);
      boolean imaginary = false;
      double Answer = 0 ;
    do 
    {
       b = b + (isPositive ? 0.01: -0.01);  
       Answer = Math.round(Math.pow(b,index));
      // System.out.println("b of " + b + "is " + Answer );
      if (Answer == a) { foundMatch = true ; }
      if (b >= 999 || b <= -999) { foundMatch = true ;imaginary = true ; }
    }
    while (!foundMatch);
    {
      if (Math.pow(b, index) == a) { foundMatch = true ; }
    }  
     if (foundMatch)
     {
       if (!imaginary) {
       String bResult = String.format("%.2f", b);
      System.out.println(" " + bResult + " raised to the " + index + " power is " + a ); 
      }
      else
      {
      System.out.printf("b is imaginary, I give up scanning!"); 
      } 
      System.exit(0); 
     }
    
   }
   
}
