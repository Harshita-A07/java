import java.io.*;

public class Main {
    public static void main (String args[]){
        int count=0,count1=0,count2=0;
        String m[] = new String[50];
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\22cseb03\\Documents\\NetBeansProjects\\exp8\\src\\exp81.java");
            FileInputStream fin1 = new FileInputStream("C:\\Users\\22cseb03\\Desktop\\exp8.txt");
            FileInputStream fin2 = new FileInputStream("C:\\Users\\22cseb03\\Desktop\\text1.txt");

            int i;
            char c;
            while((i=fin.read())!= -1 ){
                c = (char)i;
                  while(c == ' '){
                     
                       count++;
                    }
        }
            while((i=fin1.read())!= -1 ){
                c = (char)i;
                  if(c == ' '){
                       count1++;
                    }
        }
            while((i=fin2.read())!= -1 ){
                c = (char)i;
                  if(c == ' '){
                       count2++;
                    }
        }
            System.out.println("javafile count: "+count+1);
            System.out.println("textfile1 count: "+count1+1);
            System.out.println("textfile2 count: "+count2+1);

        }
        catch(Exception e){
            System.out.print(e);
        }
       
    }
}
