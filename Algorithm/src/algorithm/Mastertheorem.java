
package algorithm;

import static java.lang.Math.pow;
import java.util.Scanner;
import java.lang.Math; 
public class Mastertheorem {
    static double a,b,k,p;
    double c,c2;
    public void calculation(double a,double b,double k,double p)
    {
       // double c=Math.pow(b, a);
    
    if(Math.log(Math.pow(b, a))>k)
    {
        System.out.println("The complexity = O(n^"+Math.log(Math.pow(b, a))+")");
    }
    
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the value of a ,b ,k and p for T(n)=aT(n/b)+f(n) :");
        Scanner scan=new Scanner(System.in);
        System.out.print("a  =\n");
        a=scan.nextInt();
        System.out.print("b =\n");
        b=scan.nextInt();
        System.out.print("K =\n");
        k=scan.nextInt();
        System.out.print("P =\n");
        p=scan.nextInt();
        
        Mastertheorem obj=new Mastertheorem ();
        obj.calculation(a, b, k, p);
        
        
        
    }
    
}
