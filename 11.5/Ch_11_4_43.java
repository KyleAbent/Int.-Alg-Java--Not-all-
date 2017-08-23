import java.util.Scanner;
import java.util.Random;
public class Ch_11_4_43
{ 
  public static void main(String[] args)
  {
    String Variable_One = "";
    String Variable_Two = "";
    double lnV = 0;
    double ln = 0;
    double lnV_two = 0;

   System.out.println("Kyle Abent"); 
   System.out.println("Ch.11.4.43");
   Scanner keyboard = new Scanner(System.in);
      
      System.out.printf("\nEnter ln%s:  ", Variable_One);
      lnV = keyboard.nextDouble();
      
      keyboard.nextLine();
      
      System.out.print("Enter Variable_One: ");
      Variable_One = keyboard.nextLine();
      
      System.out.printf("\nEnter ln%s:  ", Variable_One);
      lnV_two = keyboard.nextDouble();
      
      keyboard.nextLine();
      
      
      System.out.print("Enter Variable_Two: ");
      Variable_Two = keyboard.nextLine();
    
      
      System.out.printf("\nEnter ln:  ");
      ln = keyboard.nextDouble();
      
      

      
      boolean MatchFactor = false;
      double scanningNumberOne = 0.0;  
      double Answer = 0;
       Random Rand = new Random();
    while (!MatchFactor)
    {
       scanningNumberOne =  Rand.nextInt(20) + 2;
       Answer = Math.pow(lnV, scanningNumberOne);
      if (Answer * lnV_two == ln) { MatchFactor = true ; }
        else
        {    //This was fun to figure out ;). Loop w/o loop!
         Answer = Math.pow(lnV_two, scanningNumberOne);
         if (Answer * lnV == ln) { MatchFactor = true ; }
        }
      }  
     if (MatchFactor)
     {
     
     System.out.print("\n ln " + ln+" = ln" + lnV + "Exponent: " + scanningNumberOne); 
     System.out.printf("\n ln %s = ln %s Exponent %s * %s", ln, lnV, scanningNumberOne, lnV_two); 
     System.out.printf("\n ln %.1f Exponent %.1f + ln %.1f", lnV,scanningNumberOne, lnV_two);
     System.out.printf("\n %s ln %s + ln %s", scanningNumberOne, lnV, lnV_two);
     System.out.printf("\n %s%s + %s", scanningNumberOne, Variable_One, Variable_Two);
     
     }

      
      
            
  }
  }