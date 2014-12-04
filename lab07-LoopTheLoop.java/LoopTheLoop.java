//////////////
// Anna Putelo
// CSE2
// lab07


import java.util.Scanner;
public class LoopTheLoop{
    public static void main(String[] args){
    
    Scanner scan=new Scanner(System.in);
    
    int nStars = 10;
    int j=0;
   
    while(true){
        
        
    System.out.println("enter an int between 1 and 15- ");
    int val = scan.nextInt();    
     
   
   // if(scan.hasNextInt()){
    
        for (int i=0; i<val; i++){    
            for (j=0;j<nStars; j++){
                if (j<=i){
                    System.out.print(" *");
                }//end if
                else{
                    System.out.print(" ");
                }//end else
                
            }//end for
            System.out.println();
        }//end for
  //  }//end if
        
        
    
        
     System.out.println(" again? ");
    String answer = scan.next();
    if ((!answer.equals("Y")) && (!answer.equals("y"))){
        break;
    }//end if   
        
    }//end while   
    
   
        
    }//end method  

}//end class
