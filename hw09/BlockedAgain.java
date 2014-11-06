//////////////////
// Anna Putelo
// hw09
// CSE2


public static int getInt(){

int p input;
p=checkInt();
Scanner scan=new Scanner(System.in);
System.out.println(' enter an int ');

}//end method

public static int checkInt(){
    
if (scan.hasNextInt()){
    
}
    
}//end method

public static int checkRange(){
    
if (j>=1 && j<=9){
    
}//end if

else{
    System.out.println(' error ');
}//end else    
}//end method

public static int allBlocks(int j){

for(int j=1;j<=i;j++){
	    
    block(j,p);
}//end for

}//end method

public static int block(j){

int val;  
int j=1;
while(val<=9 && val>=1 && j<=val){
   line(val,j);
}//end while
}//end method  


public static int line(){
    
while(val<=9 && val>=1 && j<=val){
    System.out.println(j);
    System.out.println('-');
    j++;
}//end loop
}//end method




import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}
}
