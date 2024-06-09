package Sai;

import java.util.ArrayList;

public class leader {
	static int sai(int ar[]) {
		boolean target=true;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;i<ar.length;j++) {
				if(ar[j]>ar[i]) {
				 target=false;
					break;
				}
				if(target==true) {
					
				}
			}
		}
		return i;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {4, 7, 1, 0};
		int k=sai(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(k.get(i));
		}

	}

}
