import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int temp=n,c=0,t=n,sum=0,d;
      while(n>0)
      {
        n=n/10;
        c++;
      }
     // System.out.println(c);
      while(t>0)
      {
        d=t%10;
        sum=sum+(int)Math.pow(d,c);
        t=t/10;
      }
      if(sum==temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
      
	}
}