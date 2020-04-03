package col;

import java.util.*;

public class Node1<T> implements Iterable<Node1<T>>{
	
	private T data;
	private Node1<T> parent;
	private List<Node1 <T>> children;

	public Node1(T data) {
		this.data = data;
		this.children = new LinkedList<Node1<T>>();
	}
	
	public Node1<T> addChild(T child) {
		Node1<T> childNode = new Node1<T>(child);
		childNode.parent = this;
		this.children.add(childNode);
		return childNode;
	}
	
	public Iterator<Node1<T>> iterator() {
		return null;
	}

	/*
	 * 이 클래스의 사용법을 안내할 목적으로 추가된 main()
	 */
	public static void main(String[] args) {
		Node1<String> root = new Node1<String>("root");
        {
        	Node1<String> node1 = root.addChild("node1");
        	Node1<String> node2 = root.addChild("node2");
        	Node1<String> node3 = root.addChild("node3");
            {
            	Node1<String> node4 = node1.addChild("node4");
            	Node1<String> node5 = node1.addChild("node5");
                {
                	Node1<String> node6 = node3.addChild("node6");
                }
            }
        }
    }
}


	

		



