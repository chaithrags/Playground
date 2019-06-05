import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String words[]=str.split("\\s");
    String revword="";
    for(String w:words)
    {
      StringBuilder sb=new StringBuilder(w);
      sb.reverse();
      revword+=sb.toString()+" ";
    }
    System.out.print(revword.trim());
  }
}