import java.util.Scanner;
class Main{
  public static int count(String su,String str)
  {
    int m=su.length();
    int n=str.length();
    int res=0;
    //int j;
    for(int i=0;i<=(n-m);i++)
    {
      int j;
      for( j=0;j<m;j++)
      {
        if(str.charAt(i+j)!=su.charAt(j))
        {
        break;
        }
      }
    
    if(j==m)
    {
      res++;
      j=0;
    }
    }
    return (res);
  }
  public static void main(String args[]) {
    // Type your code here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    String su=s.nextLine();
    System.out.print(count(su,str));
    
    
  } 
}