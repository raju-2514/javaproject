

package basicjava;

import java.nio.file.*;




public class ReadTextAsString {
    
 public static String readFileAsString(String fileName)throws Exception 
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(fileName))); 
    return data; 
  } 
  
  public static void main(String[] args) throws Exception 
  { 
    String data = readFileAsString("F:\\Home 2020\\Java code\\BasicJava\\src\\basicjava\\delete.java"); 
    System.out.println(data); 
  } 
} 
