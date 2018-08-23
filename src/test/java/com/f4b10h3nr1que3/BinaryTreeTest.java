package com.f4b10h3nr1que3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * * jUnit test for BinaryTree class
 * 
 * @author fhv4it@gmail.com<Fabio Henrique>
 *
 */
public class BinaryTreeTest {

	private BinaryTree tree;

	@Test
	public void test1() {
		tree = new BinaryTree(1);
		tree.setLeft(4).setRight(5);

		tree.getLeft().setLeft(5).setRight(11);
		tree.getRight().setLeft(3).setRight(6);
		tree.getRight().getRight().setRight(4).setLeft(5);

		assertTrue(tree.getLeafCount() == 44);
	}

	@Test
	public void test2() {
		tree = new BinaryTree(400);
		tree.setLeft(1).setRight(1);

		tree.getLeft().setLeft(2).setRight(400);
		tree.getRight().setLeft(3).setRight(1);
		tree.getRight().getRight().setRight(1).setLeft(0);

		assertTrue(tree.getLeafCount() == 809);
	}

	@Test
	public void test3() {
		tree = new BinaryTree(400);
		tree.setLeft(1).setRight(1);

		tree.getLeft().setLeft(2).setRight(400);
		tree.getRight().setLeft(3).setRight(1);
		tree.getRight().getRight().setRight(1).setLeft(0);

		assertTrue(tree.getLeafCount(tree.getLeft()) == 403);
	}

}
