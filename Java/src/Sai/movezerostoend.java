package Sai;

public class movezerostoend {
	static int sai(int ar[]) {
		
		
		
		 
		int j=-1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				j=i;
				
				break;
			}
		}
	
		if(j==-1) 
			System.out.print(ar);
		
		for(int i=j+1;i<ar.length;i++) {
			if(ar[i]!=0) {
			int tem=ar[i];
			ar[i]=ar[j];
			ar[j]=tem;
			j++;
			
		}
			
			
		}
		return j;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int ar[]= {1,0,2,3,0,4,5,0,0,6};
		
			sai(ar);
			for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]);
			}
			
		
		

	}
	

}

