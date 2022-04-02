import java.math.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree arvre = new BTree();
		
		insertElements(arvre);
		arvre.printNodes();
		
		long height = arvre.getHeight();
		
		System.out.println("\nA árvore mais alta tem " + height + " de altura\n");
		
	}
	
	public static void teste_countLeftNodes()
	{
		Elemento item1 = new Elemento(1);
		Elemento item2 = new Elemento(1);
		Elemento item3 = new Elemento(1);
		Elemento item4 = new Elemento(1);
		Elemento item5 = new Elemento(1);
		Elemento item6 = new Elemento(1);
		Elemento item7 = new Elemento(1);
		Elemento item8 = new Elemento(1);
		Elemento item9 = new Elemento(1);
		Elemento item10 = new Elemento(1);
		Elemento item11 = new Elemento(1);
		Elemento item12 = new Elemento(1);
		Elemento item13 = new Elemento(1);
		Elemento item14 = new Elemento(1);
		
		BTree bintree = new BTree();
		
		bintree.insertNode(20, item1);
		bintree.insertNode(15, item2);
		bintree.insertNode(18, item3);
		bintree.insertNode(16, item4);
		bintree.insertNode(12, item5);
		bintree.insertNode(8, item6);
		bintree.insertNode(10, item7);
		bintree.insertNode(9, item8);
		bintree.insertNode(26, item9);
		bintree.insertNode(21, item10);
		bintree.insertNode(23, item11);
		bintree.insertNode(22, item12);
		bintree.insertNode(29, item13);
		bintree.insertNode(28, item14);
		
		
		int left = bintree.countLeftNodes();
		
		System.out.println("Number of left nodes = " + left);
	}

	public static void insertElements(BTree tree)
	{
		for (int i = 0; i < 20; i++)
		{
			tree.insertNode((int)(Math.random() * 100));
		}
	}
}
