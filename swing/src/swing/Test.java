
package swing;

import java.io.*;
public class Test {
    public static void main(String args[]){
 StringBuffer s = new StringBuffer("Geeks");
        s.append("OOP");
s.insert(5, "for");
System.out.println(s);
s.insert(0, 5);
System.out.println(s);
s.insert(3, true);
System.out.println(s);
s.insert(5, 41.35);
System.out.println(s);
s.delete(0, 5);
System.out.println(s);
    
}
}