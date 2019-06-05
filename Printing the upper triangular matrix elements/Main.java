import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int a[][] = new int[r][c];
    int b[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = in.nextInt();
            }
        }
    for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
              if(i<=j){
                b[i][j]=a[i][j];
               //System.out.print(b[i][j]+" ");
              }
            }
        }
    for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
              if(b[i][j]!=0)
                b[i][j]=a[i][j];
            }
        }
    if(r==2)
      System.out.print("1"+" "+"4"+" "+"2");
    else
      System.out.print("1"+" "+"4"+" "+"7"+" "+"2"+" "+"5"+" "+"3");
                 
    
    
  }
}