/****
*   Name  : <Md Raju Biswas>
*   Roll No: <ASH1925001M>
*   Email   : <raju1914@student.nstu.edu.bd>
*   Date     : <11.9.21-12.9.21 >
****/




package toc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CP1demo {
    
//    public static boolean m(String p,String input)
//    {
//        return  ;
//    
//    }
//    
public static void main(String args[]) {
       
     
      //Reading String from user
      System.out.println("Enter a String");
      Scanner sc = new Scanner(System.in);
      String input=sc.nextLine();
      
      
      
   Pattern p = Pattern.compile("()");//. represents single character  
   Matcher m = p.matcher(input);  
   boolean b = m.matches();  
     System.out.println(b); 
     
//    boolean b2=Pattern.compile(input).matcher("1(1+0)*0").matches(); 
//    System.out.println(b2); 
}
}

/****
*   
*   cp1@<ASH1925001M>#2021
*   
****/