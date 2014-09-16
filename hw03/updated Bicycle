////////////////////
// Anna Putelo
// CSE2
// HW3
//
// Calculate and print the distance traveled and average MPH
// from inputs representing 'number of counts' and 'seconds'

import java.util.Scanner;

//declare a public class and method
public class Bicycle {
    public static void main(String[] args){


//variable importation
Scanner myScanner;
myScanner = new Scanner( System.in);
System.out.print("Enter the number of Seconds (an integer > 0): ");
int nSeconds=myScanner.nextInt();

System.out.print("Enter the number of counts ");
double nCounts = myScanner.nextDouble();



//given variables
double wheelDiameter=27.0, //
    PI=3.14159, //
    feetPerMile=5280, //
    inchesPerFoot=12, //
    secondsPerMinute=60, //
    minutesPerHour=60; //
    
//calculations
double distanceTrip;
distanceTrip=nCounts*wheelDiameter*PI;  //distance in inches
distanceTrip/=inchesPerFoot*feetPerMile; // distance in miles


double timeTrip;
timeTrip=nSeconds/secondsPerMinute;

double milesPerHour;
milesPerHour=(distanceTrip)/((timeTrip/minutesPerHour));

//print statements
System.out.println ("The distance was "+distanceTrip+" miles");
System.out.println ("The trip took "+timeTrip+" minutes");
System.out.println ("The average mph was "+distanceTrip+" ");


} 
}
