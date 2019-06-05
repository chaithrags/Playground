import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      int temp[]=new int[n]; 
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
       
      }
      int j=0;
      for(int i=1;i<=n;i++)
      {
        temp[j]=i;
        j++;
      }
        
      for(int i=0;i<n;i++)
      {
      int flag=0;
        for(j=0;j<n;j++)
        {
          if(a[j]==temp[i])
          { 
            flag=1;
          break;
          }
          
        }
        if(flag==0)
          {
            System.out.print(temp[i]);
         
          }
      }
      
    }
}