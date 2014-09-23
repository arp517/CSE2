//////////////////
// Anna Putelo
// CSE2
// HW04
//
// write a program that prompts the user to 
// enter a positive int that represents the number of
// months to determine the number of days

import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        
// inputs
Scanner myScanner;
myScanner = new Scanner (System.in);
System.out.print("Enter an int giving the number of the month (1-12):  ");
int number = myScanner.nextInt();

// if statements (nested) and appropriate print statements
if (number>=1 && number<=12);{
    
    if (number==1 || number==3 || number==5 || number==7 || number==8 || number==10 || number==12){
        System.out.print("  The month has 31 days  \n");
    }
    if (number==4 || number==6 || number==6 || number==11){
        System.out.print("  The month has 30 days  \n");
    }
    if(number==2){
        System.out.print("  Enter the year  ");
        int year = myScanner.nextInt();
        boolean isLeapYear = ((year/4) == 0);
        
        if (isLeapYear){
        System.out.print("  The month has 29 days  \n");
        }
        
        if (!(isLeapYear)){
            System.out.print("  The month has 28 days  \n");
        }
        
    }
else if(number<1 || number>12){
    System.out.println("You did not enter a valid int");
}  
}

} //end method
} //end class
