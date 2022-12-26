
package basicjava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bufferreader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the input :");
        
        InputStreamReader n=new InputStreamReader(System.in) ;
        BufferedReader br=new BufferedReader(n);
        
        int a=Integer.parseInt(br.readLine());
        System.out.println(a);
         
    
                }

}
                