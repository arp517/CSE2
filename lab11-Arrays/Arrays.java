import java.util.Scanner;   //import scanner

public class Arrays {
    public static void main (String[] args) {
        //add class and main method
        
        Scanner myScanner=new Scanner (System.in);
        int input;
        System.out.print ("Enter 10 ints: ");
        int[] array = new int[10];
        for (int i=0; i<10; i++){
            input=myScanner.nextInt();
            array[i]=input;
        }
        
        int index=0;
        int min=array[0];
        for (int j=1; j<array.length; j++){
            if (array[j]<min){
                min=array[j];
                index=j;
            }
        }
        System.out.println("min: "+min);
        
        int idex=0;
        int max=array[0];
        for (int k=1; k<array.length; k++){
            if (array[k]>max){
                max=array[k];
                idex=k;
            }    
        }
        System.out.println("max: "+max);
        
        int sum=0;
        for (int i=0; i<10; i++){
            sum=sum+array[i];
        }
        System.out.println ("The sum is "+sum);
        
        int[] array2=array;
        
        for (int i=0; i<10; i++){
            System.out.println (array[i]);
        }
        
        
        
    }   //end of main method
}   //end of class
