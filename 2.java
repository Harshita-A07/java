//1
package java1;
import java.util.*;

public class Java1 {

   
    public static void main(String[] args) {
        
        Scanner obj= new Scanner (System.in);
        System.out.println("enter a number :");
        int a = obj.nextInt();
         System.out.println("enter a number :");
        int b = obj.nextInt();
        int c;
        c=a<b?a:b;
        System.out.println(c+" is minimun ");
        }
    } 
