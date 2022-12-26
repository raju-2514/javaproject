
package sceond;

import java.util.Scanner;


public class Checkingvawelconsonant {
    
    public static void main(String[] args) {
        char s;
        System.out.println("Enter the Character :");
        Scanner input=new Scanner(System.in);
        s=input.next().charAt(3);
        
        if(s=='a'|| s=='e'|| s=='i'|| s=='o' || s=='u' ||s=='A'|| s=='E'|| s=='I'|| s=='O' || s=='U'  )
        {
            System.out.println(s+" is vowel");
        }
        else
        {
        System.out.println(s+" consonant");
        }
    }
    
}
