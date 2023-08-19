//2
package java1;
import java.util.*;

public class Java1 {

   
    public static void main(String[] args) {
        
        Scanner obj= new Scanner (System.in);
        
        int i;
        int sum=0;
        for(i=100;i<200;i++)
        {
            if(i%7==0)
            {
                sum=sum+i; 
            }
        }
         System.out.println(sum);
        }
    } 
