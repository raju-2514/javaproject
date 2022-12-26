
package practice.java;

import java.util.Scanner;


public class Triangle {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double b,h;
        
        System.out.println("Enter the valu of d:");
        b=input.nextDouble();
        
        System.out.println("Enter the height of this triangle h:");
        h=input.nextDouble();
        
        double result=0.5*b*h;
        
        System.out.println("The are of the Triangle ="+result);
        
    }
}
