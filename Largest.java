
package week_1;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1=s.nextInt();
            System.out.print("Enter second number: ");
            int num2=s.nextInt();
            System.out.print("Enter third number: ");
            int num3=s.nextInt();
             
            if(num1>num2 && num1>num3 ){
                System.out.print("First number is largest: "+num1);
            }
            else if(num2>num1 && num2>num3){
                System.out.print("Second number is largest: "+num2);
            }
            else{
                System.out.print("Third number is largest: "+num3);
            }
            System.out.println();
    }
    
}
