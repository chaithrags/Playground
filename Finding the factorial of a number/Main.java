import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int res=fact(n);
    System.out.print(res);
  }
  public static int fact(int n)
  {
    if(n>=1)
    {
       return n*fact(n-1);
    }
     
    else{
       return 1;
    }
     
  }
}