import java.util.Scanner;
import java.util.Random;
public class Ch_10_5_33
{ 
  public static void main(String[] args)
  {
   double Number_A = 0;
   double Number_B = 0;
   double Number_C = 0;   
   String MinusorAdd_One = "";
   String MinusorAdd_Two = "";
   int Number_A_Exponent = 2;
   Random Rand = new Random();
   System.out.println("Kyle Abent"); 
   System.out.println("Ch. 10.4 && 10.5");
      Scanner keyboard = new Scanner(System.in);
      System.out.print("\nEnter Number_A:  ");
      Number_A = keyboard.nextDouble();
      System.out.print("Enter Number_B:  ");
      Number_B = keyboard.nextDouble();  
      System.out.print("Enter Number_C: ");
      Number_C = keyboard.nextDouble(); 

       double Formula_One = -( Number_B / ( 2 * Number_A)  );
       System.out.println("Formula_One is " + Formula_One);
       double Vertex_X = Formula_One;
       double Vertex_Y =  Number_A * ( Math.pow(Vertex_X , Number_A_Exponent) )
                        +  (Number_B* Vertex_X)  +  Number_C ;
       System.out.println("Vertex_X is " + Vertex_X + " Vertex_Y is " + Vertex_Y);
       
       double Discriminant = 0;
       Discriminant = Math.pow(Number_B, 2) - 4 * Number_A * Number_C;
       System.out.println("Discriminant is " + Discriminant);    
       
       int numberOf = 0;
       
       if (Discriminant >0){numberOf = 2;}
       else if (Discriminant == 0){ numberOf = 1;}
        
        //Bye Bye imaginary!
          
        System.out.println("the graph has a number of " + numberOf + " intercepts"); 
        
        
        double QFormula_Pos = -Number_B + Math.sqrt(Math.pow( Number_B, 2)  -4 * Number_A  * Number_C);
        QFormula_Pos = QFormula_Pos / ( 2 * Number_A );
        double QFormula_Pos_YVector = ( Number_A * Math.pow( QFormula_Pos, 2) ) + ( Number_B * QFormula_Pos ) + Number_C;
        System.out.printf("\n ( %.2f, %.2f )", QFormula_Pos, QFormula_Pos_YVector);
  
        
        double QFormula_Neg = -Number_B - Math.sqrt(Math.pow( Number_B, 2)  -4 * Number_A  * Number_C);
        QFormula_Neg = QFormula_Neg / ( 2 * Number_A );
        double QFormula_Neg_YVector = ( Number_A * Math.pow( QFormula_Neg, 2) ) + ( Number_B * QFormula_Neg ) + Number_C;
        System.out.printf("\n (%.2f, %.2f)", QFormula_Neg, QFormula_Neg);
        
        
        if (QFormula_Pos == QFormula_Neg)
        {
          System.out.printf("\n Axis of Symmetry is: %.2f", QFormula_Neg);
        }
        
        double Y_Intercept = 0 - 0 + Number_C;
                        
        System.out.printf("\n Y_Intercept is + %.2f", Y_Intercept);     
      
       System.out.println("\n Domain is (-inf, inf)"); 
       
        if (Vertex_Y>= 1)
        {
             System.out.printf("\n Range is (-inf, %s]", Vertex_Y); 
        }
        else 
        {
         System.out.printf("\n Range is [%s, inf)", Vertex_Y); 
        }
       
        
  }
  }