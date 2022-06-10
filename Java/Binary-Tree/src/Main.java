public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree arvre = new BTree();
		int[] elements = {25,32,15,28,42,37,51,45,55};
		insertElements(arvre, elements);
		arvre.printNodes();
		
		Node teste = arvre.nodeExists(42);
		System.out.println("\n\n");
		if (teste != null)
		{
			System.out.println(teste.toString());
		}
		else
		{
			System.out.println("É nulo.");
		}
		
		Node removed = arvre.removeNode(teste.getId());
		
		System.out.println("Nó removido: " + removed.getId());
		System.out.println("\n\n\n\n");
		arvre.printNodes();
		
		
	}

	public static void insertElements(BTree tree) {
		for (int i = 0; i < 20; i++) {
			tree.insertNode((int) (Math.random() * 100));
		}
	}
	
	public static void insertElements(BTree tree, int[] elements)
	{
		for (int i = 0; i < elements.length; i++)
		{
			tree.insertNode(elements[i]);
		}
	}
}
