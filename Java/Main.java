/*
 * A ideia é implementar as estruturas sem olhar tanto a apostila
 */

class Main {
  public static void main(String[] args) {
  /* Teste de fila

    QueueRR fila = new QueueRR(5);

    fila.enqueue(1);
    fila.enqueue(2);
    fila.enqueue(3);
    fila.enqueue(4);
    fila.enqueue(5);

    int tam = fila.length();
    int count = 0;
    while (count < tam){
      System.out.printf("Elemento fila[%d]: %d\n", count, fila.first());
      fila.dequeue();
      count++;
    }
  }
  */

  /* Teste Stack
  Stack pilha = new Stack(10);
  System.out.printf("Length: %d\n", pilha.length());
  for (int i = 0; i < 10; i++){
    pilha.push(i);
    System.out.printf("Pilha[%d] = %d\n", i, i);
  }
  System.out.println();
  for (int i = pilha.length()-1; i >= 0; i--){
    System.out.printf("Pilha[%d] = %d\n", i, pilha.pop());
  }
  */

  /* Teste Stack com Linked List
  
  StackLL pilha = new StackLL();

  int dec = 1023;
  int i = dec;
  do{
    pilha.push(i%2);
    i /= 2;
  } while (i != 0);
  
  System.out.printf("%d em binário é ==> ", dec);
  while (!pilha.isEmpty()){
    System.out.print(pilha.pop());
  }
  System.out.println();
  }
  */

  /* Teste PriorityQueue c/ vetor primitivo
	PriorityQueue fPriori = new PriorityQueue(5);
	Elemento item = new Elemento(22,6);
	Elemento item2 = new Elemento(4,2);
	Elemento item3 = new Elemento(5,0);
	Elemento item4 = new Elemento(2,1);
	Elemento item5 = new Elemento(35,7);
	fPriori.enqueue(item);
	fPriori.enqueue(item2);
	fPriori.enqueue(item3);
	fPriori.enqueue(item4);
	fPriori.enqueue(item5);
	System.out.println("Item desempilhado: "+fPriori.dequeue()+"\n");
	System.out.println("Item desempilhado: "+fPriori.dequeue()+"\n");
  */

  /* Teste Heap
   * Código copiado da apostila. Ainda não o entendi completamente.
  */

  Heap filaHeap = new Heap();
  Elemento novo = new Elemento(5,2);
  Elemento novo1 = new Elemento(6,1);
  Elemento novo2 = new Elemento(8,4);
  Elemento novo3 = new Elemento(9,3);

  filaHeap.adiciona(novo);
  filaHeap.adiciona(novo1);
  filaHeap.adiciona(novo2);
  filaHeap.adiciona(novo3);
  System.out.println("Elemento removido: " + filaHeap.remove());
  System.out.println("Elemento removido: " + filaHeap.remove());
  System.out.println("Elemento removido: " + filaHeap.remove());
  }
}