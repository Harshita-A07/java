import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class exp9i {
 public static void main(String[] args){
  LineNumberReader reader = null;
    try {
      reader = new LineNumberReader(new FileReader(new File("C:\\Users\\aksha\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\example.java")));
      String str;
      // Read file till the end
      while ((str = reader.readLine()) != null){
        System.out.println(reader.getLineNumber() + ": " + str);
      }         
    
    }
    catch (Exception ex) {
        System.out.print(ex);

    } 
    }
  }
