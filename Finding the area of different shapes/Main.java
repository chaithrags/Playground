import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner s=new Scanner(System.in);
      int i=0;
      i=s.nextInt();
      switch(i)
      {
        case 1:int a=s.nextInt();
          int b=s.nextInt();
          System.out.print(a*b);
          break;
          case 2:int c=s.nextInt();
          int d=s.nextInt();
          System.out.print(c*d);
          break;
          case 3:int e=s.nextInt();
          int f=s.nextInt();
          float g=(float)0.5*e*f;
          System.out.print(g);
          break;
          case 4:
           int h=s.nextInt();
          double j=(double)3.14*h*h;
          System.out.print(j);
          break;
        default:
         System.out.print("Invalid");
          
      }
    }
}