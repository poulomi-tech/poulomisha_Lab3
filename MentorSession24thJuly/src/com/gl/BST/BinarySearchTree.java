package com.gl.BST;

public class BinarySearchTree {
	
	void findpairWithGivenSum(Node root, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		if (!findPairUtil(root,sum, set))
			System.out.print("Pairs do not exist" + "\");
	
	void inorder() {
		inOrderRect(root);
	}
	
	void inOrderRect(Node root) {
		if(root != null) {
			inOrderRect(root.left);
			System.out.print(root.data + "- - >");
			inOrderRect(root.right);
		}
	}
	
	private boolean findPairUtil(Node root, int sum, Set<Integer>)

	public static void main(String[] args) {
	  BinarySearchTree tree = new  BinarySearchTree();
	  tree.insert(40);
	  tree.insert(20);
	  tree.insert(60);
	  tree.insert(10);
	  tree.insert(30);
	  tree.insert(50);
	  tree.insert(70);
	  tree.inorder();
	  System.out.println();
	  int sum = 60;
	  tree.findpairWithGivenSum(root, sum);
	  
	}
	  

	private void insert(int key) {
		root = insertkey(root, key);
		
	}

	}

}
