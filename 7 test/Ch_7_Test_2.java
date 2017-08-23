import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ch_7_Test_2
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("Ch. 7 Test #2\n");
      
      int Numerator_A = 0;
      int Numerator_A_Exponent = 0;
      int Numerator_B = 0;
      int Numerator_C = 0;
      
      int Denominator_A = 0;
      int Denominator_A_Exponent = 0;
      int Denominator_B = 0;
      int Denominator_C = 0;
      
      System.out.println("Enter Numerator_A");
      Numerator_A = keyboard.nextInt();
      System.out.println("Enter Numerator_A_Exponent");
      Numerator_A_Exponent = keyboard.nextInt();
      
      
      System.out.println("Enter Numerator_B");
      Numerator_B = keyboard.nextInt();
            
      System.out.println("Enter Numerator_C");
      Numerator_C = keyboard.nextInt();
      
      System.out.println("Enter Denominator_A");
      Denominator_A = keyboard.nextInt();
      
      System.out.println("Enter Denominator_A_Exponent");
      Denominator_A_Exponent = keyboard.nextInt();
     
      System.out.println("Enter Denominator_B");
      Denominator_B = keyboard.nextInt();

      
      System.out.println("Enter Denominator_C");
      Denominator_C = keyboard.nextInt();
      
      
       //System.out.println("" + Numerator_A + Numerator_A_Exponent +Numerator_B  + Numerator_C + Denominator_A + Denominator_A_Exponent +  Denominator_B + Denominator_C);
       System.out.println("" + Numerator_A + "xE" + Numerator_A_Exponent +" " + Numerator_B  + " " + Numerator_C + "/" + Denominator_A + "xE" + Denominator_A_Exponent +  " " + " " + Denominator_B + " " + Denominator_C);
      
      boolean numeratorMatchFactor = false;
      double scanningNumberOne = 1.1;
      double scanningNumberTwo = 0.1;
      double numeratorAnswer = 0;
      boolean isPositive = (Numerator_C >= 1);
      
        do 
    { 
       scanningNumberOne = scanningNumberOne + 0.1;
       scanningNumberTwo = scanningNumberTwo + (isPositive? 0.1: -0.1);
       numeratorAnswer = Math.rint(scanningNumberOne * scanningNumberTwo);
      // System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + numeratorAnswer);  
      if (numeratorAnswer == Numerator_C) { numeratorMatchFactor = true ; }
    }
    while (!numeratorMatchFactor);
    {
      numeratorAnswer = Math.rint(scanningNumberOne * scanningNumberTwo);
    }  
     if (numeratorMatchFactor)
     {
      scanningNumberOne = Math.rint(scanningNumberOne);
      scanningNumberTwo = Math.rint(scanningNumberTwo);
      String numeratorAnswerResult = String.format("%.2f", numeratorAnswer);
      //System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + numeratorAnswer);  
      System.out.println("Numerator: ("+Numerator_A + "x + " + "("+ scanningNumberOne + ") )" + "(x +(" + scanningNumberTwo + ") )"); 
     }
     
     
     
      boolean denominatorMatchFactor = false;
      double scanningNumberThree = 1.1;
      double scanningNumberFour = 0.1;
      double denominatorAnswer = 0;
      boolean isPositive_D = (Denominator_C >= 1);
      
        do 
    { 
       scanningNumberThree = scanningNumberThree + 0.1;
       scanningNumberFour = scanningNumberFour + (isPositive_D? 0.1: -0.1);
       denominatorAnswer = Math.rint(scanningNumberThree * scanningNumberFour);
      // System.out.println(" " + scanningNumberOne + "*" + scanningNumberTwo + "== " + numeratorAnswer);  
      if (denominatorAnswer == Denominator_C) { denominatorMatchFactor = true ; }
    }
    while (!denominatorMatchFactor);
    {
      denominatorAnswer = Math.rint(scanningNumberThree * scanningNumberFour);
    }  
     if (denominatorMatchFactor)
     {
      scanningNumberThree = Math.rint(scanningNumberThree);
      scanningNumberFour = Math.rint(scanningNumberFour);
      String numeratorAnswerResult = String.format("%.2f", denominatorAnswer);
      //System.out.println(" " + scanningNumberThree + "*" + scanningNumberFour + "== " + numeratorAnswer);  
      System.out.println("Denominator: ("+Denominator_A + "x + " + "("+ scanningNumberThree + ") )" + "(x +(" + scanningNumberFour + ") )"); 
     }


      ArrayList<Integer>  Numerator = new ArrayList<Integer>();
      ArrayList<Integer>  Denominator = new ArrayList<Integer>();
      

       Numerator.add( (int)scanningNumberOne );
       Numerator.add( (int)scanningNumberTwo );       
       
       Denominator.add( (int)scanningNumberThree );
       Denominator.add( (int)scanningNumberFour );
       
       Random rand = new Random();
       int numeratorCompareRandom = 0;      
       int denominatorCompareRandom = 0; 
       
       
       rand.nextInt(Numerator.size());
 
       int currentIndex_Numerator = 0;
       double currentIndex_Numerator_Opposite = 0;
       int currentIndex_Denominator = 0;
       double currentIndex_Denominator_Opposite = 0;
       boolean flipSign = false;
       
      for (int numindex = 0; numindex < Numerator.size(); numindex++)
      {
       
            currentIndex_Numerator = Numerator.get(numindex);
            currentIndex_Numerator_Opposite = Math.rint(currentIndex_Numerator * -1);
           // System.out.println("currentIndex_Numerator is " + currentIndex_Numerator + "oppositeOf is " + currentIndex_Numerator_Opposite  );
           for (int denomindex = 0; denomindex < Denominator.size(); denomindex++)
          {
          
            currentIndex_Denominator = Denominator.get(denomindex);
            currentIndex_Denominator_Opposite = Math.rint(currentIndex_Denominator * -1);
           // System.out.println("currentIndex_Denominator is " + currentIndex_Denominator + "oppositeOf is " + currentIndex_Denominator_Opposite  );
            
         if (currentIndex_Numerator == currentIndex_Denominator )
         {
           System.out.println("Numerator & Demonator match " + currentIndex_Numerator + ", therefore cancelling out.");
         }
         if (currentIndex_Numerator  == currentIndex_Denominator_Opposite )
         {
         flipSign = true;
         Numerator.remove(Numerator.get(numindex));
         Denominator.remove(Denominator.get(denomindex));
         System.out.println("Numerator & Demonator match " + currentIndex_Numerator + ", therefore cancelling out." + "flipSign is " + flipSign);
         }
        }
     }
     
      int indexoftoflip = 0;
           if (flipSign) 
          
          {
         for (int denindagain = 0; denindagain < Denominator.size(); denindagain++)
          {
          indexoftoflip = Denominator.get(denindagain);
          Denominator.add((int)indexoftoflip*-1);
          Denominator.remove(Denominator.get(denindagain));
          break;
          }
          }
     
           String numeratorAnswerString = "";
     for(int i = 0; i<Numerator.size(); i++)
      {
      String numeratorAnswersMan = Numerator.get(i).toString();
      numeratorAnswerString += numeratorAnswersMan +" ";        
     }
     
      String finalAnserDenominator = "";
     for(int i = 0; i<Denominator.size(); i++)
      {
      String denominatorAnswersman = Denominator.get(i).toString();
      finalAnserDenominator += denominatorAnswersman +" ";        
     }
     
    System.out.println(""+Numerator_A + "x + " + Numerator + "/ " +  Denominator_A + "x + " + Denominator);
       

      
   }
   
}
