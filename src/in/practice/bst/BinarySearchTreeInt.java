package in.practice.bst;


public class BinarySearchTreeInt {
	Node root;

	public void addAll(int[] array) {
		for (int a : array)
			add(a);
	}
	
	public void addSorted(int[] array)
	{
		
	}

	public void add(int element) {
		if (null == root) {
			root = new Node(null, element, null);
		} else {
			add(root, element);
		}
	}

	private void add(Node node, int element) {
		// TODO Auto-generated method stub
		if (element < node.item) {
			if (node.left == null)
				node.left = new Node(null, element, null);
			else
				add(node.left, element);
		} else if (element > node.item) {
			if (node.right == null)
				node.right = new Node(null, element, null);
			else
				add(node.right, element);
		} 
	}

	class Node {
		Node left, right;
		int item;

		Node(Node left, int item, Node right) {
			this.left = left;
			this.item = item;
			this.right = right;
		}
	}
	@Override
	public String toString() {
	    return toString(root);
	}

	private String toString(Node node) {
	    if (node == null) {
	        return null;
	    }
	    return "[" + toString(node.left) + "," + node.item + "," + toString(node.right) + "]";
	}
}
