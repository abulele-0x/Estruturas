public class Queue{
  private final int[] data;
  private final int capacity;
  private int end;

  public Queue(int capacity){
    this.capacity = capacity;
    this.data = new int[this.capacity];
    this.end = 0;
  }

  public boolean isEmpty(){
    return this.end == 0;
  }

  public int length(){
    return this.end;
  }

  public int first(){
    return this.data[0];
  }

  public void enqueue(int element){
    if (this.end == this.capacity)
      throw new RuntimeException("A fila está em sua capacidade máxima");
    else
      this.data[this.end++] = element;
  }

  public int dequeue(){
    if (this.isEmpty())
      throw new RuntimeException("A fila está vazia");
    else
    {
      int first = this.data[0];
      for (int i = 0; i < this.end - 1; i++){
        this.data[i] = this.data[i+1];
      }
      this.end--;
      return first;
    }
  }

}