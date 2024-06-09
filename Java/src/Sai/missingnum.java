package Sai;

public class missingnum {
	static int sai(int ar[]){
		int sum=(ar.length*(ar.length+1)/2);
		int summ=0;
		for(int i=0;i<ar.length;i++) {
			summ=summ+ar[i];
		
		}
		int k=summ-sum;
		
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,4,5,6};
		System.out.println(sai(ar));

	}

}
