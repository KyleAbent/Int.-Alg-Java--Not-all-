import java.util.Scanner;

public class Adding_TwoGroups_Subtract_Within_Exponent_After_Xys
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);
   ///Section 9.3.3.37 #11 ///////////////
   
   /////////Group A////////////////////
      ////////Numerator///
   int Group_A_Numerator_A = 0;
   int Group_A_Numerator_X_Exponent_Numerator = 0;
   int Group_A_Numerator_X_Exponent_Denominator = 0;
   int Group_A_Numerator_Y_Exponent_Numerator = 0;
   int Group_A_Numerator_Y_Exponent_Denominator = 0;
   
   int Group_A_Numerator_B = 1;// x
   int Group_A_Numerator_C = 1; // y
   
         System.out.print("Enter Group_A_Numerator_A " );
      Group_A_Numerator_A = keyboard.nextInt();
    
      System.out.print("Enter Group_A_Numerator_X_Exponent_Numerator " );
      Group_A_Numerator_X_Exponent_Numerator = keyboard.nextInt();
      System.out.print("Enter Group_A_Numerator_X_Exponent_Denominator" );
      Group_A_Numerator_X_Exponent_Denominator = keyboard.nextInt();
      
 //     System.out.print("Enter Group_A_Numerator_Y_Exponent_Numerator" );
   //   Group_A_Numerator_Y_Exponent_Numerator = keyboard.nextInt();
      
     //  System.out.print("Enter Group_A_Numerator_Y_Exponent_Denominator" );
     // Group_A_Numerator_Y_Exponent_Denominator = keyboard.nextInt();
      
      
    ///////////Numerator////////
    /////Denominator////// 
   int Group_A_Denominator_A = 0;
   int Group_A_Denominator_X_Exponent_Numerator = 0;
   int Group_A_Denominator_X_Exponent_Denominator = 0;
   int Group_A_Denominator_Y_Exponent_Numerator = 0;
   int Group_A_Denominator_Y_Exponent_Denominator = 0;
   
       System.out.print("Enter Group_A_Denominator_A " );
      Group_A_Denominator_A = keyboard.nextInt();
      System.out.print("Enter Group_A_Denominator_X_Exponent_Numerator " );
      Group_A_Denominator_X_Exponent_Numerator = keyboard.nextInt();
      System.out.print("Enter Group_A_Denominator_X_Exponent_Denominator " );
      Group_A_Denominator_X_Exponent_Denominator = keyboard.nextInt();
    //    System.out.print("Enter Group_A_Denominator_Y_Exponent_Numerator " );
    //  Group_A_Denominator_X_Exponent_Numerator = keyboard.nextInt();
    //  System.out.print("Enter Group_A_Denominator_Y_Exponent_Denominator " );
    //  Group_A_Denominator_Y_Exponent_Denominator = keyboard.nextInt();
      
   /////Denominator//////
   int Group_A_Entire_Whole_To_Exponent_By_Numerator = 0;
   int Group_A_Entire_Whole_Exponent_By_Denominator = 0;
   

         System.out.print("Enter Group_A_Entire_Whole_To_Exponent_By_Numerator " );
      Group_A_Entire_Whole_To_Exponent_By_Numerator = keyboard.nextInt();
        System.out.print("Enter Group_A_Entire_Whole_Exponent_By_Denominator " );
      Group_A_Entire_Whole_Exponent_By_Denominator = keyboard.nextInt();   

   // System.out.print(" "   + Group_A_Numerator_A + Group_A_Numerator_X_Exponent_Numerator + Group_A_Numerator_X_Exponent_Denominator +  Group_A_Numerator_Y_Exponent_Numerator + Group_A_Numerator_Y_Exponent_Denominator + Group_A_Denominator_A + Group_A_Denominator_X_Exponent_Numerator + Group_A_Denominator_X_Exponent_Denominator+ Group_A_Entire_Whole_To_Exponent_By_Numerator + Group_A_Entire_Whole_Exponent_By_Denominator);  
   
   /// add  ///
   
   
      /////////Group B////////////////////
        ///numerator//
   int Group_B_Numerator_A = 0;
   System.out.print("\nEnter Group_B_Numerator_A " );
   Group_B_Numerator_A = keyboard.nextInt();
   
   int Group_b_Numerator_B = 1;// x
   int Group_b_Numerator_C = 1; // y
   
   int Group_B_Numerator_X_Exponent_Numerator = 0;
   System.out.print("Enter Group_B_Numerator_X_Exponent_Numerator " );
   Group_B_Numerator_X_Exponent_Numerator = keyboard.nextInt();
  
   int Group_B_Numerator_X_Exponent_Denominator = 0;
   System.out.print("Enter Group_B_Numerator_X_Exponent_Denominator " );
   Group_B_Numerator_X_Exponent_Denominator = keyboard.nextInt();
      
   int Group_B_Numerator_Y_Exponent_Numerator = 0;
   System.out.print("Enter Group_B_Numerator_Y_Exponent_Numerator " );
   Group_B_Numerator_Y_Exponent_Numerator = keyboard.nextInt();
 
   int Group_B_Numerator_Y_Exponent_Denominator = 0;
   System.out.print("Enter Group_B_Numerator_Y_Exponent_Denominator " );
   Group_B_Numerator_Y_Exponent_Denominator = keyboard.nextInt();
   
   ////numerator////
   
   ///denominator///
   
   int Group_B_Denominator_A = 0;
   System.out.print("Enter Group_B_Denominator_A " );
   Group_B_Denominator_A = keyboard.nextInt();
   
   int Group_B_Denominator_X_Exponent_Numerator = 0;
   System.out.print("Enter Group_B_Denominator_X_Exponent_Numerator " );
   Group_B_Denominator_X_Exponent_Numerator = keyboard.nextInt();
   
   int Group_B_Denominator_X_Exponent_Denominator = 0;
   System.out.print("Enter Group_B_Denominator_X_Exponent_Denominator " );
   Group_B_Denominator_X_Exponent_Denominator = keyboard.nextInt();
   
    int Group_B_Denominator_Y_Exponent_Numerator = 0;
   System.out.print("Enter Group_B_Denominator_Y_Exponent_Numerator " );
   Group_B_Denominator_Y_Exponent_Numerator = keyboard.nextInt();
   
   int Group_B_Denominator_Y_Exponent_Denominator = 0;
   System.out.print("Enter Group_B_Denominator_Y_Exponent_Denominator " );
   Group_B_Denominator_Y_Exponent_Denominator = keyboard.nextInt();
   
   int Group_B_Entire_Whole_To_Exponent_By_Numerator = 0;
   System.out.print("Enter Group_B_Entire_Whole_To_Exponent_By_Numerator " );
   Group_B_Entire_Whole_To_Exponent_By_Numerator = keyboard.nextInt();
   
   int Group_B_Entire_Whole_To_Exponent_By_Denominator = 0;
   System.out.print("Enter Group_B_Entire_Whole_To_Exponent_By_Denominator " );
   Group_B_Entire_Whole_To_Exponent_By_Denominator = keyboard.nextInt();
   
   
  // System.out.print(" "   + Group_B_Numerator_A + Group_B_Numerator_X_Exponent_Numerator + Group_B_Numerator_X_Exponent_Denominator +  Group_B_Numerator_Y_Exponent_Numerator + Group_B_Numerator_Y_Exponent_Denominator + Group_B_Denominator_A + Group_B_Denominator_X_Exponent_Numerator + Group_B_Denominator_X_Exponent_Denominator  + Group_B_Denominator_Y_Exponent_Numerator + Group_B_Denominator_Y_Exponent_Denominator + Group_B_Entire_Whole_To_Exponent_By_Numerator + Group_B_Entire_Whole_To_Exponent_By_Denominator); 
   //denominator//
   
   
   ////Group A - Subtract Nmerator X Exponent's from Denominator X Exponent's////////  
      ///First step is to deduct the X top from X bottum
 
      int Group_A_differenceofX = Group_A_Numerator_X_Exponent_Numerator - Group_A_Denominator_X_Exponent_Numerator;    
      
      System.out.print("Group_A_X = " + Group_A_differenceofX + " / " + Group_A_Numerator_X_Exponent_Denominator); //subject to change with lcd?
      
      System.out.print("\n ( " + Group_A_Numerator_A + "/" + Group_A_Denominator_A + " ) * x" + "E(" + Group_A_differenceofX + "/" + Group_A_Numerator_X_Exponent_Denominator + ")y)E("+Group_A_Entire_Whole_To_Exponent_By_Numerator+"/"+Group_A_Entire_Whole_Exponent_By_Denominator+")");
      ////Group A - Subtract Nmerator X Exponent's from Denominator X Exponent's////////   
      ///Ok now we are done with Group A (Minus the exponent), now for B (minus exponent), then exponent then add.  
   
    ////Group B - Subtract Nmerator X Exponent's from Denominator X Exponent's//////// 
       int Group_B_differenceofX = Group_B_Numerator_X_Exponent_Numerator - Group_B_Denominator_X_Exponent_Numerator;    
      System.out.print("\nGroup_B_X = " + Group_B_differenceofX + " / " + Group_B_Numerator_X_Exponent_Denominator); //subject to change with lcd?
      
      int Group_B_differenceofY = Group_B_Numerator_Y_Exponent_Numerator - Group_B_Denominator_Y_Exponent_Numerator;    
      System.out.print("\nGroup_B_Y = " + Group_B_differenceofY + " / " + Group_B_Numerator_Y_Exponent_Denominator); //subject to change with lcd?
      
      System.out.print("\n ( " + Group_B_Denominator_A + " * x )" + "E(" + Group_B_differenceofX + "/" + Group_B_Numerator_X_Exponent_Denominator +  ")yE(" + Group_B_differenceofY + "/" + Group_B_Numerator_Y_Exponent_Denominator + "))E("+Group_B_Entire_Whole_To_Exponent_By_Numerator+"/"+Group_B_Entire_Whole_To_Exponent_By_Denominator+")");

           ////Group B - Subtract Nmerator X Exponent's from Denominator X Exponent's////////  
         ///Group B - Has a y calculation involved this time///
         
         
        ///Group B - Has a y calculation involved this time///
   }
}