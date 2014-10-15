//////////////////
// Anna Putelo
// CSE2
// HW04
//
// write a program that generates a random number
// and simulates a 100 spin roulette round 1000 times. 
// Output the results of wins and losses and profit.

import java.util.Random;
public class Roulette {
    public static void main(String[] args) {



//starting variable importation

int pick = (int)(Math.random() * 38);
int simulation=0;
int round = 0;
int wins=0;
int roundsWon=0;
int roundsLost=0;
int profit=0;




while(simulation<1000){



while(round<100){
    int spin=(int)(Math.random() * 38);
    
    if(spin==pick){
        
    wins++;
    
    }//end if
    
    
    
    round++;
    
}//end rounds


if(wins>=3){
    
roundsWon++;
profit+=(wins*36-100);    
    
}
else{
    
roundsLost++;
}




//restart outside scope
wins=0;
round=0;
simulation++;
}//end simulations


//print
System.out.println("you won "+roundsWon+" out of 1000 simulations" );
System.out.println("you lost "+roundsLost+" out of 1000 simulations");
System.out.println("your profit was $"+profit+".00 dollars");



}//end main
}//end class
