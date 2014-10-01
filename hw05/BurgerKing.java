/////////////////////////////////
// Anna Putelo
// hw05
// CSE2
//
// Write a program that prompts the user to enter their order. 
// Then the program prompts the users for details of their choices. 

import java.util.Scanner;

public class BurgerKing{
    public static void main(String[] args){
    
    Scanner myScanner;
    myScanner = new Scanner(System.in);

//initial question    
System.out.println("enter food choice");           
String food = myScanner.next();

//switch statement from first scanner
switch(food){
    case "b": //burger options
    case "B": System.out.println("enter toppings"); 
        String toppings = myScanner.next();
        switch(toppings){
            case "A": 
            case "a": System.out.println(" you ordered a burger with all the fixins"); break;
            case "C": 
            case "c": System.out.println(" you ordered a burger with cheese"); break;
            case "N": 
            case "n": System.out.println(" you ordered a burger with no toppings"); break;
            default: System.out.println(" error"); break;
        } //end toppings
     case "S": //soda options
     case "s": System.out.println(" enter type of soda");
        String soda = myScanner.next();
        switch(soda){
            case "p": 
            case "P": System.out.println(" you ordered pepsi"); break;
            case "s":
            case "S": System.out.println(" you ordered sprite"); break;
            case "c": 
            case "C": System.out.println(" you ordered coke"); break;
            default: System.out.println(" error"); break;
        }//end soda type
    case "f": //fries options
    case "F": System.out.println(" enter size");
        String size = myScanner.next();
        switch(size){
            case "s": 
            case "S": System.out.println(" you ordered small fries"); break;
            case "l": 
            case "L": System.out.println(" you ordered large fries"); break;
            default: System.out.println(" error"); break;
        }// end size
    default: System.out.println(" error"); break;  //overall error statement
     
} //end big switch
        
        
        
        
        
        
    } //end method
} //end class
