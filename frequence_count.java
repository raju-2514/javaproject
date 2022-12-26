
package sceond;


public class frequence_count {
    public static void main(String[] args) {
        int arr[]={1,4,4,4,5,1,4,7,7,8,4,1,5,6,98,45,54,44};
       int count=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]==arr[j])
             {
              count++;
              }
            }
        
        }
          System.out.println("---------------------------------------");  
        System.out.println("    Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < arr.length; i++){  
            //if(arr[i] != arr[]j)  
                System.out.println("    " + arr[i] + "    |    " + arr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }
    
}
