
package basicjava;

import java.io.*;
public class delete {

    public static void main(String[] args) {
        
        File file= new File("D:\\4.txt");
        
        if(file.delete())
        {
            System.out.println("The is deleted Seccessfully");
        }
        else
        {
            System.out.println("File is not deleted");
        }
        
    }
    
    
}
   

