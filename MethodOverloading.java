
package sceond;


public class MethodOverloading {
    
    int a,b,c;
    
    static int add(int a,int b)
    {
        return a+b;
    }
    
    static int add(int a,int b,int c)
    {
    return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("The result of ="+MethodOverloading.add(12, 150));
        System.out.println("The sum of a,b,c ="+MethodOverloading.add(45, 150, 480));
        
    }
    
}
