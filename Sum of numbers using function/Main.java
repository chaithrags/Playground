import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int res=sum(n);
      System.out.println(res);
      
	}
  static int sum(int m)
  {
    int k=0;
    for(int i=1;i<=m;i++)
    {
      k=k+i;
     }
    return k;
  }
	
}