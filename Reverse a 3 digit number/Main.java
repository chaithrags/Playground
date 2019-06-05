import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int i,rev=0;
    for(i=0;i<3;i++)
    {
      int ln=n%10;
      rev=rev*10+ln;
      n=n/10;
      
      
    }
    System.out.println(rev);
  }
}