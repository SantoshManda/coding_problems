package org.coding.santosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BTreeMirrorCheck {
	
	ArrayList<Integer> s1,s2;
	
	public BTreeMirrorCheck()
	{
		s1 = new ArrayList<Integer>();
		s2 = new ArrayList<Integer>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result;
		BTreeMirrorCheck b = new BTreeMirrorCheck();
		BNode root = new BNode(1,null,null);
		BNode n1 = new BNode(2,null,null);
		BNode n2 = new BNode(3,null,null);
		BNode n3 = new BNode(4,null,null);
		BNode n4 = new BNode(5,null,null);
		//BNode n1 = new BNode(2,null,null);
		root.left = n1;
		root.right = n2;
		n2.left = n3;
		n2.right = n4;
		
		BNode root1 = new BNode(1,null,null);
		BNode n11 = new BNode(2,null,null);
		BNode n21 = new BNode(3,null,null);
		BNode n31 = new BNode(4,null,null);
		BNode n41 = new BNode(5,null,null);
		
		root1.left = n21;
		root1.right = n11;
		n21.left = n41;
		n21.right = n31;
		
		result = b.MirrorCheck(root,root1);
		if(result)
			System.out.println("Binary Tree 1 and BInary Tree 2 are mirror images");
		else
			System.out.println("Binary Tree 1 and BInary Tree 2 are not mirror images");
		
	}
	
	public void PreOrderTraverse(BNode x)
	{
		if(x == null )
			return;
		Integer temp = new Integer(x.value);
		//System.out.println(x.value);
		s1.add(temp);
		PreOrderTraverse(x.left);
		PreOrderTraverse(x.right);
		
	}

	public void PostOrderTraverse(BNode x)
	{
		if(x == null )
			return;
		Integer temp = new Integer(x.value);
		PostOrderTraverse(x.left);
		PostOrderTraverse(x.right);
		//System.out.println(x.value);
		s2.add(temp);
		
	}
	
	public boolean MirrorCheck(BNode r1,BNode r2)
	{
		//Integer a,b;
		if(r1 == null || r2 == null)
			return false;
		PreOrderTraverse(r1);
		PostOrderTraverse(r2);
		Collections.reverse(s2);
		
		if(s1.size() != s2.size())
			return false;
		
		Iterator<Integer> i = s1.iterator();
		Iterator<Integer> j = s2.iterator();
		
		if(i.hasNext() && j.hasNext())
		{
			if(i.next().intValue() != j.next().intValue())
				return false;
		}
		return true;
	}
}