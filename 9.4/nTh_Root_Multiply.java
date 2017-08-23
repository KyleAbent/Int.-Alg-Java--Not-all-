import java.util.Scanner;

public class nTh_Root_Multiply
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("9.4.29 #1 Group_A_B_Product_Property of Radicals\n");
      
      int Group_A_Index = 1;
      System.out.println("Enter Group_A_Index");
      Group_A_Index = keyboard.nextInt();
      int Group_A_Radicand = 1;
      System.out.println("Enter Group_A_Radicand");
      Group_A_Radicand = keyboard.nextInt();
      
      int Group_B_Index = 1;
      int Group_B_Racidand = 1;
      
      System.out.println("Enter Group_B_Index");
      Group_B_Index = keyboard.nextInt();
      
      System.out.println("Enter Group_B_Racidand");
      Group_B_Racidand = keyboard.nextInt();
      
      if (Group_A_Index == Group_B_Index)
      {
        double productPropertyofRadicals = Group_A_Radicand * Group_B_Racidand;//multiply raciands
        System.out.println("Index " + Group_A_Index + " Radical " + productPropertyofRadicals);
      }
   }
   
}
