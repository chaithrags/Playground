import java.util.Scanner;
public class Main
{
  static int getMaxLength(int arr[], int n) 
    { 
          
        int count = 0; 
        int result = 0; 
      
        for (int i = 0; i < n; i++) 
        { 
              
            
            if (arr[i] == 0) 
                count = 0; 
      
           
            else
            { 
                count++;
                result = Math.max(result, count); 
            } 
        } 
      
        return result; 
    } 
    public static void main(String args[])
    {
    	// type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      System.out.print(getMaxLength(a,n));
    }
}