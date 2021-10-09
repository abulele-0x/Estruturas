/*
 * Esta é a classe auxiliar, que implementa a Linked List a ser usada na Stack
*/
public class LinkedList{
  //atributos
  public int value; //valor do item atual
  public LinkedList next; //item anterior da lista
  
  public LinkedList(){
    this.value = -1; //Por que isso?
    this.next = null;
  }

  public LinkedList(int value, LinkedList next){
    this.value = value; 
    this.next = next; //Este apontará para o objeto anterior
  }

  public int getValue(){
    return value;
  }

  public void setNext(LinkedList next){
    this.next = next;
  }

  public LinkedList getNext(){
    return next;
  }

}