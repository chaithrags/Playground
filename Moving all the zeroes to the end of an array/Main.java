import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<=(n-1);i++)
      {
        a[i]=s.nextInt();
      }
      int k=0;
      for(int i=0;i<=(n-1);i++)
      {
        if(a[i]!=0)
        {
          b[k]=a[i];
          k++;
        }
      }
      for(int l=0;l<=(k-1);l++)
        System.out.print(b[l]+" ");
      for(int m=(k+1);m<=(n-1);m++)
        System.out.print("0" +" ");
      System.out.print("0");
      
    }
}