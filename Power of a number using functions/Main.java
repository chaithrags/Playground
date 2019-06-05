//import java.util.Scanner;
import java.util.Scanner;
class Main
{
   public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int k=power(n,m);
    System.out.println(k);
  }
  public static int power(int base,int exp)
  {
    int r;
    r=(int) Math.pow(base,exp);
    return r;
  }
 
}