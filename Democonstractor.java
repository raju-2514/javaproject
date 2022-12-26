
package sceond;


public class Democonstractor {
    
    int id;
    String name;
    Democonstractor(int i,String n)
            {
            id=i;
            name=n;
            
            }
    
    Democonstractor(){}
    void display()
    {
        System.out.println(id+" "+name);
    }
    
    public static void main(String[] args) {
        
        Democonstractor d1=new Democonstractor(154,"Raju biswas");
        Democonstractor d2=new Democonstractor();
        d2.id=d1.id;
        d2.name=d1.name;
        
        d1.display();
        d2.display();
        
    }
    
}
