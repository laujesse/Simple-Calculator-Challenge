
/**
 * Simple Calculator
 * 
 * Jesse Lau P7 APCS
 * Version 1 
 */
import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args)  
    {
        Scanner Calculator = new Scanner(System.in);
        double NumberOne, NumberTwo, Result;
        String Operator;
        
        System.out.println("Enter the first number: ");
        NumberOne = Calculator.nextDouble();
        System.out.println("Enter one of the following operators: +, -, *, /");
        Operator = Calculator.next();
        System.out.println("Enter the second number: ");
        NumberTwo = Calculator.nextDouble();
        
        
        if (Operator.equals("+"))  
        {
            Result = NumberOne + NumberTwo;
            System.out.println(Result);
        }
        if (Operator.equals("-"))  
        {
            Result = NumberOne - NumberTwo;
            System.out.println(Result);
        }
        if (Operator.equals("*"))  
        {
            Result = NumberOne * NumberTwo;
            System.out.println(Result);
        }
        if (Operator.equals("/"))  
        {
            Result = NumberOne / NumberTwo;
            System.out.println(Result);
        }
    }
}
            
            
        
        
        
        
   
