
package toc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NewClass {
    public static void main(String args[]){  
        
         //Reading String from user
      System.out.println("Enter a String");
      Scanner sc = new Scanner(System.in);
      String input=sc.nextLine();
//1st way  
Pattern p = Pattern.compile("1[10]*0");//. represents single character  
Matcher m = p.matcher(input);  
boolean b = m.matches();  
  
//2nd way  
//boolean b2=Pattern.compile(".s").matcher("as").matches();  
  
//3rd way  
//boolean b3 = Pattern.matches(".s", "as");  
  
System.out.println(b);  
}
}  
    

