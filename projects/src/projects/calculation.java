package projects;

import java.util.Scanner;
abstract class shapes{
    float area;
    abstract public void input();
    abstract public void cal();
	public void disp() {
		System.out.println("the area is"+area);
		
		
	}
	
}
class Rectangle extends shapes
{
	float length;
	float breadth;
	
	
	public void input() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the input of length of rectangle");
		length =scan.nextFloat();
		System.out.println("Enter the input of breadth of reactangle");
		breadth=scan.nextFloat();
		
	}		
		
	public void cal() {
		area=length*breadth;
	}
	
}

class square extends shapes
{
	float length;
	
		public void input() {
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the input of length of square");
			length =scan.nextFloat();	
			}
		public void cal() {
			area=length*length;
		}
		
}
class circle extends shapes
{
	
	float radius;
	final float pi=3.16f;
			public void input() {
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter the input of radius of circle");
				radius=scan.nextFloat();	
				}
			public void cal() {
				area=pi*radius*radius;
			}
			
		
		
	}
class geometry{
	void permit(shapes s) {
		s.input();
		s.cal();
		s.disp();
	}
}
	
	


public class calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		square s=new square();
		circle c=new circle();
		geometry g=new geometry();
		g.permit(r);
		g.permit(s);
		g.permit(c);
		
		
		

	}

}
