import java.util.Scanner;
class Main {
    public static void main(String args[])
  {
    // your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int res=sum(n);
    System.out.print(res);
  }
  public static int sum(int n)
  {
    if(n!=0)
    {
       return n+sum(n-1);
    }
     
    else{
       return n;
    }
     
  }
}