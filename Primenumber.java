
package sceond;

import java.util.Scanner;


public class Primenumber {
    public static void main(String[] args) {
        
          System.out.println("Enter the number :");
          Scanner input=new Scanner(System.in);
          int num=input.nextInt();
       // int num=7;
        int i,count=0;
        for(i=2;i<num;i++)
        {
        if(num%i==0)
        {
         count++;
        }
        }
        if(count==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
        
    }
    
}
