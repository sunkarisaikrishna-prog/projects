package Sai;
import java.util.*;
public class movezerotoendbrute {
	static int[] sai(int[] ar) {
		
	ArrayList<Integer> temp=new ArrayList<Integer>();
	for(int i=0;i<ar.length;i++) {
		if(ar[i]!=0) {
		temp.add(ar[i]);
		}
	}
	int nz=temp.size();
	for(int i=0;i<nz;i++) {
		ar[i]=temp.get(i);
	}
	for(int i=nz;i<ar.length;i++) {
		ar[i]=0;
		
	}
	return ar;
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,0,2,3,0,4,0,5,0,6};
		
		sai(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
		
		

	}

}
