package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.print("enter length");
        float len = obj.nextFloat();
        System.out.print("enter width");

        float wid = obj.nextFloat();
                
        Rectangle r=new Rectangle();
        r.setlength(len);
        r.setwidth(wid);
        System.out.println(r);
       

    }
    
}
class Rectangle{
       private float length,width;
        
        public float getlength(){
            return length;
        }
         public float getwidth(){
            return width;
        }
          public double getarea(){
           return width*length;
        }
           public double getperimeter(){
            return 2*(length*width);
        }
         
        public void setlength(float l){
            this.length=l;
        }
         public void setwidth(float w){
            this.width=w;
        }
        
         public String toString(){
             return "length = "+length+"\nwidth = "+width+"\narea = "+getarea()+"\nperimeter = "+getperimeter();
             
        }
        
}
