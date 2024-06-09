package Sai;
import java.util.*;
import java.util.Arrays;
public class SLarray {

	static int sai(){
        int ar[]={2,3,54,5,8,7};
        Arrays.sort(ar);
       int largest=ar[0];
       for(int i=0;i<ar.length;i++){
           if(ar[i]>largest){
               largest=ar[i];
           }
       }
       int sl=0;
       for(int i=ar.length-2;i>0;i--){
           if(ar[i]!=largest){
               sl=ar[i];
               break;
           }
       }
       return sl;
    }
    public static void main(String[] args) {
      System.out.print(sai());
    }

}
