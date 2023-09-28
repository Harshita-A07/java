package javaapplication4;
import java.util.*;
import pack1.MathOperations;
import pack2.StringOperations;
import pack3.Calculator;

public class exp4common {
    public static void main(String[] args) {
      
        Scanner obj = new Scanner(System.in);
        System.out.println("enter no1:");
        int a = obj.nextInt();      
        System.out.println("enter no2 except 0 ");
        int b = obj.nextInt();
           
        MathOperations m= new MathOperations();
        m.add(a,b);
        m.subtract(a,b);
        Calculator c =new Calculator();
        c.multiply(a,b);
        c.divide(a,b);
        System.out.println("enter two strings:");
        String n = obj.next();
        String o = obj.next();
        StringOperations s =new StringOperations();
        
        s.concatenate(n,o);
        s.reverse(n,o);
}
}

// MathOperations.java

package pack1;
public class MathOperations{
      public void add(int a, int b){
        System.out.println("add: "+(a+b));
           
    }
        public void subtract(int a,int b){
        System.out.println("sub: "+(a-b));
        
    }
}

//StringOperations
package pack2;
public class StringOperations{
   public void concatenate(String s,String s1){
        System.out.println("concatenated string: "+s+s1);
}
   public void reverse(String s,String s1){
        String s2="";
        String s3="";
        for(int i =s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            s2+=ch;
        }
        for(int j =s1.length()-1;j>=0;j--){
            char ch = s1.charAt(j);
            s3+=ch;
        }
        System.out.println("Reversed String: "+ s2);
        System.out.println("Reversed String: "+ s3);

    }
}

//Calculator.java
package pack3;
public class Calculator{
     public void multiply(int a, int b){
        System.out.println("mul :"+a*b);
    }
        public void divide(int a,int b){
            try{
                if (b==0){
                    throw new ArithmeticException("enter no greater than 0");
                }
                else{
                            System.out.println("div :"+a/b);

                }
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
}
