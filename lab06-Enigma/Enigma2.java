////////////////
// Anna Putelo
// Enigma 2
// lab06



import java.util.Scanner;
public class Enigma2{
  public static void main (String [] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/* Error Report
 * 
 * divide by 0 issue resolved
 * 
 */
