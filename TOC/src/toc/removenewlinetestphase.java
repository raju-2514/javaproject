
package toc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class removenewlinetestphase {
    public static void main(String args[]) throws FileNotFoundException {

//Scanner Example - read file line by line in Java using Scanner
FileInputStream fis = new FileInputStream("D:\\file\\sequences\\sequences\\1.txt");
Scanner scanner = new Scanner(fis);

//reading file line by line using Scanner in Java
System.out.println("Reading file line by line in Java using Scanner");

while(scanner.hasNextLine()){
System.out.println(scanner.nextLine());
}
String text = readFileAsString("D:\\file\\sequences\\sequences\\1.txt");
text = text.replaceAll("\n","").replace("\r","");
scanner.close();
}

    private static String readFileAsString(String cworkspacefilesmyfiletxt) {
//To change body of generated methods, choose Tools | Templates.
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }


}
    

