package Sai;

public class tworotation {
	static void sai() {
		int ar[]= {1,2,3,4,5,6,7};
		int temp=ar[0];
		int kiran=ar[1];
		for(int i=2;i<ar.length;i++) {
			System.out.print(ar[i-1]=ar[i]);
		}
		System.out.print(ar[ar.length-1]=temp);
		
		System.out.print(ar[ar.length-2]=kiran);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sai();

	}

}
