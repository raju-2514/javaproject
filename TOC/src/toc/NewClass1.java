
package toc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NewClass1 {
       public static void main(String args[]) throws FileNotFoundException{   
      
        String text = "abcdefghij\nklmnopq\nzzzz"
                 ;
        System.out.println("**********Orignal Text**********");
        System.out.println(text);
        text = text.replaceAll("\\R", " "); 
        System.out.println("*******************************");
        System.out.println("**********Modified Text********");
        System.out.println(text);
        
    }

}   
    

