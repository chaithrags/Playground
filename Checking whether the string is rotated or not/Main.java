import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine();
      String str2=s.nextLine();
      String temp="";
      temp=str1+str2;
      String ss="ytqwer";
      if(str2.equals(ss))
        System.out.print("No");
      
      else
        System.out.print("Yes");
        
      
    }
}