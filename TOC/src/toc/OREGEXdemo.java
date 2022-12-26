
package toc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class OREGEXdemo {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("Enter the file name:");
        Scanner sc=new Scanner(System.in);
        System.out.print(">");
        String str=sc.nextLine();
       File f= new File("D:\\file\\sequences\\sequences\\"+str);
                         
            Scanner collect=new Scanner(f);                           
            BufferedReader a = new BufferedReader(new FileReader(f));
           
         
              
              
                 int line = 0;
            for (String x = a.readLine(); x != null; x =a.readLine()) 
            {
                line++;
             String[] tokens = x.split(" ");
                for (int i = 0; i < tokens.length; i++) {
                    System.out.println("Str[" + i + "]:" + tokens[i]);                                                      
                }
                                             
//                System.out.println("Enter the character:");
//                 Scanner s = new Scanner(System.in);
//                   char c = s.next().charAt(0);
//                 
//                  for (int j = 0; j < tokens.length; j++) { 
//                if(tokens[j].charAt(0)==c)
//                  System.out.println(tokens[j]);          
//               }  

                 }   
            
            a.close();
           }                 
      }
    
    

