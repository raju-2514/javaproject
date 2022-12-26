
package practice.java;

import java.util.ArrayList;

public class generics_code {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList();
        arraylist.add(54);
        arraylist.add(644);
        
        int a=arraylist.get(1);
        System.out.println(a);
        
    }
    
}
