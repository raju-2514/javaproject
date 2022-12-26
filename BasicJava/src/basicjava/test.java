
package basicjava;

import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.*; 
  


public class test {
    
    
   // public static void main(String[] args) 
      public static void main(String[] args) throws IOException 
    { 
        Path temp = Files.move 
        (Paths.get("D:\\2.1\\Dipok sir\\project\\File\\4.txt"),  
        Paths.get("D:\\2.1\\Dipok sir\\online Class\\445.txt")); 
  
        if(temp != null) 
        { 
            System.out.println("File renamed and moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
    } 
} 