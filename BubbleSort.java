
package week3;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            System.out.println("Enter size of array: ");
            int n=s.nextInt();
            
            int [] array=new int[n];
            System.out.println("Enter elements of an array: ");
            for(int i=0;i<n;i++){
                array[i]=s.nextInt();
            }
            
            for(int i=0;i<n;i++){
                for (int j=1;j<n-i;j++){
                    if(array[j-1]>array[j]){
                        int temp=array[j-1];
                        array[j-1]=array[j];
                        array[j]=temp;
                    }
                }
                
            }
            System.out.println();
                    for(int i=0;i<n;i++){
                        System.out.print(array[i]+" | ");
                    }
    }
    
}
