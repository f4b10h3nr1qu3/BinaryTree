package com.f4b10h3nr1que3;

/**
 * Represents a Binary Tree
 * 
 * @author fhv4it@gmail.com<Fabio Henrique>
 *
 */
public class BinaryTree {

	private int value;
	private BinaryTree left;
	private BinaryTree right;

	/**
	 * Factory Method
	 * 
	 * @param value
	 * @return a new instance of BinaryTree class.
	 */
	public static BinaryTree getInstance(int value) {
		return new BinaryTree(value);
	}

	/**
	 * Constructor
	 * 
	 * @param value
	 */
	public BinaryTree(int value) {
		super();
		this.value = value;
	}

	/**
	 * Returns the value
	 * 
	 * @return value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Configure the value
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Configure the Binary Tree Left
	 * 
	 * @param value
	 * @return this
	 */
	public BinaryTree setLeft(BinaryTree binaryTree) {
		this.left = binaryTree;
		return this;
	}

	/**
	 * Configure the Binary Tree Left
	 * 
	 * @param value
	 * @return this
	 */
	public BinaryTree setLeft(int value) {
		this.setLeft(getInstance(value));
		return this;
	}

	/**
	 * Return the Binary Tree Left
	 * 
	 * @return
	 */
	public BinaryTree getLeft() {
		return left;
	}

	/**
	 * Return the Binary Tree Right
	 * 
	 * @return
	 */
	public BinaryTree getRight() {
		return right;
	}

	/**
	 * Configure the Binary Tree Right
	 * 
	 * @param value
	 * @return this
	 */
	public void setRight(BinaryTree binaryTree) {
		this.right = binaryTree;
	}

	/**
	 * Configure the Binary Tree Right
	 * 
	 * @param value
	 * @return this
	 */

	public BinaryTree setRight(int value) {
		this.setRight(getInstance(value));
		return this;
	}

	/**
	 * Get the sum of values
	 * 
	 * @param binaryTree
	 * @return sum of values
	 */
	public int getLeafCount(BinaryTree binaryTree) {
		if (binaryTree == null) {
			return 0;
		} else {
			return binaryTree.getValue() + getLeafCount(binaryTree.getLeft()) + getLeafCount(binaryTree.getRight());
		}
	}

	/**
	 * Get the sum of values
	 * 
	 * @return sum of values
	 */
	public int getLeafCount() {
		return getLeafCount(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinaryTree other = (BinaryTree) obj;
		if (value != other.value)
			return false;
		return true;
	}

}
