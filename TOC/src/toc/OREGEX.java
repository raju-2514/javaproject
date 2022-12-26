
package toc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class OREGEX {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
              // Declare File object  
              
        System.out.println("Enter the file name:");
        Scanner sc=new Scanner(System.in);
        System.out.print("-->");
        String str=sc.nextLine();
       File f= new File("D:\\file\\sequences\\sequences\\"+str);
        Scanner scan = new Scanner(f);  
       
        
        // iterate through the file line by line  
        String[] tokens;
        int line=0;
       System.out.println("Enter the character:");
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        
        while(scan.hasNextLine()){
            
            String x=scan.nextLine();
            String n=x.replaceAll("\\R", "");
            tokens = n.split(" ");
                for (int i = 0; i < tokens.length; i++)
                {
                    line++;
                    // System.out.println("Str[" + i + "]:" + tokens[i]);   
                  
                }
                
                //matching part
                 for (int j = 0; j < tokens.length; j++) { 
                if(tokens[j].charAt(0)==c)
                System.out.println(tokens[j]);          
               }  
 
          
                       
               }  
         
        scan.close();  
     }    
}   
         
       

       
            

