import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      //int k=n;
      for(int i=n;i>=1;i--)
      {
         //int r=k;
        for(int j=i;j>=1;j--)
        {
        
          System.out.print(j);
          //r--;
            
        }
        System.out.println();
       // k=n-1;
      }
	}
}