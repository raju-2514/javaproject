
package toc;

import java.util.Scanner;
import java.util.regex.Pattern;


public class CP2 {
    
    
    public static boolean a(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        }  
   
       
   public static boolean b(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
    
   public static boolean c(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
   public static boolean d(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        }  
   
       
   public static boolean e(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
    
   public static boolean f(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
    
    public static void main(String[] args) {
        //Reading String from user
      System.out.println("Enter a String E(0,1):");
      Scanner sc = new Scanner(System.in);
      String input=sc.nextLine();
      
      CP1 ob=new CP1();
      
       System.out.println(ob.a( "1[01]*0",input));
       System.out.println(ob.b("[01]*1[01]*1[01]*1", input));
       System.out.println(ob.c("[01]*0101[01]*",input));
       System.out.println(ob.d("[01][01]0[01]",input));
       System.out.println(ob.e( "0([01][01])*|1[0]([01][01])*",input));
       System.out.println(ob.f("[^(110)]", input));
        
    }
   
            
    
}
