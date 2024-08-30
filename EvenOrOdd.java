
package week_1;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num=s.nextInt();
        if(num%2==0){
            System.out.print("Entered nummber is even number; "+num);
        }
        else {
            System.out.print("Entered nummber is odd number; "+num);
        }
        System.out.println();
    }
    
}
