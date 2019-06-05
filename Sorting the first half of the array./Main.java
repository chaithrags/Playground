import java.util.Scanner;
import java.util.Arrays;

class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    int l=n/2;
    int t[]=new int[l];
    for(int i=0;i<l;i++)
      t[i]=a[i];
    Arrays.sort(t);
    for(int i=0;i<l;i++)
      System.out.print(t[i]+" ");
    for(int i=l;i<n;i++)
      System.out.print(a[i]+" ");
  }
}