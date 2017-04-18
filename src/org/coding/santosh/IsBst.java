package org.coding.santosh;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Iterator;
import java.util.Stack;
public class IsBst {
public static Stack<BNode> s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BNode root = new BNode(6,null,null);
		BNode n1 = new BNode(4,null,null);
		BNode n2 = new BNode(8,null,null);
		BNode n3 = new BNode(2,null,null);
		BNode n4 = new BNode(5,null,null);
		BNode n5 = new BNode(7,null,null);
		BNode n6 = new BNode(10,null,null);
		BNode n7 = new BNode(1,null,null);
		BNode n8 = new BNode(3,null,null);
		BNode n9 = new BNode(9,null,null);
		BNode n10 = new BNode(11,null,null);
		//BNode n11 = new BNode(5,null,null);
		//BNode n1 = new BNode(2,null,null);
		//         
		//			       6
		//
		//          4              8
		//
		//		2       5       7      10
		//   
		//   1     3				9		11
		//
		//
		// above tree is BST 
		//iterative implementation of Check a tree is BST or not using stack
		//
		root.left= n1;
		root.right= n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		n2.right= n6;
		n3.left= n7;
		n3.right = n8;
		n6.left = n9;
		n6.right = n10;
		s = new Stack<BNode>();
		if(root.value < root.left.value || root.value > root.right.value)
			System.out.println("The Tree is not a Binary Search Tree");
		else{
		if(checkBst(root.left) && checkBst(root.right))
			System.out.println("The Tree is a Binary Search Tree");
		else
			System.out.println("The Tree is not a Binary Search Tree");
		}
	}
	
	public static boolean checkBst(BNode node)
	{
		
		BNode curr = node;
		BNode temp = new BNode();
		while(curr.left != null)
		{
			if(curr.value < curr.left.value) // base condition
				return false;
			else
			{
			s.push(curr);  // add to stack before moving to left child
			curr = curr.left;
			}
		}
	while(!s.isEmpty())
	{
		temp = s.pop(); // pop from stack and check right sub tree of popped node
		curr = temp.right;
	if(curr != null)
	{
		if(temp.value > curr.value)
		return false;
		else
		{
			while(curr.left != null)
			{
				if(curr.value < curr.left.value) // base condition
					return false;
				else
				{
				s.push(curr);
				curr = curr.left;
				}
			}
		}
	}
	}	
		return true;
	}
}
