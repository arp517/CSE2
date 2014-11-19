///////////////
// Anna Putelo
// CSE2
// HW10


import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }


public static void showHands(){

int[] deck=new int[52];
for(int i=0; i<deck.length; i++){
    deck[i] = i;
}//end for

int[] hand=new int[5];
for(int i=0; i<hand.length; i++){
    hand[i]=-1;
}//end for



int ds = 51;
for(int i=0; i<hand.length; i++){
int a = (int)(Math.random() * ds);

//swap
hand[i] = deck[a];
deck[a] = deck[ds];
deck[ds] = -1;
ds--;

}//end for

String[] card=new String[5];
for(int i = 0; i<hand.length; i++){
    int j = hand[i]%13;
    switch (j){
        case 0:
                card[i] = "A";
                break;
        case 1:
             card[i] = "K";
                break;
        case 2:
            card[i] = "Q";
                break;
        case 3:
            card[i] = "J";
                break;
        case 4:
            card[i] = "10";
                break;
        case 5:
            card[i] = "9";
                break;
        case 6:
            card[i] = "8";
                break;
        case 7:
            card[i] = "7";
                break;
        case 8:
            card[i] = "6";
                break;
        case 9:
            card[i] = "5";
                break;
        case 10:
            card[i] = "4";
                break;
        case 11:
            card[i] = "3";
                break;
        case 12:
            card[i] = "2";
                break;
        case 13:
            card[i] = "1";
                break;   
    }//end switch
    
}//end for

String[] suits = {"clubs", "diamonds", "hearts", "spades"};

int m=0;

for(int j=0;j<4;j++){
    
    System.out.print(suits[j] + ":");
    for(int k=0;k<5;k++){
        if((hand[k]/13) == m){
            System.out.print(card[k]+" ");
            
        }//end if
       
    }//end for
     System.out.println();
    m++;
}//end for

}//end method


public static void simulateOdds(int hand[]){


//create deck    
int[] deck=new int[52];
for(int i=0; i<deck.length; i++){
    deck[i] = i;
}//end for

//set up five cards for hand
int[] hand=new int[5];
for(int i=0; i<hand.length; i++){
    hand[i]=-1;
}//end for

for (int t=0; t<10001; t++){

int ds = 51;
for(int i=0; i<hand.length; i++){
int a = (int)(Math.random() * ds);

//swap
hand[i] = deck[a];
deck[a] = deck[ds];
deck[ds] = -1;
ds--;

}//end for

String[] card=new String[5];
for(int i = 0; i<hand.length; i++){
    int j = hand[i]%13;
    switch (j){
        case 0:
                card[i] = "A";
                break;
        case 1:
             card[i] = "K";
                break;
        case 2:
            card[i] = "Q";
                break;
        case 3:
            card[i] = "J";
                break;
        case 4:
            card[i] = "10";
                break;
        case 5:
            card[i] = "9";
                break;
        case 6:
            card[i] = "8";
                break;
        case 7:
            card[i] = "7";
                break;
        case 8:
            card[i] = "6";
                break;
        case 9:
            card[i] = "5";
                break;
        case 10:
            card[i] = "4";
                break;
        case 11:
            card[i] = "3";
                break;
        case 12:
            card[i] = "2";
                break;
        case 13:
            card[i] = "1";
                break;   
    }//end switch
    
}//end for    



//previous code altered for specific program

    int z=0;
    
    for(int i=0; i<hand.length; i++){
        
        int x = hand[i];
        
        
        for(int j=i+1 ; j<hand.length; j++){
            if(x==hand[j]){
                z++;
            }//end if
            
        }//end for
    
    }//end for
    
    if(z>1 || z==0){
     break;
    }//end if
    


}//end for 10000    
    
    
}//end method

}//end class
