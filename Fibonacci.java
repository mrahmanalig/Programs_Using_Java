
package week_1;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Enter number of terms: ");
        int num= s.nextInt();
        int term1=0, term2=1,nextTerm;
        System.out.println("Fibonacci series upto n terms: ");
        for (int i=1;i<=num;++i){
            System.out.print(term1);
            nextTerm=term1 + term2;
            term1=term2;
            term2=nextTerm;
        }
        System.out.println(" ");
    }
    
}
