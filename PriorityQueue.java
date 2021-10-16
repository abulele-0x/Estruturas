import java.util.Arrays;

public class PriorityQueue{
  private Elemento<?>[] itens;
  private int size;
  private int capacity;

  public PriorityQueue(int capacity){
    this.size = 0;
    this.capacity = capacity;
    this.itens = new Elemento[this.capacity];
  }

  public PriorityQueue(){
    this(10);
  }

  public boolean isEmpty(){
    return this.size == 0;
  }

  public int size(){
    return this.size;
  }

  public void enqueue(Elemento<?> i){
    if (this.size + 1 > this.capacity){
      throw new RuntimeException("A fila está cheia.\n");
    }
    this.itens[size] = i;
    size++;
  }

  public Elemento<?> dequeue(){
    if (this.isEmpty()){
      throw new RuntimeException("A fila está vazia.\n");
    }
    int index = this.getPriority(); //retorna o índice do item mais prioritário da lista.

    Elemento<?> highPriority = this.itens[index]; //Elemento de maior prioridade, de acordo com o índice retornado.

    for(int i = index; i < this.size()-1; i++){
      this.itens[i] = this.itens[i+1]; //avançando todos os itens uma posição no vetor.
    }

    this.size--;
    return highPriority;
  }

  private int getPriority(){
    int p = 0;
    for(int i = 0; i < this.size(); i++){
      //Debugging
      System.out.println("Item["+p+"] = "+this.itens[p]+" | Item["+i+"] = "+this.itens[i]+"\n");
      if (this.itens[p].getPrioridade() > this.itens[i].getPrioridade())
      {
        p = i; //pega o primeiro item e compara a prioridade dele com os demais elementos do array. Se a prioridade do primeiro item 
        //Debugging
        System.out.println("Prioridade do Item[p] = "+this.itens[p].getPrioridade()+"\nPrioridade do Item[i] = "+this.itens[i].getPrioridade()+"\n");
      }
      else
      {
        //Debugging
        System.out.println("Prioridade do Item[p] = "+this.itens[p].getPrioridade()+"\nPrioridade do Item[i] = "+this.itens[i].getPrioridade()+"\n");
      }
    }
    return p;
  }

@Override
public String toString(){
  return Arrays.toString(this.itens);
}

}