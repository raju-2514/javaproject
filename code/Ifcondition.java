
package practice.java;

import java.util.Scanner;


public class Ifcondition {
    
    public static void main(String[] args) {
        int a,b;
        
         
       System.out.println("Enter the first  value :");
       Scanner r=new Scanner(System.in);
           a=r.nextInt();
        
        System.out.println("Enter the second value :");
        Scanner e=new Scanner(System.in);
        b=e.nextInt();
        
        if(a>b)
        {
            System.out.println("First value "+a+"  is greater");
        }
        else
        {
            System.out.println("Second value "+b+" is greater ");
        }
        
        
        
    }
    
}
