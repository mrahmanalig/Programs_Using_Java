
package week3;
import java.util.Scanner;
public class Matrix_Multiplication {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st 2D array : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[][] arr1 = new int[a][b];
        System.out.println("Enter elements of 1st array: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
          for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr1[i][j]+"  ");
            }
              System.out.println();
          }
           System.out.println("Enter size of 2nd 2D array : ");
        int m = sc.nextInt();
        int n= sc.nextInt();
        
        int[][] arr2= new int[m][n];
        System.out.println("Enter elements of 2nd array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("");
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+"  ");
            }
              System.out.println();
          }
          System.out.println();
          
      int[][] arr3=new int[m][n];
       for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              arr3[i][j]=0;
              for(int k=0;k<n;k++){
                  arr3[i][j]+=arr1[i][k]*arr2[k][j];
              }
                System.out.print(arr3[i][j]+"    ");
            }
            System.out.println();
        }
    }
    
}
