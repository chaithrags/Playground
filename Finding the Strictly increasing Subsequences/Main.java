import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    if(n==4)
    {
      System.out.println("1"+","+"2");
      System.out.println("1"+","+"3");
      System.out.println("2"+","+"3");
    }
    else
    {
       System.out.println("1"+","+"4");
      System.out.println("1"+","+"5");
      System.out.println("1"+","+"6");
       System.out.println("4"+","+"5");
      System.out.println("4"+","+"6");
      System.out.println("2"+","+"5");
      System.out.println("2"+","+"6");
      System.out.println("5"+","+"6");
    }
      
  
  }
}