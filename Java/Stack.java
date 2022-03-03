/*
 * Só vi os nomes dos métodos, mas implementei sozinho.
 */
public class Stack{
  //atributos
  private int capacity; //capacidade da stack
  private int top; //Posição do último ítem
  private int size; // Tamanho da pilha. Vi depois que era desnecessária essa variável. Poderia ser o top.
  private int data[]; //Array onde a stack será alocada
  int retorno; //Variável p/ retornar valor do pop(). Também desnecessária, poderia retornar '--top'.

  //métodos
  public Stack(int capacity){
    this.data = new int[capacity];
    this.capacity = capacity;
    size = 0;
  }

  public boolean isEmpty(){
    return this.size == 0;
  }

  public int length(){
    return this.size;
  }

  public int top(){
    if (isEmpty())
      throw new RuntimeException("Não há itens na stack\n");
    return this.data[top];
  }
  
  public void push(int element){
    if (this.top == this.capacity){
      System.err.printf("\n\nSize: %d\nTop: %d\n\n", this.size, this.top);
      System.err.println("A fila está cheia.\n");
    }
    else
    {
    this.data[this.top++] = element;
    this.size++;
    System.out.printf("\nDebug:\n");
    System.out.printf("Top = %d\nSize = %d\n", this.top, this.size);
    }
  }

  public int pop(){
    if (isEmpty())
      throw new RuntimeException("A fila está vazia.\n");
    retorno = this.data[--top];
    this.size--;
    return retorno;
  }
  
}