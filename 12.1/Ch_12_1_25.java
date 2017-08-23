import java.util.Scanner;
import java.util.Random;
public class Ch_12_1_25
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
   System.out.println("Ch.12.1.25");
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("\nEnter Vertex_A_X:  ");
      Vertex_A_X = keyboard.nextDouble();
      System.out.print("Enter Vertex_A_Y:  ");
      Vertex_A_Y = keyboard.nextDouble();  

      System.out.print("\nEnter Vertex_B_X:  ");
      Vertex_B_X = keyboard.nextDouble();
      System.out.print("Enter Vertex_B_Y:  ");
      Vertex_B_Y = keyboard.nextDouble();  

     double distance = Math.pow(Vertex_B_X - Vertex_A_X, 2) + Math.pow(Vertex_B_Y - Vertex_A_Y, 2);
     double squared = Math.sqrt(distance);
     System.out.printf(" \n Distance is %.2f, Squared is %.2f", distance, squared);
     
     double midpoint_x = (Vertex_B_X + Vertex_A_X) / 2;
     double midpoint_y = (Vertex_B_Y + Vertex_A_Y) / 2;
     
     System.out.printf(" \n Midpoint X is %.2f, Midpoint Y is %.2f", midpoint_x, midpoint_y);
        
  }
  }