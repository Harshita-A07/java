//1.Write a Java program that simulates a simple calculator. Your program should take two numbers and an operator (+, -, *, /) as input from the user. Implement exception handling to handle potential errors such as division by zero and invalid operators.
import java.util.*;

class Main
{
  public static void main (String[]args)
  {
    
    Scanner obj = new Scanner (System.in);
      System.out.print ("enter numbers:");
      String a=obj.next();
      String b=obj.next();
      try{ 
         double num1 = Double.parseDouble(a);
         double num2 = Double.parseDouble(b); 
             System.out.println("You entered:" 
                  + num1 +" "+num2);
            }
             catch(NumberFormatException k) {
 
                System.out.println("NumberFormatException occurred");
            }
  
   double num1 = Double.parseDouble(a);
   double num2 = Double.parseDouble(b); 
      System.out.print ("enter operator +,-,*,/:");
    char op = obj.next ().charAt (0);
      try
    {
      if (op != '+' && op != '-' && op != '*' && op != '/')
	{
	  throw new InputException ("only enter mentioned operators://ERROR");
	}

    }
    catch (InputException p)
    {
      System.out.println (p);

    }

    double o = 0;
    switch (op)
      {
      case '+':
	o = num1 + num2;
	System.out.println ("result:" + o);
	break;
      case '-':
	o = num1 - num2;
	System.out.println ("result:" + o);
	break;
      case '*':
	o = num1 * num2;
	System.out.println ("result:" + o);
	break;
      case '/':
	try
	{
	  if (num2 == 0)
	    {
	      throw new ArithmeticException ("can't divide");
	    }
	  else
	    {
	      o = num1 / num2;
	      System.out.println ("result:" + o);
	    }
	}
	catch (ArithmeticException e)
	{
	  System.out.println (e);
	}

	break;
      default:
	System.out.println ("wrong input");
      }
  
    System.out.println ();
   

  }
}
class InputException extends Exception
{
  InputException (String msg)
  {
    super (msg);
  }
}
