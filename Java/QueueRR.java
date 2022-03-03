public class QueueRR{
  private final int[] data;
  private final int capacity;
  private int first;
  private int last;
  private int size;
  private int prima;

  public QueueRR(int capacity){
    this.capacity = capacity;
    this.data = new int[this.capacity];
    this.first = 0;
    this.last = 0;
    this.size = 0;
  }

  public QueueRR() {
    this(10);
  }

  public boolean isEmpty(){
    return this.first == this.last && this.size == 0;
  }

  public int length(){
    return this.size;
  }

  public int first(){
    return this.data[this.first];
  }

  public void enqueue(int element){
    if (this.size == this.capacity){
      throw new RuntimeException("A fila está cheia.\n");
    }
    this.data[this.last] = element;
    this.last = (this.last + 1) % this.capacity;
    this.size++;
  }

  public int dequeue(){
    if (this.data[this.first] == -1)
      throw new RuntimeException("A fila está vazia.\n");
    else
      prima = this.data[this.first];
      this.data[this.first] = -1;
      this.first = (this.first + 1) % this.capacity;
      this.size--;
      return prima;
  }

}

/*
 * Eu não estava entendendo pra que servia o módulo (%)
 * Agora entendi por que, ao definir o último elemento, se usa o módulo.
 * Ele reinicia a contagem dos índices, como se fosse, realmente, uma roda girando.
 * Supondo uma fila com capacidade para 3 itens - 0, 1 e 2.
 * Se eu adiciono o item 1 na fila. O índice do primeiro elemento é [0] e o último é [0]
 * Se eu adiciono, agora, o item 2 - o índice do primeiro é [0] e o último é [1]
 * Sempre que se adiciona um item, é adicionado +1 no índice e tirado o módulo. O módulo sempre vai ser o próprio número do índice, a menos que o último item seja igual à capacidade da fila, aí vai dar o último índice dividido por ele mesmo, com resto 0. Esse resto é o que definirá o valor do índice, retornando a contagem a zero.
*/