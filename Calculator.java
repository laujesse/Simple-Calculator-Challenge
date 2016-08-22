
/**
 * Simple Calculator
 * 
 * Jesse Lau P7 APCS
 * Version 1 
 */
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)  {
        Scanner Calculator = new Scanner(System.in);
        double NumberOne, NumberTwo, Operator, Result;
        
        System.out.println("Enter the first number: ");
        NumberOne = Calculator.nextDouble();
        System.out.println("Enter the second number: ");
        NumberTwo = Calculator.nextDouble();
        System.out.println("Enter 1 for addition, Enter 2 for subtraction" + "\n" + "Enter 3 for multiplication, Enter 4 for division");
        Operator = Calculator.nextDouble();
        
        if (Operator == 1)  {
            Result = NumberOne + NumberTwo;
            System.out.println(Result);
        }
        if (Operator == 2)  {
            Result = NumberOne - NumberTwo;
            System.out.println(Result);
        }
        if (Operator == 3)  {
            Result = NumberOne * NumberTwo;
            System.out.println(Result);
        }
        if (Operator == 4)  {
            Result = NumberOne / NumberTwo;
            System.out.println(Result);
        }
    }
}
            
            
        
        
        
        
   
