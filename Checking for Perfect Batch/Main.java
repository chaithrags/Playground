import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    int l=n/3;
    int d[]=new int[l];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    int k=0;
    for(int i=0;i<n;i=i+3)
    {
      int sum=0;
      for(int j=i;j<(i+3);j++)
      {
        sum=sum+a[j];
        //d[k]=sum;
      }
      d[k]=sum;
      k++;
    }
    int c=d[0];
    int flag=1;
    for(int i=0;i<l;i++)
    {
      if(d[i]!=c)
      {
        flag=0;
        break;
      }
    }
    if(flag==0)
      System.out.print("Not a Perfect Batch");
    else
      System.out.print("Perfect Batch");
     
  }
}