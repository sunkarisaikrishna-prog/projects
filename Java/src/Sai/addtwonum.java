package Sai;

public class addtwonum {
	static boolean sai() {
		int target=8;
		int ar[]= {1,4,5,2};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==target) {
					return true;
				}
				
				} 
			}
			
			
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sai());

	}

}
