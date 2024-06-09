package Sai;

public class secondlargest {
	  static int sai(){
	        int ar[]={2,3,4,6,12,13,5,8,7,11};
	        int max=ar[0];
	        for(int i=1;i<ar.length;i++){
	            if(ar[i]>max){
	                max=ar[i];
	            }
	            
	        }
	        int sl=0;
	        for(int i=0;i<ar.length;i++){
	            sl=max-1;
	        }
	        return sl;
	        
	    }
	    public static void main(String[] args) {
	        System.out.println(sai());
	    }



}
