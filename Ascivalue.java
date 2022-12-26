
package sceond;

import java.util.Scanner;


public class Ascivalue {
    public static void main(String[] args) {
        System.out.println("Enter the character :");
        Scanner sc=new Scanner(System.in);
        
        char chr=sc.next().charAt(0);
        int ascivalue=chr;
        System.out.println("The ASCI value of"+chr+"is "+ascivalue); 
        
        for(int i=0;i<255;i++)
        {
            System.out.println("The ASCI Value");
        }
    }
    
}
