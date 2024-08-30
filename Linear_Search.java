
package week_1;
import java.util.Scanner;
        public class Linear_Search {
            public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
                System.out.print("Enter the size of an array: ");
                int n=s.nextInt();
                int[] arr=new int[n];
                System.out.print("Enter the elements of an array: ");
                for (int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }
                System.out.println("Entered elements of an array: ");
                for(int i=0;i<n;i++){
                    System.out.print(arr[i] +" | ");
                }
                System.out.println();
                System.out.print("Enter the element you want to search: ");
                int val=s.nextInt();
                for (int i=0;i<n;i++){
                    if (arr[i]==val){
                        System.out.print("Element found at index:  "+i);
                    }
                }
                System.out.println();
            }
    
}
