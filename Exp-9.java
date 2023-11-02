package javaapplication1;
import java.io.*;
public class exp9iii {
    public static void main(String args[])throws Exception{

        FileInputStream fin = new FileInputStream("C:\\Users\\aksha\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\example.java");
        int i=0;
        System.out.println("Reading using bytestream:");
        while((i=fin.read())!=-1){
        System.out.print((char)i);
        }
        fin.close();   
        System.out.println(" ");
        FileReader fin1 = new FileReader("C:\\Users\\aksha\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\example.java");
        int j;
        System.out.println("Reading using Characterstream:");

        while((j=fin1.read())!=-1){
        System.out.print((char)j);
        }
        fin1.close();
    }
}
