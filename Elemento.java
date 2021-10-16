//Primeiramente, cria-se uma classe para armazenar o item da fila e sua prioridade. Uma classe genérica.

public class Elemento<T>{
  public T item; //Tipo T não especifica se o dado é int, string...
  private int prioridade;

  public Elemento(T item, int prioridade){
    this.item = item;
    this.prioridade = prioridade;
  }

  public T getValor(){
    return this.item;
  }

  public int getPrioridade(){
    return this.prioridade;
  }

@Override
public String toString(){
  return String.format("(%s - %d)", this.item.toString(), this.prioridade);
}

}
