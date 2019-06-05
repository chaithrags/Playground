import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner S = new Scanner(System.in);
      int n=S.nextInt();
      int d,sum=0;
      while(n>0)
      {
        d=n%10;
        sum=sum+d;
        n=n/10;
      }
      System.out.println(sum);
	}
}