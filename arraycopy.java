
package sceond;


public class arraycopy {
    
    public static void main(String[] args) {
        int arr[]={1,2,5,47,25,52,54};
        int i;
         int arr2[] = new int[arr.length];    
        
        for(i=0;i<arr.length;i++)
        {
        arr2[i]=arr[i];
        }
        
        for(i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);   
        }
        System.out.println();
        for(i=0;i<arr2.length;i++)
        {
            System.out.print(" "+arr2[i]);   
        }
        
        System.out.println("");
        
    }  
    
}
