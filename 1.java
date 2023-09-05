package javaapplication1;
import java.util.*;

public class JavaApplication1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("enter value for x");
        float a = obj.nextFloat();
        System.out.println("enter value for y");
        float b = obj.nextFloat();
        System.out.println("enter value for z");
        float c = obj.nextFloat();
        point3D p = new point3D();
        p.setx(a);
        p.sety(b);
        p.setz(c);
        p.setxy(a,b);
        p.setxyz(a,b,c);
        System.out.println(p);  
    }
   
}
class point2D{
     float x,y;
     float[] xy =  new float[3];
     
     point2D(){
         x=12.5f;
         y=20.4f;
         
       }
     point2D(float x,float y){
         this.x=x;
         this.y=y;
     }
            public float getx(){
                return x;
            }
            void  setx(float a){
                 x=a;
            }
            public float gety(){
                return y;
            }
           
            void sety(float b){
                y =b;
            }
             
            void  setxy(float a,float b){
                xy[0]=a;
                xy[1]=b;
            }
         
            public float[] getxy(){
                return xy;
                         
             }
            public String toString(){
                return "("+getxy()+")";
                        }
}
class point3D extends point2D{
     float x,y,z;
     point3D(){
         z=35.7f;
         
       }
     point3D(float x,float y,float z){
         this.x=x;
         this.y=y;
         this.z=z;

         
     }
        public float getz(){
                return z;
            }
     
         void setz(float c){
                z=c;
            }
         void  setxyz(float a,float b,float c){
                  xy[0]=a;
                  xy[1]=b;
                  xy[2]=c;
       }
       public float[] getxyz(){
             return xy;

            }
       
         public String toString(){
                return Arrays.toString(getxy());
         }
}
