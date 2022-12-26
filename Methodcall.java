
package sceond;


public class Methodcall {
    int i;
    String name;
    void inserterecord(int a,String b)
    {
    i=a;
    name=b;
    }
    void display()
    {System.out.println(i+" "+name);}
        
}

class method2{
    public static void main(String[] args) {
       
        Methodcall m1=new Methodcall(),
                m2=new Methodcall();
          
               
                m1.inserterecord(12, "rerswe");   
                m1.display();  
                
                m2.inserterecord(12, "Raju sheikh");
                m2.display();
              
                
        
    }

}