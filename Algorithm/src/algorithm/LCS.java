
package algorithm;

import java.util.Scanner;


public class LCS {
    int i,j;
    
    public int lcs(char[] A,char[] B)
    {
    
        int L[][]=new int [A.length+1][B.length+1];
        
        for( i=0;i<=A.length;i++)
        {
        for( j=0;j<=B.length;j++)
        {
        
             if (i == 0 || j == 0)
             {
              L[i][j] = 0;
             }
             
        else if (A[i-1] == B[j-1])
        {
         L[i][j] = L[i-1][j-1] + 1;
        }
           
            else
            {
         L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
           
            
        }
        
        }
        
     return L[A.length][B.length];
    
    }
    
  public int max(int a,int b)
    {
     
        return (a > b)? a : b;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter the string Scquence 1:");
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        char[] A=str1.toCharArray();
        System.out.println("Enter the String scquence 2:");
        String str2=scan.nextLine();
        char[] B=str2.toCharArray();
        
        LCS obj=new LCS();
        
        System.out.println("\nLength of LCS is" + " " +obj.lcs(A, B) );
                                  
        
    }
    
}
