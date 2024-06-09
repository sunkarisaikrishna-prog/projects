package Sai;

public class duplicates {
	static int sai(int[]ar){
	        int i=0;
	        for(int j=1;j<ar.length;j++){
	            if(ar[i]!=ar[j]){
	                i++;
	               ar[i]=ar[j] ;
	                
	            }
	            
	        }
	        return i+1;
	    }
	        
	    public static void main(String[] args) {
	    	int ar[]={1,1,2,2,3,3,4,4};
	        int k=sai(ar);
	        for(int i=0;i<k;i++) {
	        	System.out.print(ar[i]);
	        }
	       
	    }

}

