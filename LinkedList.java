/*
 * Esta é a classe auxiliar, que implementa a Linked List a ser usada na Stack
*/
public class LinkedList{
  //atributos
  public int value; //valor do item atual
  public LinkedList anterior; //item anterior da lista
  
  public LinkedList(){
    this.value = -1;
    this.anterior = null;
  }

  public LinkedList(int value, LinkedList anterior){
    this.value = value;
    this.anterior = null;
  }

  public int getValue(){
    return this.value;
  }

  public void setNext(LinkedList anterior){
    this.anterior = anterior;
  }

  public LinkedList getNext(){
    return this.anterior;
  }

}