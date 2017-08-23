import java.util.Scanner;

public class Index_Radicand_Exponent_Factor_Simplifiy
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("9.4 Group Work Pg.641 #58\n");
      
      int Index = 3;
      System.out.println("Enter Index");
      Index = keyboard.nextInt();
      int Radicand = 1;
      System.out.println("Enter Radicand");
      Radicand = keyboard.nextInt();
      String Variable = "q"; //lets not input
      int Radicand_Exponent = 0;
      System.out.println("Enter Radicand_Exponent");
      Radicand_Exponent = keyboard.nextInt();
      
      
     //In this example, (Radicand_Exponent/2)Cubed
     
     double divide_Radicand_By_Two = Math.rint(Radicand/2);
     //double CubedRoot = Math.pow(divide_Radicand_By_Two , 3);
     System.out.println("Index:" + Index + " Radicand: " + Radicand + "Radicand_Exponent:" + Radicand_Exponent + " divide_Radicand_By_Two:" +divide_Radicand_By_Two);
     System.out.println(" " + Index + "Radical  " + Radicand + "" + Variable + "" + "Exponent" + Radicand_Exponent);
          
     double CubedRoot = 0;
     double scanningNumber = 0;
     boolean foundMatch = false;
     
      do 
    {
       scanningNumber = scanningNumber + 0.1;
       CubedRoot = Math.rint(Math.pow(scanningNumber,3));
      // System.out.println("b of " + b + "is " + Answer );
      if (CubedRoot == divide_Radicand_By_Two) { foundMatch = true ; }
    }
    while (!foundMatch);
    {
      CubedRoot = Math.round(Math.pow(scanningNumber,3));
    }  
     if (foundMatch)
     {
      String CubedRootResult = String.format("%.2f", CubedRoot);
      System.out.println(" " + scanningNumber + " raised to the " + Index + " power is " + CubedRoot );  
     }

 
      
      double index_divide_variable_exponent_by_radicand = Math.rint( Radicand_Exponent / Index );
      System.out.println("How many times does the radivand variable exponent divide into the index? (" + index_divide_variable_exponent_by_radicand + ")");
      
   //   System.out.println("" + variable + "Exponent" + index_divide_variable_exponent_by_radicand + " " + Index "Index" +
     
     //well I suppose that i did not finish this one.
     boolean is_Radicand_Negative = (Radicand <=-1 );
    
      
   }
   
}
