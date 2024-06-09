package Sai;
import java.util.*;
public class onerotation {

	
		 static void sai(int ar[],int n,int d){
			 ArrayList<Integer> temp=new ArrayList<Integer>();
			 for(int i=d;i<n;i++) {
				 ar[i-d]=ar[i];
				 temp.add(ar[i-d]);
				 
				 
			 }
			 for(int i=n-d;i<n;i++ ) {
				 ar[i]=ar[i-(n-d)];
				 temp.add(ar[i]);
				 
			 }
			 for(int i=0;i<n;i++) {
				 ar[i]=temp.get(i);
				 System.out.print(ar[i]);
			 }
			 
		  

		 }
		    public static void main(String[] args) {
		    	int ar[]= {1,2,3,4,5,6,8};
		    	int n=7;
		    	int d=3;
		        sai(ar,n,d);
		       
		    }
}
