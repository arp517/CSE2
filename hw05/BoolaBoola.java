///////////////////////////
// Anna Putelo
// hw05
// CSE2
//
// 
// Boola Boola


import java.util.Scanner;
public class BoolaBoola {
   	public static void main(String[] args) {
   	    
   	    
// boolean inputs
Scanner input;
boolean b1;
boolean b2;
boolean b3;

//Assign true false variables at random
int a1 =(int)(Math.random()*2);
int a2 =(int)(Math.random()*2);
int a3 =(int)(Math.random()*2);
int expression= (int)(Math.random()*4);


//randomize values for the variables
    if (a1==1){
        b1 = true;
    }
    else{
        b1 = false;
    }
     if (a2==1){
        b2 = true;
    }
     else{
        b2 = false;
    }
     if (a3==1){
        b3 = true;
    }
     else{
        b3 = false;
    }
    
//different sets of "if" and "or" possibilities 

boolean a=b1&&b2&&b3;
boolean b=b1||b2||b3;
boolean c=b1||b2&&b3;
boolean d=b1&&b2||b3;

//  scanner input
Scanner myScanner;
myScanner = new Scanner (System.in);
    String response;
    

if (expression==0){
    System.out.println("Does "+b1+" && "+b2+" && "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    
    //if statements - note capitalization of letters
    if(response.equals("f")||response.equals("F")){
        if(a==false){
            System.out.println("Correct");
            return; //exit statement
            }
        else{
        System.out.println("wrong");
        return; //exit statement
            }
    }
    //if statements - note capitalization of letters
    if(response.equals("t")||response.equals("T")){
        if(a==true){
            System.out.println("Correct");
            return; //exit statement
            }
        else{
        System.out.println("wrong");
        return; //exit statement
            }    
    } 
} //end statement


// next if    
if (expression==1){
    System.out.println("Does "+b1+" && "+b2+" || "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    
    //if statements - note capitalization of letters
    if(response.equals("f")||response.equals("F")){
        if(b==false){
            System.out.println("Correct");
            return;
            }
        else{
        System.out.println("Wrong; try again");
        return;
            }
    }
    
    //if statements - note capitalization of letters
    if(response.equals("t")||response.equals("T")){
        if(b==true){
            System.out.println("correct");
            return;
            }
        else{
        System.out.println("wrong");
        return;
            }    
    }
}//end statement 

// next if    
if (expression==2){
    System.out.println("Does "+b1+" || "+b2+" && "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    
    //if statements - note capitalization of letters
    if(response.equals("f")||response.equals("F")){
        if(c==false){
            System.out.println("correct");
            return;
            }
        else{
        System.out.println("wrong");
        return;
            }
    }
    
    //if statements - note capitalization of letters
    if(response.equals("t")||response.equals("T")){
        if(c==true){
            System.out.println("correct");
            return;
            }
        else{
        System.out.println("wrong");
        return;
            }    
    }
} //end statement 

//next if    
if (expression==3){
    System.out.println("Does "+b1+" || "+b2+" || "+b3+" have the value true(t/T) or false(f/F)?");
    response= myScanner.next();
    
    //if statements - note capitalization of letters
    if(response.equals("f")||response.equals("F")){
        if(d==false){
            System.out.println("correct");
            return;
            }
        else{
        System.out.println("wrong");
        return;
            }
    }
    
    //if statements - note capitalization of letters
    if(response.equals("t")||response.equals("T")){
        if(d==true){
            System.out.println("correct");
            return;
            }
        else{
        System.out.println("wrong");
        return;
            }    
    }    
}
}//end method
}//end class
