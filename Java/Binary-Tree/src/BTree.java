public class BTree {
	private Node root;
	
	public BTree()
	{
		this.root = null;
	}
	
	public void insertNode(int id, Object element)
	{
		Node novo = new Node(id, element);
		if (root == null)
			root = novo;
		else
		{
			Node parent;
			Node current = root;
			
			while(true)
			{
				parent = current;
				if (id < current.getId())
				{
					current = current.getLeftChild();
					if (current == null)
					{
						parent.setLeftChild(novo);
						return;
					}
				}
				else
				{
					current = current.getRightChild();
					if (current == null) {
						parent.setRightChild(novo);
						return;
					}
				}
			}
			
		}
				
	}
	
	public void insertNode(int id)
	{
		Node novo = new Node(id);
		if (root == null)
			root = novo;
		else
		{
			Node parent;
			Node current = root;
			
			while(true)
			{
				parent = current;
				if (id < current.getId())
				{
					current = current.getLeftChild();
					if (current == null)
					{
						parent.setLeftChild(novo);
						return;
					}
				}
				else
				{
					current = current.getRightChild();
					if (current == null) {
						parent.setRightChild(novo);
						return;
					}
				}
			}
			
		}
	}
public int countLeftNodes()
	{
		Node current = root;
		int count = 0;
		
		if (current.hasLeft())
		{
			count += 1 + countLeftNodes(current.getLeftChild());
		}
		
		if (current.hasRight())
		{
			count += countLeftNodes(current.getRightChild());
		}
		
		return count;
		
	}
	
	private int countLeftNodes(Node atual)
	{
		Node current = atual;
		int count = 0;
		
		if (current.hasLeft())
		{
			count += 1 + countLeftNodes(current.getLeftChild());
		}
		
		if (current.hasRight())
		{
			count += countLeftNodes(current.getRightChild());
		}
		
		return count;
			
	}
	
	public void printNodes()
	{
		Node current = root;
		int count = 1;
		
		System.out.println(current.getId());
		
		if (current.hasLeft())
		{
			printNodes(current.getLeftChild(),count);
		}
		
		if (current.hasRight())
		{
			printNodes(current.getRightChild(), count);
		}
		
		
	}
	
	private void printNodes(Node atual, int count)

	{
		Node current = atual;
		
		for (int i = 0; i < count; i++)
		{
			System.out.printf("  ");
		}
		System.out.println(current.getId());
		
		if (current.hasLeft())
		{
			printNodes(current.getLeftChild(),count+1);
		}
		
		if (current.hasRight())
		{
			printNodes(current.getRightChild(), count+1);
		}
	}

	public long getHeight() {
		long a = 0;
		return getHeight(root, a);
	}
	
	private long getHeight(Node atual, long a)
	{
		if (atual != null)
		{
			long e,d;
			
			e = getHeight(atual.getLeftChild(), a) + 1;
			d = getHeight(atual.getRightChild(), a) + 1;
			
			return e>d?e:d;
		}
		return a;
	}
}
