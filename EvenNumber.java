
package sceond;

import java.util.Scanner;


public class EvenNumber {
    public static void main(String[] args) {
        
        System.out.println("Enter The Last value:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
         if(i%2!=0)
        {
            System.out.print(" "+i);
        }
        }
       
        
        
    }
    
}
