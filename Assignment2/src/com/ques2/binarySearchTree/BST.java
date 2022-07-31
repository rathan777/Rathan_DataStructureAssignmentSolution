package com.ques2.binarySearchTree;


public class BST {
	static class Node
	{
		int val;
		Node left, right;
		Node(int key)
		{
			val=key;
			left=right=null;
		}
	}

		public static Node node;
		public static Node prevNode=null;
		public static Node headNode=null;

		
		public static void BSTtoSkewed(Node root,int order)
		{
			if(root == null)
			{
				return;
			}
		
			if(order > 0)
			{
				BSTtoSkewed(root.right, order);
			}
			else
			{
				BSTtoSkewed(root.left, order);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;
		
			
			if(headNode == null)
			{
				headNode=root;
				root.left=null;
				prevNode=root;
			}
			else
			{
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
		
			
			if (order > 0)
			{
				BSTtoSkewed(leftNode, order);
			}
			else
			{
				BSTtoSkewed(rightNode, order);
			}
		}

		static void traverseToRight(Node root)
		{
			if(root == null)
			{
				return;
			}
			System.out.print(root.val + " ");
			traverseToRight(root.right);	
		}
		
	public static void main (String args[]) 
	{
			
			BST tree = new BST();
			tree.node = new Node(50);
			tree.node.left = new Node(30);
			tree.node.right = new Node(60);
			tree.node.left.left = new Node(10);
			tree.node.right.left= new Node(55);
		
			
			int order = 0;
			BSTtoSkewed(node,order);
			traverseToRight(headNode);
	}
		
		
	}
