/////////////////
// Anna Putelo
// lab12
// CSE2



public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }//end method
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }//end method
  
  public static double[] addArrays(double [] x, double [] y){
      
      double [] temp = new double [x.length];
      
      
      if (x.length>=y.length){
            
           temp = new double[x.length];
            
          for(int i = 0; i < temp.length; i++){
                
          if(i<y.length){
                temp[i]=y[i];
          }//end if
          else{
                temp[i]=0;
                    
          }//end else 
          }//end for
          
          for(int i=0; i<x.length; i++){
            
            temp[i]=x[i]+temp[i];
            
            
            
          }//end for
          
      } //end if
      
      if (x.length<y.length){
            
           temp = new double[y.length];
            
          for(int i = 0; i < temp.length; i++){
                
          if(i<x.length){
                temp[i]=x[i];
          }//end if
          else{
                temp[i]=0;
                    
          }//end else 
          }//end for
          
          for(int i=0; i<y.length; i++){
            
            temp[i]=y[i]+temp[i];
            
          }//end for
          
      } //end if
      
      return temp;
      
  } //end method
  
  public static boolean equals(double [] x, double [] y){
    
    if (x.length != y.length){
      return false;
    }//end if
    
    for(int i=0; i<x.length; i++){
      if(x[i] != y[i]){
        return false;
      }
    }//end for
    
    return true;
  
  }//end method 
  
  
  
  
}//end class
