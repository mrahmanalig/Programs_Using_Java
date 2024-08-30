
package week_1;
import java.util.Scanner;
public class Simple_Calculator {

    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter  first  number:  ");
            int num1=s.nextInt();
            System.out.print("Enter second number:  ");
            int num2=s.nextInt();
            // simple calculator using switch cases for operation
           System.out.print("Enter your operation code: ");
           int choice=s.nextInt();
           switch(choice){
               case 1 -> System.out.print("Addition of two numbers: "+(num1+num2));
                   case 2 -> System.out.print("Subtraction of two numbers: "+(num1-num2));
                   case 3 -> System.out.print("Multiplication of two numbers: "+(num1*num2));
                   case 4 -> System.out.print("Division of two numbers: "+(num1/num2));
                   case 5 -> System.out.print("Invalid operation!!");
               }
           System.out.println();
          }
}
