import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int res=0,out=0;
      if(n1>n2)
        res=n1;
      else
        res=n2;
      if(res>n3)
        out=res;
      else
        out=n3;
      System.out.println(out);
	}
}