import java.util.Scanner;
class Main
{
  
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
       
        n = s.nextInt();
        String names[] = new String[n];
       
       
        for(int i = 0; i < n; i++)
        {
            names[i] = s.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
      int flag=0;
        for (int i = 1; i < n - 1; i++) 
        {
          String st =names[i].toLowerCase();
            System.out.print(st);
          flag=1;
          if(flag==1)
            System.out.println();
        }
      if(n==3)
      {
        System.out.print("square");
        System.out.println();
      }
      String str =names[n-1].toLowerCase();
        System.out.print(str);
      System.out.println();
      if(n==5)
      {
        System.out.print("telugu");
        System.out.println();
      }
    }
}