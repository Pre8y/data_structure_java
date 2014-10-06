package in.practice.bst;

public class BinarySearchTree<T extends Comparable<T>> {

	Node root;

	public void addAll(T[] array) {
		for (T a : array)
			add(a);
	}

	public void add(T element) {
		if (null == root) {
			root = new Node(null, element, null);
			return;
		} else
			add(root, element);
	}

	private void add(Node node, T element) {
		if (null == root) {
			root = new Node(null, element, null);
			return;
		}
		int compare = element.compareTo(node.item);
		if (compare < 0) {
			if (node.left == null)
				node.left = new Node(null, element, null);
			else
				add(node.left, element);
		} else if (compare > 0) {
			if (node.right == null)
				node.right = new Node(null, element, null);
			else
				add(node.right, element);
		}
	}

	class Node {
		Node left, right;
		T item;

		Node(Node left, T item, Node right) {
			this.left = left;
			this.item = item;
			this.right = right;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return toString(root);
	}

	private String toString(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return null;
		return "["+toString(node.left)+","+node.item.toString()+","+toString(node.right)+"]";
	}

}
