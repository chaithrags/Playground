import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      
	 // Type your code here  
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int res=square(n);
      System.out.println(res);
      
	}
  static int square  (int m)
  {
    int k=m*m;
    return k;
  }
}