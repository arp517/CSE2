//////////////////
// Anna Putelo
// CSE2
// lab05
//
// write a program that uses Scanner to have the
// user pick a game and print appropriate output

import java.util.Scanner;
import java.util.Random;
public class RandomGames {
    public static void main(String[] args) {
        
Scanner myScanner;
myScanner = new Scanner (System.in);
System.out.print("Enter the game which you wish to play ");
String game = myScanner.next();
int roulette=(int)(Math.random() * 38);

if ((game.equals("R")) || (game.equals("r"))){
    
    System.out.println("Routlette: "+roulette);
}


if ((game.equals("C")) || (game.equals("c"))){
    int a=(int)(Math.random() * 9);
    int b=(int)(Math.random() * 9);
    int c=a+b;
    System.out.println("Craps: "+a+ "+"+b+"= "+c);
}

if ((game.equals("P")) || (game.equals("p"))){
    int d = (int)(Math.random() * 9);
    System.out.println("Pick: "+d+" of hearts");
    
}


else{
	System.out.println("error");
	return;	//leave 
}

}  //end method
} //end class
		
		
