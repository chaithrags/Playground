import java.util.Scanner;
class Main{
  public static void pair(int a[],int n,int sum)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
        if(a[i]+a[j]==sum)
          System.out.println(a[i]+","+" "+a[j]);
    }
  }
  
        
  
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
    a[i]=s.nextInt();
  }
  int sum=s.nextInt();
  pair(a,n,sum);
      // Type your code here
    }
}