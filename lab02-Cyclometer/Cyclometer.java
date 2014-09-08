////////////////////////////////////////////////////
// Anna Putelo
// CSE2
// September 5
// Cyclometer Lab

// Given time and rotation count, the program will
// print the minutes, counts, distance, for each trip

// Define a class
public class Cyclometer{
    
    public static void main (String[] args) {
    int secsTrip1=480; //time of first trip
    int secsTrip2=3200; //time of second trip
    int countsTrip1=1561; //counts of first trip
    int countsTrip2=9037; //counts of second trip
    
    double wheelDiameter=27.0, //
    PI=3.14159, //
    feetPerMile=5280, //
    inchesPerFoot=12, //
    secondsPerMinute=60; //
    double distanceTrip1, distanceTrip2, totalDistance; //
    
    System.out.println ("Trip 1 took " +
        (secsTrip1/secondsPerMinute)+ "minutes and had"+
        (countsTrip1)+ "counts.");
        
    System.out.println ("Trip 2 took" + 
        (secsTrip2/secondsPerMinute) + "minutes and had"+
        countsTrip2+ "counts.");
        
    distanceTrip1=countsTrip1*wheelDiameter*PI;  //distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile;
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip2+distanceTrip1;
    
    System.out.println ("Trip 1 was "+distanceTrip1+" miles");
    System.out.println ("Trip 2 was "+distanceTrip2+" miles");
    System.out.println ("The total distance was "+totalDistance+" miles");

        
} //end main method
} //end class