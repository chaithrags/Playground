import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=s.nextInt();
      int a[]=new int[n];
      int t[]=new int[k];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int j=0;
     
      for(int i=1;i<=k;i++)
      {
        t[j]=i;
        j++;
      }
      for(int i=0;i<k;i++)
      {
        int count=0;
        for(j=0;j<n;j++)
        {
          if(t[i]==a[j])
          {
            count++;
          }
          
        }
        System.out.println((i+1)+" "+count);
        
      }
      
    }
}