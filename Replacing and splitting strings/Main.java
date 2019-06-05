import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner s=new Scanner(System.in);
      String st1=s.nextLine();
      String st2=s.nextLine();
      StringBuffer sb1=new StringBuffer(st1);
      String[] arr=st2.split("\\s");
      for(String w:arr)
      {
        System.out.println(w);
      }
      
      
    }
}