package Sai;

public class kadanes {
	static int sai(){
		int ar[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int min=Integer.MIN_VALUE;
		int sum=0;
	
			
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			if(sum<0) {
				sum=0;
			}
		
		
		if(sum>min) {
			min=sum;
		}
		
		
		}
		return min;
		
		
		
	}
		
		
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sai());

	}

}
