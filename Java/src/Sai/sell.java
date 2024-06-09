package Sai;

public class sell {
	static int sai(int ar[]) {
		int max=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]>ar[i]) {
				max=Math.max(max,  ar[j]-ar[i]);
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {7,1,5,3,6,4};
		System.out.print(sai(ar));

	}

}
