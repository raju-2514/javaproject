
package sceond;

import java.util.Scanner;


public class Addingmethod {
    
  public static void adding(int a,int b)
    
  {
        System.out.println("The sum valu of "+a+" and "+b +" is  "+(a+b));
     
    }
     public static void main(String[] args) 
     {
              System.out.println(" Enter the value");
              Scanner input=new Scanner(System.in);
              int a=input.nextInt();
              int b=input.nextInt();
              
             adding(a,b);
             
        
    }
    
}
