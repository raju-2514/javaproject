
package toc;

import java.util.Scanner;
import java.util.StringTokenizer;



public class TOC {

 
 public static void main(String args[]){  
         
   Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
     String [] arr = {"ea","aea","raji"};  
        
        for (int i = 0; i < arr.length; i++) { 
                if(arr[i].charAt(0)==c)
                        
                System.out.println(arr[i]);  

            
           
        }  
     
        
   }
 }
