import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     int  n1=n%10;
      int n2=n/100;
      int out=n1+n2;
      System.out.println(out);
      //System.out.println(n2);
	}
}