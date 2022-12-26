
package basicjava;

import java.io.*;
import java.util.Scanner;


public class A {
    int a=4 ,b=28,c;
    public void add(){
    
        System.out.println("Enter the value of a and b");
          Scanner in=new Scanner(System.in);
         a=in.nextInt();
          Scanner i=new Scanner(System.in);
          b=i.nextInt();
    c=a+b;
    
        System.out.println(c);
    }
 
    public static void main(String args[]) 
    {
        String str;
        System.out.println("Enter your name:");
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        System.out.println("Welcome "+str);
        
        
       
       A a=new A();
       a.add();
       
        
}
    
}
