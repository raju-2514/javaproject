
package sceond;

import java.util.Scanner;


public class Conditionaloperator {
    public static void main(String[] args) {
        System.out.println("Enter The  value of a and b:");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        
        int c=a>b?a:b;
        System.out.println("The large number is "+c);
        
    }
    
}
