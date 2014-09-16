////////////////////
// Anna Putelo
// CSE2
// HW3
//
// Estimate the cube root and cubed value of an input


import java.util.Scanner;

//create class and method
public class Root{
    public static void main(String[] args){
        
//variable importation
Scanner myScanner;
myScanner = new Scanner( System.in);
System.out.print("Enter double ");
double nValue=myScanner.nextDouble();
        
//calculations
double guess1, guess2, guess3, guess4, guess5;


guess1=nValue/3;
guess2=((2*guess1*guess1*guess1+nValue)/(3*guess1*guess1));
guess3=((2*guess2*guess2*guess2+nValue)/(3*guess2*guess2));
guess4=((2*guess3*guess3*guess3+nValue)/(3*guess3*guess3));
guess5=((2*guess4*guess4*guess4+nValue)/(3*guess4*guess4));
        
double cube;

cube=(guess5*guess5*guess5);

//print statements
System.out.println ("The cube root is" + "  "+ guess5);
System.out.println ("The cubed root cubed is" + "  "+ cube);

        
        
    } //end main method
} //end main class
