//////////
// Anna Putelo
// lab 04
// big macs again

import java.util.Scanner;
public class BigMacAgain{
	public static void main(String[] args) {

// inputs
Scanner myScanner;
myScanner = new Scanner (System.in);
System.out.print("Enter the number of Big Macs (an integer > 0): ");

// if statements
if(myScanner.hasNextInt () ){
 
 	int nBigMacs=myScanner.nextInt ();
 	double cost$;
 	double costPer=2.22;
    
    cost$=(double)costPer*nBigMacs;
    
    //print statement
    System.out.println("You ordered "+ nBigMacs +" Big Macs for a cost of "+nBigMacs+" x $2.22 = $"+cost$ );

System.out.print("do you want fries? (Y,N,y,n) ");
String Answer = myScanner.next();

	if ((Answer.equals("Y")) || (Answer.equals("y"))){
		System.out.println(" you ordered fries at a cost of $2.15");
	
	double newTotal;
	newTotal=(cost$+2.15);
		System.out.println(" the total cost of the meal is $"+ newTotal);
	}
	else{
		System.out.println(" the total cost of the meal is $"+ cost$);
	}

}
else{
	System.out.println("you did not enter an int");
	return;	//leave 

}
}  //end method
} //end class
