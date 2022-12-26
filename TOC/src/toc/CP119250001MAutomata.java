/****
*   Name  : <Md Raju Biswas>
*   Roll No: <ASH1925001M>
*   Email   : <raju1914@student.nstu.edu.bd>
*   Date     : <11.9.21-12.9.21 >
****/

package toc;

import java.util.Scanner;
import java.util.regex.Pattern;


public class CP119250001MAutomata {
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
     public static boolean g(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
     
     public static boolean h(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        }  
   
       
   public static boolean i(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
    
   public static boolean j(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
   public static boolean k(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        }  
   
       
   public static boolean l(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
    
   public static boolean m(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
     public static boolean n(String reg,String input)
    {
         boolean b2=Pattern.compile(reg).matcher(input).matches(); 
         return b2;
        
      }  
    
   public static void main(String args[]) {
       
     
      //Reading String from user
      System.out.println("Enter a String E(0,1):");
      Scanner sc = new Scanner(System.in);
      String input=sc.nextLine();
      
     CP119250001MAutomata ob=new CP119250001MAutomata();
      
       System.out.println("\n Question a :"+ob.a( "1[01]*0",input));
       System.out.println("\n Question b :"+ob.b("[01]*1[01]*1[01]*1[01]*", input));
       System.out.println("\n Question c :"+ob.c("[01]*0101[01]*",input));
       System.out.println("\n Question d :"+ob.d("[01][01]0[01]",input));
       System.out.println("\n Question e :"+ob.e( "0([01][01])*|1[0]([01][01])*",input));
       System.out.println("\n Question f :"+ob.f("[^(110)]", input));
       System.out.println("\n Question g :"+ob.g("[01]{0,5}",input));
       System.out.println("\n Question h :"+ob.h("[^(11)(111)]",input));
       System.out.println("\n Question i :"+ob.i( "1([01]1)*",input));
       System.out.println("\n Question j :"+ob.j("0{2,}1?|1?0{2,}|0+1?0+", input));
       System.out.println("\n Question k :"+ob.k("0?",input));
       System.out.println("\n Question l :"+ob.l("(00)*1*(00)*|0*10*10*",input));
       System.out.println("\n Question m :"+ob.m("()",input));
       System.out.println("\n Question n :"+ob.n("[01]+",input));
       
  
      
   }
}   
    
    
/****
*   
*   cp1@<ASH1925001M>#2021
*   
****/
