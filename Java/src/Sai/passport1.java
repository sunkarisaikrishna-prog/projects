package Sai;

import java.util.*;
import java.util.Map.Entry;
class information{
	private String name;
	private int age;
    private String phno;
	private String city;
	public  information(String name,int age,String phno,String city) {
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhno() {
		return phno;
	}
	
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return name +" "+age+" "+phno+" "+city;
	}
}


public class passport1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		information ps1= new information("sai",21,"7780723851","karimnagar");
		information ps2= new information("thingar",21,"7981022588","hyd");
		information ps3= new information("nithya",20,"123456789","nizambad");
		HashMap<Integer, information> hm=new HashMap<Integer, information>();
		hm.put(270, ps1);
		hm.put(280,ps2);
		hm.put(1, ps3);
		Set st=hm.entrySet();
		Iterator itr=st.iterator();
		while(itr.hasNext()) 
		{
			Map.Entry pass =(Entry) itr.next();
			System.out.println("passport number :"+pass .getKey()+": info : "+pass .getValue());
			
		}
		
				
		

	}

}

