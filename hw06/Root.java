//////////////////
// Anna Putelo
// CSE2
// HW06
//
// write a program that finds the square
// root of a number using low, middle, high
// values and square calculations

import java.util.Scanner;
import java.lang.Math;

public class Root {
    public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner(System.in);
        
System.out.println("enter a double greater than zero: ");
double val = myScanner.nextDouble();
double low=0;
double high=(1+val);
double middle=(low+high)/2;
double tolerance=0.0000001;



while(Math.abs(((middle*middle)-val))>tolerance){
    
    if((middle*middle)>val){
        high=middle;
    }//end if
    else{
        low=middle;
    }//end else
    
//set new middle in scope
middle=(low+high)/2;
    
}//end while


//print final middle
System.out.println("The square root is "+ middle);

}//end main
}//end class
