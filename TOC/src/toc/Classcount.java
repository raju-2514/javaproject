
package toc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Classcount {
    
    
    public static void classcount()
    {
    
    
    
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("Enter the name of the file :");
        System.out.println(">>");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        
   //     File f=new File("D:\\file\\sequences\\sequences\\"+str);
         FileReader fr=new FileReader("D:\\file\\sequences\\sequences\\"+str);    
      BufferedReader br=new BufferedReader(fr);    
        System.out.println(br);
        
        
    }
    
}
