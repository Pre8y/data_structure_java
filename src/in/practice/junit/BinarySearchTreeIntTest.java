package in.practice.junit;

import static org.junit.Assert.assertEquals;
import in.practice.bst.BinarySearchTreeInt;

import org.junit.Test;

public class BinarySearchTreeIntTest {

	@Test
	public void test345() {
	    BinarySearchTreeInt tree = new BinarySearchTreeInt();
	    tree.add(3);
	    tree.add(4);
	    tree.add(5);
	    assertEquals("[null,3,[null,4,[null,5,null]]]", tree.toString());
	}

	@Test
	public void test453() {
		BinarySearchTreeInt tree = new BinarySearchTreeInt();
	    tree.add(4);
	    tree.add(5);
	    tree.add(3);
	    assertEquals("[[null,3,null],4,[null,5,null]]", tree.toString());
	}
	@Test
	public void testNoDups() {
		BinarySearchTreeInt tree = new BinarySearchTreeInt();
	    tree.add(4);
	    tree.add(4);
	    assertEquals("[null,4,null]", tree.toString());
	}
	@Test
	public void testLinkedList() {
		BinarySearchTreeInt tree = new BinarySearchTreeInt();
		int[] array = {1, 2,3,4,5,6};
	    tree.addAll(array);
	    tree.add(4);
	    assertEquals("[null,1,[null,2,[null,3,[null,4,[null,5,[null,6,null]]]]]]", tree.toString());
	}

}
