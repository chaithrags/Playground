import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class Main{
  public static int kthlargest(int [] arr,  int k,int n)  
                                         
    { 
        // Sort the given array 
        Arrays.sort(arr); 
  
        // Return k'th element in  
        // the sorted array 
    int t[]=new int[n];
    int j=0;
    for(int i=n-1;i>=0;i--)
    {
      t[i]=arr[j];
      j++;
    }
        return t[k-1]; 
    }  
    public static void main(String args[])
    {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int k=s.nextInt();
      System.out.print( kthlargest(a,k,n));
    }   
}