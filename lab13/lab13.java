//////////////
// Anna Putelo
// lab13



public class lab13{
    public static void main(String[] args){
    
    //make array  
    int a [] [] = new int [5] [];
    for (int i=0; i<a.length; i++){
        a[i] = new int [i*3+5];
    }//end for
      
      
    for (int i=0; i<a.length; i++){
        for (int j=0; j<a[i].length; j++){
            
        a[i][j]=(int)(Math.random()*39);    
            
            
        }//end for
    }//end for  
      
    for (int i=0; i<a.length; i++){
        for (int j=0; j<a[i].length; j++){
            
        System.out.print(a[i][j]+" ");    
           
            
        }//end for
        
        System.out.println(); 
    }//end for
      
    for (int i=0; i<a.length; i++){
        
    
        for (int j=0; j<a[i].length; j++){
        
        int min=j;
        
        for (int k=j; k<a[i].length; k++){
            
            if (a[i][min]>a[i][k]){
            min=k;
            }//end if  
          
            
        }//end for
        
        if(min!=j){
        //temp filler    
        int temp=a[i][min];
        a[i][min]=a[i][j];
        a[i][j]=temp;
        }//end if
        
    
        }//end for
        
        System.out.println(); 
    }//end for  
      
      for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
            
            System.out.print(a[i][j]+" ");    
           
            
            }//end for
        
        System.out.println(); 
        }//end for
        
    }//end main
  
}//end class
