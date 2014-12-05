///////////////////
//Anna Putelo
//Enigma 0
//lab06

    
    
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String [] args){
   
    Scanner scan=new Scanner(System.in);
    System.out.print("enter an int- ");
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
   int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }   //end the switch
  }

  
    else{
      int n=4;
      System.out.println("You entered "+n);
    }   //end the else
    
   
  } //end the main method
}  //end the class

/* Error Report
 * Braces with arg statement and moved scanner decleration 
 */
