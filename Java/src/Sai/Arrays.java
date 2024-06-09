package Sai;

public class Arrays {
	public static int sai(){
		int ar[]= {4,6,7,9,8,9};
	
		int largest=ar.length-1;
		int sl=0;
		for(int i=ar.length-2;i>0;i--) {
			if(ar[i]!=largest) {
				sl=ar[i];
				break;
			}
		}
		return sl;
		
	}

	public static void main(String[] args) {
		int k=sai();
		System.out.print(k);

	}

}
