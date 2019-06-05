import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      StringBuilder sb=new StringBuilder(str);
      String st[]=str.split(" ");
      String ans=" "; 
      for(int i=st.length-1;i>=0;i--){
        ans+=st[i]+" ";
      }
      String ak=ans.substring(0,ans.length()-1);
      System.out.print(ak.substring(1));
    }
    // Function to reverse a string
    
}