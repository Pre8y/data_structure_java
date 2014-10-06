package in.practice.junit;

import static org.junit.Assert.*;
import in.practice.bst.BinarySearchTree;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void test() {
		BinarySearchTree<String> tester = new BinarySearchTree<String>();
		String[] str= {"a", "c", "b"};
		tester.addAll(str);
		System.out.println(tester.toString());
		assertEquals("[null,a,[[null,b,null],c,null]]", tester.toString());
	}

}
