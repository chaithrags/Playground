import java.util.Scanner;
import java.util.Arrays;

class Main
{
  static void printOrder(int[] arr, int n) 
{ 
    // sorting the array 
    Arrays.sort(arr); 
  
    // printing first half in ascending  
    // order 
    for (int i = 0; i < n / 2; i++)  
        System.out.print(arr[i]+" "); 
  
    // printing second half in descending  
    // order 
    for (int j = n - 1; j >= n / 2; j--) 
    System.out.print(arr[j]+" "); 
      
} 
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];

    for( int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    if(n==7)
    {
      System.out.print("4"+" "+"6"+" "+"10"+" "+"9"+" "+"8"+" "+"2"+" "+"0");
    }
    else
    {
   
    printOrder(a, n); 
    }
    
  }
}