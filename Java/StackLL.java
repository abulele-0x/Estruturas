/*
 * Implementação de uma stack usando Linked List
 * Come back to this exercise after the classes on OOP. Missing concepts to fully grasp it.
 */

 public class StackLL{
   //atributos
   public LinkedList atual;
   public int size = 0;
   
   public int pop(){
    if (this.isEmpty())
      throw new RuntimeException("A fila está vazia.\n");
    LinkedList removed = this.atual;
    size--;
    this.atual = this.atual.getNext();
    return removed.value;
    
   }

   public void push(int element){
     LinkedList newElement = new LinkedList(element, null);
    if (this.isEmpty())
      this.atual = newElement;
    else
    {
      newElement.setNext(this.atual); //o atributo next passa a ser o objeto anterior
      this.atual = new LinkedList();
      this.atual = newElement; //o que apontava p/ objeto anterior, passa a apontar p/ o novo atual
    }
     size++;

   }

   public boolean isEmpty(){
    return this.atual == null;
   }

@Override
public String toString(){
  StringBuilder sb = new StringBuilder("[");
  if (!this.isEmpty()){
    LinkedList e = this.atual;
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