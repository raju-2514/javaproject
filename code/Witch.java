
package practice.java;

import java.util.Scanner;


public class Witch {
    public static void main(String[] args) {
        
        System.out.println("Please Enter your Age:");
        Scanner input=new Scanner(System.in);
        int b;
        b=input.nextInt();
        
      
        switch(b)
                {
            case (16):
                System.out.println("You are Under 18");
                break;
            case(2):
                System.out.println("You are eiligible for vote");
                break;
            case(3):
                System.out.println("you are senior citizen");
            default :
                System.out.println("Please Enter the valid age");
                break;
        }
    }
    
}
