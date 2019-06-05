import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int n=s.nextInt();
     int sl=0 ,l=0,temp=n,c=0;
      while(temp!=0)
      {
        temp=temp/10;
        c++;
      }
      for(int i=0;i<c;i++)
      {
        sl=l;
        l=n%10;
        n=n/10;
      }
      System.out.println(sl);
      
                    
	}
}