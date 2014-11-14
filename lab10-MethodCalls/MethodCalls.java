////////////
// Anna Putelo
// CSE2
// lab10



import java.util.Scanner;

public class MethodCalls{
public static int addDigit(int all, int addition){   
    if (total<0){
        int better = total* -1;
        String X=String.valueOf(all); 
        String Y=String.valueOf(better);
        String Z=Space+Y;
        Integer w = Integer.valueOf(Z);
        return -w;
    }//end if
    else if (addition>=0 && addition <=9){
        int better = total* -1;
        String X=String.valueOf(all); 
        String Y=String.valueOf(better);
        String Z=Space+Y;
        Integer w = Integer.valueOf(Z);
        return w;
    }//end if
    else{
        return all;
    }//end else
        
        
        
        
    }//end if
   
   
   
}//end method   
   
   
   
public static int join(int a2, int b2){
    if(a2<0 && b2<0){
        int a3=a2*-1;
        int b3=b2*-1;
        
        String A=String.valueOf(a3);
        String B=String.valueOf(b3);
        String C=A+B;
        Integer d = Integer.valueOf(C);
        return d;
    }
    
    return addDigit(a2, b2);
   
}//end method   
   
   
   
public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }//end main
}//end class
