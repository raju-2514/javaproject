
package toc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class OREGEX_v2 {
     public static void main(String args[]) throws FileNotFoundException{   
              // Declare File object  
              
               System.out.println("Enter the file name:");
        Scanner sc=new Scanner(System.in);
        System.out.print(">");
        String str=sc.nextLine();
       File f= new File("D:\\file\\sequences\\sequences\\"+str);
       // File file = new File("D:\\file\\sequences\\sequences\\1.txt");  
        // initialize the scanner  
        Scanner scan = new Scanner(f);  
        // iterate through the file line by line  
        
        String[] tokens;
        int line=0;
        
        System.out.println("Enter the character:");
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        
        while(scan.hasNextLine()){  
            // print the contents of a file by line  
           // System.out.println(scan.nextLine()); 
            
            String x=scan.nextLine();
            String n=x.replaceAll("\\R", "");
            tokens = n.split(" ");
                for (int i = 0; i < tokens.length; i++)
                {
                    line++;
                    //  System.out.println("Str[" + i + "]:" + tokens[i]);   
                  
                }
                 for (int j = 0; j < tokens.length; j++) { 
                if(tokens[j].charAt(0)==c)
                System.out.println(tokens[j]);          
               }  
 
          
                       
               }  
         
       // System.out.println(line);
        scan.close();  
     }    
}   
            
     