import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
     int c=n-1;
      for(int k=1;k<=n;k++)
      {
        for(int i=1;i<=c;i++)
        {
          System.out.print(" ");
        }
        c--;
        for(int i=1;i<=(2*k-1);i++)
          System.out.print("*");
        System.out.println();
      }
        
	}
}