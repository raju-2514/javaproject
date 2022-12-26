
package sceond;


public class InstanceInitializerBlock {
    int speed;
    InstanceInitializerBlock ()
    {
        System.out.println("The Constractor is called");
    }
    
    {System.out.println("The instance initializer is called");}
    public static void main(String[] args) {
        InstanceInitializerBlock  b= new InstanceInitializerBlock ();
       InstanceInitializerBlock b1=new InstanceInitializerBlock ();
    }
    
}
