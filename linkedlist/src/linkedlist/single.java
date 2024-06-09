package linkedlist;

public class single {
   private static class node{
		
		private int data;
		private node next;
		
		public node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	public void display(node head) {
		if (head==null) {
			return;
		}
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print(temp);
		
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node lst=new node(10);
		node lst1=new node(20);
		node lst2=new node(30);
		node lst3=new node(40);
		node lst4=new node(50);
		lst.next=lst1;
		lst1.next=lst2;
		lst2.next=lst3;
		lst3.next=lst4;
		single sll=new single();
		sll.display(lst);
		
		

	}

}
