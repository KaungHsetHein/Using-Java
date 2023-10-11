package com.jdc.j17;

public sealed abstract class Node permits SingleNode, PairNode{
	
	private int node;

	public int getNode() {
		return node;
	}

	public void setNode(int node) {
		this.node = node;
	}
	

}
