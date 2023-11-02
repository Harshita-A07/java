package javaapplication1;

import java.util.*;
import java.io.*;

public class exp9ii {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter file name");
        String filename = s.nextLine();
        try { 
            File file = new File(filename);
            if(file.exists()){
                System.out.println("file exists ");
                System.out.println("fileRead  "+file.canRead());
                System.out.println("fileWrite  "+file.canWrite());
                boolean found = false;
                for(int i = filename.length()-1;i>=0;i--){
                    if(filename.charAt(i)=='.'){
                        System.out.println("type:"+filename.substring(i+1));
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("type:unknown");            
                }
            
                System.out.println("length "+file.length());
        }
            else{
                    System.out.print("file does not exists");
                        }
            }
         catch (Exception ex) {
        }
        
    }
}
