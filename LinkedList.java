public class LinkedList{
  //atributos
  public int value;
  public LinkedList next;
  
  public LinkedList(){
    this.value = -1;
    this.next = null;
  }

  public LinkedList(int value, LinkedList next){
    this.value = value;
    this.next = next;
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