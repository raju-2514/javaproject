

/****
*   Name  : <Md Raju Biswas>
*   Roll No: <ASH1925001M>
*   Email   : <raju1914@student.nstu.edu.bd>
*   Date     : <11.9.21-12.9.21 >
****/

package toc;

import java.util.Scanner;
import java.util.regex.Pattern;


public class CP219250001Automata {
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
      System.out.println("Enter a String E(a,b):");
      Scanner sc = new Scanner(System.in);
      String input=sc.nextLine();
      
      CP219250001Automata ob=new CP219250001Automata();
      
       System.out.println("\n Question a :"+ob.a( "[ab]*a[ab]*b[ab]*a[ab]*b[ab]*a[ab]*",input));
       System.out.println("\n Question b :"+ob.b("abb+a|bab+a|b+aab|aabb+|bb+aa", input));
       System.out.println("\n Question c :"+ob.c("baa(aa)*|aa(aa)*b|baa(aa)*b|aba(aa)*b|aab(aa)*b",input));
       System.out.println("\n Question d :"+ob.d("abab(abab)*",input));
       System.out.println("\n Question e :"+ob.e( "aba*",input));
       System.out.println("\n Question f :"+ob.f("((ba|ab)(ba|ab))*(bb)*(aa)*(ba|ab)(aa)*(bb)*((ba|ab)(ba|ab))*", input));
        
    }
   
            
    
}
/****
*   
*   cp1@<ASH1925001M>#2021
*   
****/