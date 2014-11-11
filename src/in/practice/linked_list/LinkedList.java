public class LinkedList{

	public static void main(String []a)
	{
		Node n = new Node(1);
		n.add(3);
		n.add(5);
		n.add(2);
		n.add(4);
		n.add(6);
		n.add(8);
		Node.print(n);
		System.out.println("---------"+n.size());
		Node.print(n.merge());
	}
	


}
class Node{
	int data;
	Node next=null;
	public Node(int data)
	{
		this.data = data;
	}
	public void add(int x)
	{
		Node node = this;

		while(node.next!=null)
			node = node.next;
		node.next = new Node(x);
	}
	public void addNode(Node n)
	{
		Node node = this;

		if(node==null)
		{	node=n;
			return;
		}
		while(node.next!=null)
			node = node.next;
		node.next = n;
	}


	public void deleteNode(int d)
	{
		Node node = this;
		while(node.next!=null)
		{
			if(node.next.data==d)
				node.next = node.next.next;
			else node = node.next;
		}
	}
	public static void print(Node n)
	{
		if(n==null)
			return;
		while(n.next!=null)
		{
			System.out.print(n.data+"--");
			n = n.next;
		}
	}
	public int size()
	{
		int result = 0;
		Node node = this;
		if(node==null) return result;
		while(node.next!=null)
		{
			node=node.next;
			result++;
		}
		return result;
	}
	/*
	 * take one list a1->a2-->b1->b2-->bn even num then 
	 * merge to a1->b1->a2->b2----->an->bn
	 */
	public Node merge()
	{
		System.out.println("size is --"+this.size());
		if(this.size()%2!=0)
			return null;
		Node p1, p2, r=null;
		p1 = this;
		p2 = this;
		Node p3=this;
		while(p1.next!=null && p1.next.next!=null)
		{
			p1=p1.next.next;
			p2=p2.next;
		}
		System.out.println("mid is-->"+p2.data);
		int i = 0;
		while(p2.next!=null)
		{
			if(i%2==0)
			{
				r.addNode(p3);
				p3=p3.next;
			}	
			else {r.addNode(p2);
			p2=p2.next;
			}
			i=i+1;
		}

return r;
	}
}
