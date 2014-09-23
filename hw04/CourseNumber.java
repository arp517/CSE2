//////////////////
// Anna Putelo
// CSE2
// HW04
//
// write a program that prompts the user to 
// enter a six digit int that gives the 
// identification of a Lehigh Course by
// year and semester. 

import java.util.Scanner;
public class CourseNumber {
    public static void main(String[] args) {

// inputs
Scanner myScanner;
myScanner = new Scanner (System.in);
System.out.print("Enter the six digit ID number (int between 186510-201440): ");
int number = myScanner.nextInt();

// get digits
int courseDigit6 = (number % 10);
int courseDigit5 = ((number/10) % 10);
int courseDigit4 = ((number/100) % 10);
int courseDigit3 = ((number/1000) % 10);
int courseDigit2 = ((number/10000) % 10);
int courseDigit1 = ((number/100000) % 10);

// if statements. appropriate print statements. will generate an error.

if (number<186510 || number>201440){
    System.out.print("  The number was outside the range  \n");
}

if (courseDigit6 != 0){
    System.out.print("  "+courseDigit5+courseDigit6+"  is not a legitimate semester  \n");
}

if (courseDigit5<1 || courseDigit5>4){
    System.out.print("  error  \n");
}




// if statements. appopriate print statements. will not generate an error.

if (number>186510 && number<201440 && courseDigit6==0 && courseDigit5>=1 && courseDigit5<=4){
    
    
    
    if (courseDigit5 == 1){
        System.out.print("  the course was offered in the Spring semester of "+courseDigit1+courseDigit2+courseDigit3+courseDigit4+"  \n");
    }
    if (courseDigit5 == 2){
        System.out.print("  the course was offered in the Summer 1 semester of "+courseDigit1+courseDigit2+courseDigit3+courseDigit4+"  \n");
    }
    
    if (courseDigit5 == 3){
        System.out.print("  the course was offered in the Summer 2 semester of "+courseDigit1+courseDigit2+courseDigit3+courseDigit4+"  \n");
    }
    
    if (courseDigit5 == 4){
        System.out.print("  the course was offered in the Fall semester of "+courseDigit1+courseDigit2+courseDigit3+courseDigit4+"  \n");
    }
    
}



} //end method
} //end class
