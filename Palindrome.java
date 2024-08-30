
package week_1;
import java.util.Scanner;
public class Palindrome {
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num=s.nextInt();
            int reverse=0;
            int original=num;
            while(num!=0){
                int remainder=num%10;
                reverse=(reverse*10)+remainder;
                num/=10;
            }
            if(reverse==original){
                System.out.println("Entered number is Palindrome ");
            }
            else {
                System.out.println("Entered number is not a palindrome");
            }
           
    }
    
}
