
package sceond;


public class Thisconstractor {
    
    int a;
    String name,course;
    float fee;
    
    
    Thisconstractor(int a,String name,String course)
    {
    this.a=a;
    this.name=name;
    this.course=course;
    
    }
    
    Thisconstractor(int a,String name,String course,float fee)
    {
    this( a ,name,course);
    this.fee=fee;
    }
    
    void display()
    {
        System.out.println(a+" "+name+" "+course+" "+fee);
    }
    public static void main(String[] args) {
        Thisconstractor b=new Thisconstractor(122,"raju","Java");
        Thisconstractor c=new Thisconstractor(12,"Dola","Java",120f);
        b.display();
        c.display();
    }
    
}
