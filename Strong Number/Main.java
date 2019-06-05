import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=0,d,temp=n,k;
      for(int i=1;i<=3;i++)
      {
        d=n%10;
        k=fact(d);
        sum+=k;
        n=n/10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
        
	}
   static int fact(int m)
  {
    int f=1;
    for(int i=1;i<=m;i++)
    {
    f=f*i;
    }
    return (f);
  }
}