import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ch_7_Test_3
{
   public static void main(String[] args)
   {  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Kyle Abent");
      System.out.println("Intermediate Algebra");
      System.out.println("Ch. 7 Test #3\n");
      
      int Group_A_Numerator_A = 1; //0;
      String Group_A_Numerator_A_Variable = "x"; //"";
      int Group_A_Numerator_A_Exponent = 2; //0;
      int Group_A_Numerator_B = -1; //0;
      int Group_A_Numerator_B_Exponent = 2; //0;
      String Group_A_Numerator_B_Variable = "y"; //"";

      int Group_A_Denominator_A = 1; //0;
      String Group_A_Denominator_A_Variable = "x"; //"";
      int Group_A_Denominator_A_Exponent = 2; //0; 
      int Group_A_Denominator_B = 1; //0;
      String Group_A_Denominator_B_Variable = "xy"; //"";
      
      /*
      System.out.println("Enter Numerator_A");
      Group_A_Numerator_A = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter Group_A_Numerator_A_Variable");
      Group_A_Numerator_A_Variable = keyboard.nextLine();
      
      System.out.println("Enter Numerator_A_Exponent");
      Group_A_Numerator_A_Exponent = keyboard.nextInt();
      
      
      System.out.println("Enter Numerator_B");
      Group_A_Numerator_B = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter Group_A_Numerator_B_Variable");
      Group_A_Numerator_B_Variable = keyboard.nextLine();
      System.out.println("Enter Numerator_B_Exponent");
      Group_A_Numerator_B_Exponent = keyboard.nextInt();
            
      
      System.out.println("Enter Group_A_Denominator_A");
      Group_A_Denominator_A = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter Group_A_Denominator_A_Variable");
      Group_A_Denominator_A_Variable = keyboard.nextLine();
      System.out.println("Enter Group_A_Denominator_A_Exponent");
      Group_A_Denominator_A_Exponent = keyboard.nextInt();
     
      System.out.println("Enter Group_A_Denominator_B");
      Group_A_Denominator_B = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter Group_A_Denominator_B Variable");
      Group_A_Denominator_B_Variable = keyboard.nextLine();
      */

      
      
      
       System.out.println("Group_A_" + "" + Group_A_Numerator_A + Group_A_Numerator_A_Variable + "E" + Group_A_Numerator_A_Exponent + Group_A_Numerator_B  + Group_A_Numerator_B_Variable + "E" +Group_A_Numerator_B_Exponent + "/" + Group_A_Denominator_A + Group_A_Denominator_A_Variable + "E" + Group_A_Denominator_A_Exponent +  "+" + Group_A_Denominator_B  + Group_A_Denominator_B_Variable );
       
       System.out.println("Multiplied by ");
       
       int Group_B_Numerator_A = 7; //0;
       String Group_B_Numerator_A_Variable = "x"; //"";
       int Group_B_Numerator_A_Exponent = 2; //0;
       String Group_B_Denominator_A_Variable = "x"; //"";
       
       int Group_B_Numerator_B = 1; //0;
       String Group_B_Numerator_B_Variable = "y"; //"";
       
             
       
       int Group_B_Denominator_A = 1; //0;
       String Group__Denominator_A_Variable = "x"; //"";
       int Group_B_Denominator_A_Exponent = 2; //0;
       
       int Group_B_Denominator_B = -2; //0;
       String Group_B_Denominator_B_Variable = "xy"; //"";
       
       int Group_B_Denominator_C = 1; //0;
       int Group_B_Denominator_C_Exponent = 2; //0;
       String Group_B_Denominator_C_Variable = "y"; //"";
       
       int Group_B_Numerator_C_Exponent = 2; //0;
      
      /*
      System.out.println("Enter Group_B_Numerator_A");
      Group_B_Numerator_A = keyboard.nextInt(); 
      keyboard.nextLine();
      System.out.println("Enter Group_B_Numerator_A_Variable");
      Group_B_Numerator_A_Variable = keyboard.nextLine();
      System.out.println("Enter Group_B_Numerator_A_Exponent");
      Group_B_Numerator_A_Exponent= keyboard.nextInt(); 
      
      System.out.println("Enter Group_B_Numerator_B");
      Group_B_Numerator_B = keyboard.nextInt(); 
      keyboard.nextLine();
      
            
      System.out.println("Enter Group_B_Numerator_B_Variable");
      Group_B_Numerator_B_Variable = keyboard.nextLine(); 
      
      
      System.out.println("Enter Group_B_Denominator_A");
      Group_B_Denominator_A = keyboard.nextInt(); 
      keyboard.nextLine();
     
      System.out.println("Enter Group_B_Denominator_A_Variable");
      Group_B_Denominator_A_Variable = keyboard.nextLine(); 
      
      System.out.println("Enter Group_B_Denominator_A_Exponent");
      Group_B_Denominator_A_Exponent = keyboard.nextInt(); 
     System.out.println("Enter Group_B_Denominator_B");
      Group_B_Denominator_B = keyboard.nextInt(); 
      keyboard.nextLine();
      
      System.out.println("Enter Group_B_Denominator_B_Variable");
      Group_B_Denominator_B_Variable= keyboard.nextLine(); 
      
      
      System.out.println("Enter Group_B_Denominator_C");
      Group_B_Denominator_C = keyboard.nextInt(); 
      
      keyboard.nextLine();
      System.out.println("Enter Group_B_Denominator_C_Variable");
      Group_B_Denominator_C_Variable= keyboard.nextLine(); 
      
      System.out.println("Enter Group_B_Denominator_C_Exponent");
      Group_B_Denominator_C_Exponent = keyboard.nextInt(); 
      */
      
      
      
           System.out.println("Group_B " + Group_B_Numerator_A + 
           Group_B_Numerator_A_Variable + "E" + Group_B_Numerator_A_Exponent + 
           Group_B_Numerator_B  + Group_B_Numerator_B_Variable + "/ " + 
           Group_B_Denominator_A + Group_B_Denominator_A_Variable + "E" +
            Group_B_Denominator_A_Exponent + "+ " +
            Group_B_Denominator_B  + Group_B_Denominator_B_Variable + 
            Group_B_Denominator_C + Group_B_Denominator_C_Variable + "E" 
            +Group_B_Denominator_C_Exponent);
            
   System.out.println("" +
   Group_B_Numerator_A + Group_B_Numerator_A_Variable + 
   Group_B_Numerator_A_Exponent + Group_B_Denominator_A_Variable 
   + Group_B_Numerator_B + Group_B_Numerator_B_Variable +
    Group_B_Numerator_B + Group_B_Numerator_B_Variable + 
   Group_B_Denominator_A + Group__Denominator_A_Variable + 
   Group_B_Denominator_A_Exponent + 
   Group_B_Denominator_B + Group_B_Denominator_B_Variable + 
   Group_B_Denominator_C + Group_B_Denominator_C_Variable
    + Group_B_Denominator_C_Exponent );

   
      /*
          After input Formula:
          
          Group_A_Numerator: Do while loop from question #2
          
          Group_A_Denominator: Nwe formula: Factor// Remove Variable X from
          
          Group_B_Numerator: Nothing
          
          Group_B_Denominator: Same as Group_A_Numerator
          
          Then cross cancel
      */
    /*  
   -----------------------------------------------------------
        ----Group_A_Numerator Start
   -----------------------------------------------------------
   */
      boolean group_A_numeratorMatchFactor = false;
      double group_A_Num_scanningNumberOne = 0.2;
      double group_A_Num_scanningNumberTwo = 0.1;
      double group_A_numeratorAnswer = 0;
      boolean group_A_numerator_B_isPositive = (Group_A_Numerator_B >= 1);
      char Group_A_Numerator_B_Variable_Y = Group_A_Numerator_B_Variable.charAt(0); // Y      
             do 
    { 
       group_A_Num_scanningNumberOne = group_A_Num_scanningNumberOne + 0.1;
       group_A_Num_scanningNumberTwo = group_A_Num_scanningNumberTwo + (group_A_numerator_B_isPositive? 0.1: -0.1);
       group_A_numeratorAnswer = Math.rint(group_A_Num_scanningNumberOne * group_A_Num_scanningNumberTwo);
      // System.out.println(" " + group_A_Num_scanningNumberOne + "*" + group_A_Num_scanningNumberTwo + "== " + group_A_numeratorAnswer);  
      if (group_A_numeratorAnswer == Group_A_Numerator_B) { group_A_numeratorMatchFactor = true ; }
    }
    while (!group_A_numeratorMatchFactor);
    {
      group_A_numeratorAnswer = Math.rint(group_A_Num_scanningNumberOne * group_A_Num_scanningNumberTwo);
    }  
     if (group_A_numeratorMatchFactor)
     {
      group_A_Num_scanningNumberOne = Math.rint(group_A_Num_scanningNumberOne);
      group_A_Num_scanningNumberTwo = Math.rint(group_A_Num_scanningNumberTwo);
      String group_A_numeratorAnswerResult = String.format("%.2f", group_A_numeratorAnswer);
      //System.out.println(" " + group_A_Num_scanningNumberOne + "*" + scanningNumberTwo + "== " + group_A_numeratorAnswer);  
      System.out.println("Group_A_Numerator: ("+Group_A_Numerator_A + "x + " + 
      group_A_Num_scanningNumberOne + Group_A_Numerator_B_Variable_Y + ")" +
       "(x " + group_A_Num_scanningNumberTwo + Group_A_Numerator_B_Variable_Y + ")"); 
     }


    /*  
   -----------------------------------------------------------
        ----Group_A_Numerator_A----- End
   -----------------------------------------------------------
    */  
    
    /*
   ------------------------------------------------------------
        ----Group_A_Denominator Start
   -----------------------------------------------------------
   
       //Seperate formula to instead factor by commonalities
   */    
   
         Group_A_Denominator_A_Exponent = Group_A_Denominator_A_Exponent - 1; //Factor X
      
         char Group_A_Denominator_B_Variable_X = Group_A_Denominator_B_Variable.charAt(0); // isolate X
         char Group_A_Denominator_B_Variable_Y = Group_A_Denominator_B_Variable.charAt(1); // Isolate y of x
         
         
System.out.println("Group_A_Denominator:" + Group_A_Denominator_B_Variable_X  + "(" +  
Group_A_Denominator_B_Variable_X + "+" + Group_A_Denominator_B_Variable_Y + ")" ) ;
   
  
     
     
    /*  
   -----------------------------------------------------------
        ----Group_A_Denominator----- End
   -----------------------------------------------------------
    */   
    
    
        /*  
   -----------------------------------------------------------
        ----Group_B_Numerator----- Start
   -----------------------------------------------------------
    */   //Do nothing yet
    
            
   System.out.println("Group_B_Numerator " + Group_B_Numerator_A + Group_B_Numerator_A_Variable + "E" + 
   Group_B_Numerator_A_Exponent + Group_B_Numerator_B  + Group_B_Numerator_B_Variable);
        
        /*  
   -----------------------------------------------------------
        ----Group_B_Numerator----- End
   -----------------------------------------------------------
    */   
    
            /*  
   -----------------------------------------------------------
        ----Group_B_Denominator----- Start
   -----------------------------------------------------------
         */
         
         //Same formula as Group_A_Numerator, with re-referenced names.
         //This time subtractig, not adding.
         
          boolean group_B_denominatorMatchFactor = false;
      double group_B_Den_scanningNumberOne = 0.2;
      double group_B_Den_scanningNumberTwo = 0.1;
      double group_B_denominatorAnswer = 0;
      boolean groupB_denominator_B_isPositive = (Group_B_Denominator_C >= 1);
      char Group_B_Denominator_B_Variable_X = Group_B_Denominator_B_Variable.charAt(0); // isolate X
      char Group_B_Denominator_B_Variable_Y = Group_B_Denominator_B_Variable.charAt(1); // Isolate y of x
      
             do 
    { 
       group_B_Den_scanningNumberOne = group_B_Den_scanningNumberOne + 0.1;
       group_B_Den_scanningNumberTwo = group_B_Den_scanningNumberTwo + (groupB_denominator_B_isPositive? 0.1: -0.1);
       group_B_denominatorAnswer = Math.rint(group_B_Den_scanningNumberOne * group_B_Den_scanningNumberTwo);
      // System.out.println(" " + group_B_Den_scanningNumberOne + "*" + group_B_Den_scanningNumberTwo + "== " + group_B_denominatorAnswer);  
      if (group_B_denominatorAnswer == Group_B_Denominator_C) { group_B_denominatorMatchFactor = true ; }
    }
    while (!group_B_denominatorMatchFactor);
    {
      group_B_denominatorAnswer = Math.rint(group_B_Den_scanningNumberOne * group_B_Den_scanningNumberTwo);
    }  
     if (group_B_denominatorMatchFactor)
     {
      group_B_Den_scanningNumberOne = Math.rint(group_B_Den_scanningNumberOne);
      group_B_Den_scanningNumberTwo = Math.rint(group_B_Den_scanningNumberTwo);
      String group_B_denominatorAnswerResult = String.format("%.2f", group_B_denominatorAnswer);
      //System.out.println(" " + group_A_Num_scanningNumberOne + "*" + scanningNumberTwo + "== " + group_A_numeratorAnswer);  
      System.out.println("Group_B_Denominator: ("+Group_B_Denominator_A + " " + Group_B_Denominator_A_Variable +
        " - "+ group_B_Den_scanningNumberOne + Group_B_Denominator_B_Variable_Y 
       + ") " + "(" +Group_B_Denominator_A + Group_B_Denominator_A_Variable +
        " - " + group_B_Den_scanningNumberTwo + Group_B_Denominator_B_Variable_Y + " )"); 

     }
               /*  
   -----------------------------------------------------------
        ----Group_B_Denominator----- End
   -----------------------------------------------------------
         */
         
                    /*  
   -----------------------------------------------------------
        ----Answer
    -----------------------------------------------------------
         */    
         System.out.println("Now to cross cancel matches"); 
         //I'm writing this w. pencil
           // (In other words, not formulaic, but process-filled), 
               //((as if I have a pencil writing english, instead typing w. java!)
         
         int Answer_Numerator_A = Group_B_Numerator_A;
         String Answer_Numerator_A_Variable = Group_B_Denominator_A_Variable; //minus exponent
         
         String Answer_Denominator_A = Group_B_Denominator_A_Variable;
         char Answer_Denominator_B = Group_B_Denominator_B_Variable_Y;
         
         
        System.out.println("The Final Answer is:");
        System.out.println("" + Answer_Numerator_A + Answer_Numerator_A_Variable +
         Group_B_Numerator_B_Variable + "/" + Answer_Denominator_A + " - "  + Answer_Denominator_B );
         

 
   
   }
   
}