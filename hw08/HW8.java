////////////////
// Anna Putelo
// HW08
// working with methods and forcing the
// user to enter good input.





import java.util.Scanner;
public class HW8{
  
  public static char getInput(Scanner scan, String p){
    while(true){  
      //check input
      if (scan.hasNext()){
      String answer = scan.next();
      
      if (answer.length()!=1){
          System.out.println(" error ");
      }//end if
      else{
        char answer2=answer.charAt(0);
      
      for (int i=0; i<p.length(); i++){
        if (answer2==p.charAt(i))
        return p.charAt(i);
        }//end if 
      }//end for
      
          System.out.println(" error ");
      
      } //end else
    
    }//end while
  }//end method
  
  public static char getInput(Scanner scan, String p, int r){
    int j=0;
    while(j<r){  
      //check input
      if (scan.hasNext()){
      String answer = scan.next();
      
      if (answer.length()!=1){
          System.out.println(" error ");
      }//end if
      else{
        char answer2=answer.charAt(0);
      
      for (int i=0; i<p.length(); i++){
        if (answer2==p.charAt(i))
        return p.charAt(i);
        }//end if 
      }//end for
      
          System.out.println(" error ");
      
      } //end else
    j++;
    }//end while
    System.out.println("you failed after "+r+" tries");
    return ' ';
  }//end method
  
  
  public static char getInput(Scanner scan, String p, String q){
     
     while(true){
     System.out.println(p);
     for(int i=0; i<q.length(); i++){
         System.out.println("'"+q.charAt(i)+"'");
     }//end for
     System.out.println(" enter a digit ");
      //check input
      if (scan.hasNext()){
      String answer = scan.next();
      
      if (answer.length()!=1){
          System.out.println(" error ");
      }//end if
      else{
        char answer2=answer.charAt(0);
      
      for (int i=0; i<q.length(); i++){
        if (answer2==q.charAt(i))
        return q.charAt(i);
        }//end if 
      }//end for
      
          System.out.println(" error ");
      
      } //end else
    
    }//end while 
  }//end method
  
  public static void main(String []arg){
      
char input;
Scanner scan=new Scanner(System.in);

System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
input=getInput(scan,"Cc");
System.out.println("You entered '"+input+"'");
System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
input=getInput(scan,"yYnN",5); //give up after 5 attempts
	
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
}
