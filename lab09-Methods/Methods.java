/////////////////
// Anna Putelo
// lab09
// writing methods


import java.util.Scanner;
public class Methods{
    
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }//end main
  
  
  public static int getInt(Scanner scan){
    boolean test = true;
    
    int x=0;
    while(test){
      System.out.println("Enter an int-");
      if(scan.hasNextInt()){
        test = false;
        x = scan.nextInt();
      }
      else{
        System.out.println("You did not enter an int; try again-");
      }
    }
      
    return x;
    
      
  }//end method
  
  
  public static int larger(int a, int b){
    
  int max;  
    
  if (a>b){
    max = a;
  }  
    
  else{
    max=b;
  }  
  
  return max;
    
  }//end method
  
  
  public static boolean ascending(int a, int b, int c){
    
  if ((a<b)&&(b<c)){
    return true;
  }//end if 
    
  return false;  
    
  }//end method


}//end class
