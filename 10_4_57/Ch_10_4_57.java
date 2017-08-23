import java.util.Scanner;
import java.util.Random;
public class Ch_10_4_57
{ 
  public static void main(String[] args)
  {
   double Vertex_A_X = 0;
   double Vertex_A_Y = 0;
   double Vertex_B_X = 0;
   double Vertex_B_Y = 0;

   int Number_A_Exponent = 2;
   Random Rand = new Random();
   System.out.println("Kyle Abent"); 
   System.out.println("Ch.10.4.57");
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("\nEnter Vertex_A_X:  ");
      Vertex_A_X = keyboard.nextDouble();
      System.out.print("Enter Vertex_A_Y:  ");
      Vertex_A_Y = keyboard.nextDouble();  

      System.out.print("\nEnter Vertex_B_X:  ");
      Vertex_B_X = keyboard.nextDouble();
      System.out.print("Enter Vertex_B_Y:  ");
      Vertex_B_Y = keyboard.nextDouble();  



     double A = Math.pow( (Vertex_A_X * -1) , 2);
      double A_number =  Vertex_B_Y - Vertex_A_Y;
      double final_A =A_number / A ;
      
       
     System.out.printf(" \n %.2f (x + %.2f) sqred + %.2f",
      final_A, Vertex_A_X * -1, Vertex_A_Y );
        
  }
  }