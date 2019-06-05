import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      printprime(n);
      
	}
  static boolean isprime(int n)
  {
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
  static void printprime(int n)
  {
    for(int i=2;i<=n;i++)
    {
      if(isprime(i))
         {
         System.out.println(i);
      }
    }
  }
}