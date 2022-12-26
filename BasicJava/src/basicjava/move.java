
package basicjava;

import java.io.*; 

public class move{
   public static void main(String[] args) 
    { 
        File file = new File("D:\\2.1\\Dipok sir\\project\\File\\4.txt"); 
          
        // renaming the file and moving it to a new location 
        if(!file.renameTo
        (new File("D:\\2.1\\Dipok sir\\project\\File\\New folder\\raju.txt")))
        {
            System.out.println("Failed to move the file"); 
        } 
        else
        {
            // if file copied successfully then delete the original file
            file.delete();
            System.out.println("File moved successfully");
        } 
  
          
    } 
} 

        
    

