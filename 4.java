//4numbers in words

package java1
import java.util.*;
public class Java1
{
public static void main(String[] args)
{
Scanner obj = new Scanner (System.in);
System.out.print ("Enter number:");
String n = obj.next();
int 1 = n.length();
for (int i=0;i<1;i++)
{
switch(n.charAt(i))
{
case '0':
    System.out.print ("Zero "); 
    break;
case '1':
     System.out.print("One ");
     break;
case '2':
     System.out.print("Two ");
     break;
case '3':
     System.out.print("Three ");
     break;
case '4':
     System.out.print("Four ");
     break;
case '5':
    System.out.print("Five ");
    break;
case '6':
    System.out.print("Six ");
    break;
case '7':
     System.out.print("Seven ");
     break;
case '8':
     System.out.print("Eight ");
      break;
case '9':
     System.out.print("Nine ");
     break;
   }
  }
 }
}



