/*Three-letter acronyms are common in the business world. For example, in Java you use the IDE
(Integrated Development Environment) in the JDK (Java Development Kit) to write programs
used by the JVM (Java Virtual Machine) that you might send over a LAN (local area network).
Programmers even use the acronym TLA to stand for three-letter acronym. Write a program that
allows a user to enter three words, and display the appropriate three-letter acronym in all
uppercase letters. If the user enters more than three words, ignore the extra words. Save the file
as ThreeLetterAcronym.java.
import java.util.*;*/

public class Main {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the string to obtain short form:");
        String s = obj.nextLine();//sentence
       String str[]= s.split(" ");
       String c="";
       for(int i=0;i<3;i++){
            c+=str[i].charAt(0);
       }
           System.out.println(c.toUpperCase());
    }
    
    
}
