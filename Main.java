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
  */
  StackLL pilha = new StackLL();

  pilha.push(5);
  pilha.push(3);
  pilha.push(6);
  pilha.push(5);
  System.out.println();
  pilha.pop();
  pilha.pop();
  pilha.pop();
  
  }
}