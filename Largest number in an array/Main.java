import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int l=0;
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      l=a[0];
      for(int i=0;i<n;i++)
      {
        if(a[i]>l)
          l=a[i];
      }
      System.out.println(l);
    }
}