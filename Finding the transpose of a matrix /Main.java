import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc = new Scanner(System.in);
 
         int i,j,row,col,sub=0;
    row = sc.nextInt();

 col = sc.nextInt();
 
 int[][] mat1 = new int[row][col];
 
 
    
     for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
          mat1[i][j] = sc.nextInt();
     }
 }
    for(i=0;i<row;i++)
     { 
      for(j=0;j<col;j++)
      { 
         System.out.print(mat1[j][i]+" ");
     }
      System.out.println();
 }
  }
}