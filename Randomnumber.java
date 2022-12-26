
package sceond;

import java.util.Random;

public class Randomnumber {
    public static void main(String[] args) {
        System.out.println("1st ramsom nmumber"+Math.random());
        System.out.println("2nd ramdom Number "+Math.random());
        
        int min=200;
        int max=400;
        //genarate the daoble value
        System.out.println("Random value of double type between "+min+" to "+max);
        double a=Math.random()*(max-min+1)+min;
        System.out.println(a);
        
        //genarate the int value
        System.out.println("Random value of int between "+min+" to "+max);
        int b=(int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
        
        Random random=new Random();
        //for intiger value
        System.out.println("Integer number generate");
        int x=random.nextInt(50);//0-49
        int y=random.nextInt(1000);//0-999
        
        System.out.println(x);
        System.out.println(y);
        
        //fot the double value 
        System.out.println("Double number generate");
        double d1=random.nextDouble();
        double d2=random.nextDouble();
        
        System.out.println(d1);
        System.out.println(d2);
        
        
    }
    
}
