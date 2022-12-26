
package toc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ASH1925001M {
    public static void main(String[] args) {
        
        
        
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(new File("D:\\file\\sequences\\sequences\\")));
            System.out.println("File open successful!");
            int line = 0;
            String[] tempArray;
            for (String x = in.readLine(); x != null; x = in.readLine())
            {
                line++;
                String[] tokens = x.split(" ");
                for (int i = 0; i < tokens.length; i++) {
                    System.out.println("Str[" + i + "]:" + tokens[i]);
                }
            }
        } catch (IOException e)
        {
            System.out.println("File I/O error!");
        }
    
}

    }
     