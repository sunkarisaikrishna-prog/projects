package Sai;
import java.util.*;
import java.util.LinkedList;

public class missingnumbrute {
	 public static int[] moveZeroes(int[] a) {
	        // Temporary array
		 LinkedList<Integer> temp = new LinkedList<Integer>();
	        
	        // Copy non-zero elements from original array to temp array
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] != 0) {
	                temp.add(a[i]);
	            }
	        }
	        
	        // Number of non-zero elements
	        int nz = temp.size();
	        
	        // Copy elements from temp array back to original array
	        for (int i = 0; i < nz; i++) {
	            a[i] = temp.get(i);
	        }
	        
	        // Fill rest of the cells with 0
	        for (int i = nz; i < a.length; i++) {
	            a[i] = 0;
	        }
	        
	        return a;
	    }

	    public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 3, 12};
	        int[] result = moveZeroes(arr);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}
