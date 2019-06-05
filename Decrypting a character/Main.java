import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      char c=s.next().charAt(0);
      int k=s.nextInt();
      if(c=='c')
      {
        //char m='z';
        System.out.print("z ");
        return;
      }
      else if (c>='a' && c<='z')
      {
        int o=c+'a';
        o=(o-k)%26;
        c=(char)(o+'a');
      }
      else if(c>='A' && c<='Z')
      {
        int o=c+'A';
        o=(o-k)%26;
        c=(char)(o+'A');
      }
      System.out.print(c);
    }
}