package Sai;

public class Array2 {
      static void sai() {
	int ar[]= {1,9,3,4,6,5,9};
	int l=ar[0];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>l) {
			l=ar[i];
		}
	}
	int sl=ar[-1];
	for(int i=0;i<ar.length;i++) {
		if(ar[i]>sl && ar[i]!=l) {
			sl=ar[i];
			System.out.print(sl);
		}
	}
      }
      
      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sai();

	}

}

