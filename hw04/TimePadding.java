//////////////////
// Anna Putelo
// CSE2
// HW04
//
// write a program that prompts the user to 
// enter a positive int that giving the number of
// seconds that have passed during the day and  
// displays the time.

import java.util.Scanner;
public class TimePadding {
    public static void main(String[] args) {
        
//inputs 
Scanner myScanner;
myScanner = new Scanner (System.in);
System.out.print("Enter the number of seconds that have passed in the day  \n");
int number = myScanner.nextInt();



//math
int hours = (number/3600);
int minutes = ((number % 3600)/60);
int seconds = (number % 60);



System.out.printf(" The time is " + hours + ":"+ minutes + ":"+seconds +"\n");

}//end method
}//end class
