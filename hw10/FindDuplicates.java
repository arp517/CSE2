///////////////
// Anna Putelo
// CSE2
// HW10


import java.util.Scanner;
public class FindDuplicates{


public static boolean hasDups(int[] a){
    
    
    for(int i=0; i<a.length; i++){
        
        int x = a[i];
        
        
        
        for(int j=i+1 ; j<a.length; j++){
            if(x==a[j]){
                return true;
                
            }//end if
            
        }//end for
    
    
    }//end for
    
    return false;
    
} // end method


public static boolean exactlyOneDup(int[] b){
    
    int z=0;

    
    for(int i=0; i<b.length; i++){
        
        int x = b[i];
        
        
        for(int j=i+1 ; j<b.length; j++){
            if(x==b[j]){
                z++;
            }//end if
            
        }//end for
    
    }//end for
    
    if(z>1 || z==0){
        return false;
    }//end if
    
    
    
    return true;    
    
    
} // end method




  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}
