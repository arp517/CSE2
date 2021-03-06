/////////////////////
// Anna Putelo
// CSE2
// September 12th, 2014
//
// Calculate the cost of Big Macs including tax using the scanner

import java.util.Scanner;

public class BigMac {
    public static void main(String[] args){
        
Scanner myScanner;
myScanner = new Scanner( System.in);
System.out.print("Enter the number of Big Macs (an integer > 0): ");

int nBigMacs=myScanner.nextInt();

System.out.print("Enter the cost per Big Mac as"+ "a double (in the form xx.xx): ");
double bigMac$ = myScanner.nextDouble();
System.out.print(
    "Enter the percent tax as a whole number (xx): ");
double taxRate = myScanner.nextDouble();
taxRate/=100; //user enters percent, looking for proportion

//print out the output from given input
double cost$;
int dollars, dimes, pennies;
cost$ = nBigMacs*bigMac$*(1+taxRate);

//get the whole amount, dropping decimal fraction
dollars=(int)cost$;

//get dimes amount
dimes=(int)(cost$*10)%10;
pennies=(int)(cost$*100)%10;

//print
System.out.println("The total cost of" +nBigMacs+" BigMacs, at $" +bigMac$ +" per bigMac, with a" +" sales tax of "+ (int) (taxRate*100) + "%, is $"+dollars+'.' + dimes+pennies);

        
        
        
    } //end of main method
} //end of class
