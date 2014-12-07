///////////////
// Anna Putelo
// HW11



import java.util.Scanner;
public class PokerHands{
    public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    
    for (int i=0; i<5; i++){
    System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
    String a = scan.next();
    System.out.println("Enter the suit: 'c', 'd', 'h', or 's'");
    String b = scan.next();
    }//end for
    
    int[] deck=new int[52];
    for(int i=0; i<deck.length; i++){
    deck[i] = i;
    }//end for
    
        
    }//end main
    
    
    public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }

}//end class
