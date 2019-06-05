import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str,rev="";
      str=s.nextLine();
      int l=str.length();
      for(int i=l-1;i>=0;i--)
        rev=rev+str.charAt(i);
      if(str.equals(rev))
        System.out.println("Yes");
        else
          System.out.print("No");
        
    } 
}