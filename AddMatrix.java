import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of row of 1 matrix: ");
        int m=s.nextInt();
        System.out.println("Enter number of columns: ");
        int n=s.nextInt();
  int [][] arr1=new int[m][n];
        System.out.println("enter elements of 1 matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=s.nextInt();
            }
            System.out.println();
    }
        System.out.println("Entered matrix is: ");
           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+"  ");
            }
               System.out.println();
           }

       
            int [][] arr2=new int[m][n];
        System.out.println("Enter elements of 2matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=s.nextInt();
            }
            System.out.println();
    }
        System.out.println("Entered matrix is: ");
           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+"  ");
            }
               System.out.println();
           }
           int[][] sum=new int[m][n];
           System.out.println("Addition of matrices: ");
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sum[i][j] +"  ");
            }
               System.out.println();
           }
           
    }
}
