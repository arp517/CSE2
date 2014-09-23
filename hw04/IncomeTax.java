//////////////////
// Anna Putelo
// CSE2
// HW04
//
// write a program that prompts the user to 
// enter an int that gives the thousands of
// dollars of income and writes out the 
// amount of tax.

import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {

// inputs
Scanner myScanner;
myScanner = new Scanner (System.in);
System.out.print("Enter the int giving the number of thousands (an integer > 0): ");
int number = myScanner.nextInt();

int taxTotal=0;

// if statements.  Reads number, converts to thousands of dollars, finds appropriate tax and performs multiplication.  Prints.

if (number >= 0 && number<20){   
    number*=1000;
    taxTotal= (5*number)/100;
    System.out.print("The tax rate on $"+ number + " is 5.0 percent and the tax is $"+taxTotal+".0 \n");
    
}
 
else if (number >=20 && number<40){
    number*=1000;
    taxTotal= (number*7)/100;
    System.out.print("The tax rate on $" + number + " is 7.0 percent and the tax is $"+taxTotal+".0 \n");
}

else if (number >=40 && number<78){
    number*=1000;
    taxTotal= (12*number)/100;
    System.out.print("The tax rate on $" + number + " is 12.0 percent and the tax is $"+taxTotal+".0 \n");
   
}
else if (number >=78){
    number*=1000;
    taxTotal= (14*number)/100;
    System.out.print("The tax rate on $" + number + " is 14.0 percent and the tax is $"+taxTotal+".0 \n");
}   
else if (number < 0){

    System.out.print("  you did not enter a positive int \n");

}


} //end method
} //end class
