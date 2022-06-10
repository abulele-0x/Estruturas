public class BTree {
	private Node root;

	public BTree() {
		this.root = null;
	}

	public void insertNode(int id, Object element) {
		Node novo = new Node(id, element);
		if (root == null)
		{
			root = novo;
			root.setParent(null);
		}
		else {
			Node parent;
			Node current = root;

			while (true) {
				parent = current;
				if (id < current.getId()) {
					current = current.getLeftChild();
					if (current == null) {
						novo.setParent(parent);
						parent.setLeftChild(novo);
						
						return;
					}
				} else {
					current = current.getRightChild();
					if (current == null) {
						novo.setParent(parent);
						parent.setRightChild(novo);
						
						return;
					}
				}
			}

		}

	}

	public void insertNode(int id) {
		Node novo = new Node(id);
		if (root == null)
		{
			root = novo;
			root.setParent(null);
		}
		else {
			Node parent;
			Node current = root;

			while (true) {
				parent = current;
				if (id < current.getId()) {
					current = current.getLeftChild();
					if (current == null) {
						novo.setParent(parent);
						parent.setLeftChild(novo);
						
						return;
					}
				} else {
					current = current.getRightChild();
					if (current == null) {
						novo.setParent(parent);
						parent.setRightChild(novo);
						
						return;
					}
				}
			}

		}
	}

	public void printNodes() {
		Node current = root;
		int count = 1;

		System.out.println(current.getId());

		if (current.hasRight()) {
			printNodes(current.getRightChild(), count);
		}

		if (current.hasLeft()) {
			printNodes(current.getLeftChild(), count);
		}


	}

	private void printNodes(Node atual, int count)

	{
		Node current = atual;

		for (int i = 0; i < count; i++) {
			System.out.printf("  ");
		}
		System.out.println(current.getId());

		if (current.hasRight()) {
			printNodes(current.getRightChild(), count + 1);
		}
		
		if (current.hasLeft()) {
			printNodes(current.getLeftChild(), count + 1);
		}


	}

	public long getHeight() {
		long a = 0;
		return getHeight(root, a);
	}

	private long getHeight(Node atual, long a) {
		if (atual != null) {
			long e, d;

			e = getHeight(atual.getLeftChild(), a) + 1;
			d = getHeight(atual.getRightChild(), a) + 1;

			return e > d ? e : d;
		}
		return a;
	}
	
	public Node removeNode(int id)
	{
		
		Node removeMe = nodeExists(id); //esse 'removeMe' apenas faz referência ao Node a ser removido.
		if (removeMe == null) return null;
		//Se o nó a ser removido NÃO TEM filhos.
		if (!(removeMe.hasLeft() || removeMe.hasRight()))
		{
			if (removeMe == removeMe.getParent().getRightChild())
			{//se for filho direito
				removeMe.getParent().setRightChild(null); //apaga o filho direito do parent;
				return removeMe;
			} // caso contrário, é filho esquerdo. Algum filho ele é!
			removeMe.getParent().setLeftChild(null);
			return removeMe;
		}
		//Se o Nó a ser removido tem UM, E APENAS UM, filho.
		if ((removeMe.hasLeft()  && !removeMe.hasRight()) || (!removeMe.hasLeft() && removeMe.hasRight()))
		{
			//has only one child
			if (removeMe == removeMe.getParent().getRightChild())
			{//se o nó a ser removido for filho direito...quem deve ser substituído é o filho direito do pai dele
				if (removeMe.hasLeft())
				{
					removeMe.getParent().setRightChild(removeMe.getLeftChild());
					return removeMe;
				}
				removeMe.getParent().setLeftChild(removeMe.getRightChild());
				return removeMe;
			} // caso contrário, é filho esquerdo. Algum filho ele é!
				if (removeMe.hasLeft()) //se o filho que ele tem for o esquerdo...
				{
					removeMe.getParent().setRightChild(removeMe.getLeftChild());
					return removeMe;
				}//caso contrário...
				removeMe.getParent().setLeftChild(removeMe.getRightChild());
				return removeMe;
		}
		
		if (removeMe.hasLeft() && removeMe.hasRight())
		{
			//both children
			Node candidate = getSuccessor(removeMe.getRightChild());
			
			if (removeMe == removeMe.getParent().getRightChild()) //removeMe é filho direito
			{
				candidate.setLeftChild(removeMe.getLeftChild());
				removeMe.getParent().setRightChild(candidate);
				return removeMe;
			}
			candidate.setLeftChild(removeMe.getLeftChild());
			removeMe.getParent().setLeftChild(candidate);
			return removeMe;
		}
		
		return removeMe;
			
	}

	private Node getSuccessor(Node removed)
	{
		Node successorParent = removed;
		Node successor = removed;
		
		while(successor.hasLeft())
		{
			successorParent = successor;
			successor = successor.getLeftChild();
		}
		
		if (! (successor == removed.getRightChild()))
		{
			successorParent.setLeftChild(successor.getRightChild());
			successor.setRightChild(successorParent);
		}
		
		return successor;
		
	}
	public Node nodeExists(int id)
	{
		return nodeExists(id, root);
	}
	
	private Node nodeExists(int id, Node current)
	{
		Node returnThis = null;
		if (current.getId() == id) return current;
		
		if (current.hasLeft()) 
		{
			returnThis = nodeExists(id, current.getLeftChild());
		}
		if (current.hasRight() && returnThis == null)
		{
			returnThis = nodeExists(id, current.getRightChild());
		}
		
		return returnThis;
		
		
	}
	
	
}
