import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
       Scanner s= new Scanner(System.in);
      int n=s.nextInt();
      //int sp=n-1;
      int c=1;
      for(int i=0;i<n;i++)
      {
        for(int j=n-i;j>1;j--)
        {
          System.out.print(" ");
        }
        for(int k=0;k<=i;k++)
        {
          System.out.print(c+" ");
          c++;
        }
        System.out.println();
       // sp--;
        
      }
        
    }    
}