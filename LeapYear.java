
package week_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
         Scanner s=new Scanner (System.in);
        System.out.print("Enter year: ");
        int year=s.nextInt();
        if(year%4==0 && (year%100!=0 || year%400==0) ){
            System.out.print("Entered year is leap year: "+year);
        }
        else {
            System.out.print("Entered year is not leap year: "+year);
        }
        System.out.println();
    }
    
}
