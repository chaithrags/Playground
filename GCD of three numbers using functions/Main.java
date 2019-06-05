import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int res1=gcdd(n1,n2);
      int res2=gcdd(res1,n3);
      System.out.println(res2);
	}
  public static int gcdd(int m,int n)
  {
    int min,g=0;
    if(m>n)
      min=n;
    else
      min=m;
    while(min>=1)
      {
      if(m%min==0 && n%min==0)
      {
        g=min;
        break;
        
      }
      else
        min--;
      
     }
    return (g);
  }
}