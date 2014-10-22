/////////////////////////////////
// Anna Putelo
// hw07
// CSE2
//
// Write a program that prompts the user to enter a number
// between one and nine and print out stacks using different
// types of loops.

import java.util.Scanner;
public class NumberStack{
    public static void main(String[] arg){
    
Scanner myScanner;
myScanner = new Scanner(System.in);
        

System.out.print("Enter an int between one and nine: ");
int val = myScanner.nextInt();


//for

for(int j=1;j<=val;j++){
	    
		System.out.println(j);
		System.out.println('-');

}//end loop
	
  


//while
int j=1;
while(val<=9 && val>=1 && j<=val){
    System.out.println(j);
    System.out.println('-');
    j++;
}//end loop


//do while

do{
    System.out.println(j);
    System.out.println('-');
    j++;
}
while(val<=9 && val>=1 && j<=val);

}//end main
}//end class
