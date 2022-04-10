
public class Node {
	private int id;
	private Object value;
	private Node leftChild;
	private Node rightChild;
	
	public Node(int id, Object value)
	{
		this.value = value;
		this.id = id;
	}
	
	public Node(int id)
	{
		this.id = id;
	}
	
	public void setLeftChild(Node leftChild)
	{
		this.leftChild = leftChild;
	}
	public void setRightChild(Node rightChild)
	{
		this.rightChild = rightChild;
	}
	public Node getLeftChild()
	{
		return this.leftChild;
	}
	public Node getRightChild()
	{
		return this.rightChild;
	}
	public Object getValue()
	{
		return this.value;
	}
	public void setValue(Object value)
	{
		this.value = value;
	}
	public int getId()
	{
		return this.id;
	}
	public boolean hasLeft()
	{
		return this.getLeftChild() != null;
	}
	public boolean hasRight()
	{
		return this.getRightChild() != null;
	}	
}
