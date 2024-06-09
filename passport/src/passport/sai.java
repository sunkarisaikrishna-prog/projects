package passport;
import java.util.*;
import java.util.Map.Entry;
class information{
	private String name;
	private int age;
	private int DOB;
	private String phno;
	public information(String name,int age,int DOB,String phno) {
		this.name=name;
		this.age=age;
		this.DOB=DOB;
		this.phno=phno;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getDOB() {
		return DOB;
	}
	public String getPhno() {
		return phno;
	}
	public String toString()
	{
		return name+" "+age+" "+DOB+" "+phno;
	}
}
public class sai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		information in1=new information("saikrishna",21,2003,"7780723851");
		information in2=new information("Thingar Nithya",21,2002,"7981022588");
		information in3=new information("vinay kumar",22,2001,"8179313295");
		information in4=new information("Sravani",21,2003,"7780723852");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the passport number: ");
	    Integer j= scn.nextInt();
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(1, in1);
		lhm.put(2, in2);
		lhm.put(3, in3);
		lhm.put(4, in4);
		Set k=lhm.entrySet();
		Iterator itr=k.iterator();
		boolean flag=false;
		while(itr.hasNext()) {
			
			Map.Entry e =(Entry) itr.next();
			Integer key=(Integer) e.getKey();
		
			if(j==key) {
				System.out.println(e.getKey()+" "+e.getValue());
				flag=true;
			}
		}
		 if(flag==false)
		System.out.print("passport number not valid");
		
		

	}

}
