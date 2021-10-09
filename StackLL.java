/*
 * Implementação de uma stack usando Linked List
 */

 public class StackLL{
   //atributos
   private LinkedList top;
   private int size;
   
   public LinkedList pop(){
    if (this.isEmpty())
      throw new RuntimeException("Stack empty.\n");
    LinkedList removed = this.top;
    System.out.printf("getNext() pré pop: %d\n", this.top.getNext().value);
    this.top = this.top.getNext(); 
    System.out.printf("getNext() pós pop: %d\n", this.top.getNext().value);
    System.out.printf("Item do topo, após remoção: %d", this.top.value);
    this.size--;
    System.out.printf(" | Tamanho atual: %d\n\n", this.size);
    return removed;
   }

   public void push(int element){
     LinkedList novo = new LinkedList(element, null);
     if (this.isEmpty())
     {
      this.top = novo;
      System.out.printf("Novo item adicionado: %d", this.top.value);
     }
     else
     {
      novo.setNext(this.top); //Entendi! O novo item aponta pro item anterior. É uma Linked List que vai ao contrário. Por isso o getNext retorna o item anterior.
      this.top = new LinkedList();
      this.top = novo;
      System.out.printf("Novo item adicionado: %d", this.top.value);
     }
     this.size++;
     System.out.printf(" | Tamanho atual: %d\n", this.size);
   }

   public boolean isEmpty(){
     return this.top == null;
   }

@Override
public String toString(){
  StringBuilder sb = new StringBuilder("[");
  if (!this.isEmpty()){
    LinkedList e = this.top;
    while (e != null){
      sb.append(e.getNext());
      if (e.getNext() != null)
        sb.append(", ");
      e = e.getNext();
    }
  }
  sb.append("]");
  return sb.toString();
}
 }