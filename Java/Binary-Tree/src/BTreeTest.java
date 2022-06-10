import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BTreeTest {
	static private BTree arvre = new BTree();
	/*
	@BeforeAll
	static void initializeTree()
	{
		Main.insertElements(arvre);
	}
	*/
	@Test
	void heightShouldBeSix()
	{
		int[] elementos = {50, 43, 202, 35, 65, 88, 91, 12, 1, 13, 22, 55};
		Main.insertElements(arvre, elementos);
		arvre.printNodes();
		long height = arvre.getHeight();
		
		assertEquals(6, height);
	}
	
	@Test
	void shouldBeTrueConfirmingNodeWithIDEighteenExists()
	{
		BTree arvre = new BTree();
		int[] elements = {20, 32, 21,15,13,10,5,18,22,27};
		Main.insertElements(arvre, elements);
		boolean test = arvre.nodeExists(18) != null;
		
		assertEquals(true, test);
		
	}
}
