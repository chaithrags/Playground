import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
      String sub=scan.nextLine();
      String inc=scan.nextLine();
      //StringBuilder sb=new StringBuilder(str);
     String rep=str.replace(sub,inc);
      System.out.print(rep);
    }
}