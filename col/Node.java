package col;

import java.util.*;

public class Node<T> {
	
	private T data;
	private Node<T> parent;
	private List<Node <T>> children = new ArrayList();
	
	/*
	 * �� Ŭ������ ������ �ȳ��� �������� �߰��� main()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<String> root = new Node();
		root.setData("��");
		
		Node<String> childA = new Node();
		childA.setData("A");
		root.addChild(childA);
		
		Node<String> childB = new Node();
		childA.setData("A");
		root.addChild(childB);
		
		Node<String> childC = new Node();
		childA.setData("A");
		root.addChild(childC);
		
		Node<String> childOne = new Node();
		childA.setData("A");
		root.addChild(childOne);
		
		Node<String> childTwo = new Node();
		childA.setData("A");
		root.addChild(childTwo);
		
		printTree(root, 0);
	}
	/**
     *  Use for debugging. prints all nodes from root to leaves
     * @param node �ܼ�ȭ�鿡 ����� root node�� ����
     * @param level �ܼ�ȭ�鿡 ����� ����, ó�� ȣ��� �ݵ�� 0�� �����ϼ���
     */


	//��ó: https://micropilot.tistory.com/2841 []
	private static void printTree(Node<String> node, int level) {
		int indent = level++;
		String tabs = "";
		for(int i = 0 ; i < indent ; i++) {
			tabs += "\t";
		}
		System.out.println(tabs+node.getData());
		List<Node<String>> children = node.getChildren();
		if(children.size()==0) {
			return;
		}
		for(int i = 0 ; i < children.size(); i++) {
			Node<String> child = children.get(i);
			printTree(child, level);
		}
	}
	
	public void addChild(Node<T> child) {
		child.setParent(this);
		getChildren().add(child);
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getParent() {
		return parent;
	}
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	public List<Node<T>> getChildren() {
		return children;
	}
	public void setChildren(List<Node<T>> children) {
		this.children = children;
	}
	
	
		
}


		



