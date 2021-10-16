import java.util.*;

public class Heap{
	private List<Elemento<?>> itens = new ArrayList<Elemento<?>>();

	public int tamanho(){
		return this.itens.size();
	}

	public boolean isEmpty(){
		return this.itens.isEmpty();
	}

	public void adiciona(Elemento<?> i){
		this.itens.add(i);
		this.siftUp(this.itens.size()-1);
	}

	public Elemento<?> remove(){
		Elemento<?> removido = this.itens.get(0);
		this.itens.set(0, this.itens.get(this.itens.size() - 1));
		this.itens.remove(this.itens.size() - 1);
		this.siftDown(0);
		return removido;
	}

	private void siftUp(int n){
		if (n > 0){
			int pai = Math.floorDiv(n,2); //índice do item recém-adicionado dividido por 2 (arredonda pra baixo)
			/*
			Array = [(5,0), (6,3), (7,6)] --> sendo que o primeiro item é o valor e o segundo é a prioridade
			Adicionar: (6,2) --> Instância do objeto Elemento.
			pai = 3 / 2 --> 1 (arrendondando pra baixo)
			O PAI VAI SEMPRE SER DOIS ELEMENTOS ANTES PORQUE ELE É PAI DE DOIS ELEMENTOS! (a menos que ele seja o indice 0 ou 1, esses serão pais deles mesmos, mas não faz diferença porque o siftUp é recursivo!)
			Entendiiiiii essa porra
			*/
			if(this.itens.get(n).getPrioridade() >
				this.itens.get(pai).getPrioridade()){
					this.swap(n, pai);
					this.siftUp(pai); //o elemento novo passou a tomar o lugar do que era o pai. Agora o siftUp roda de novo
				}
		}
	}

	private void siftDown(int n) {
		int esquerda = 2 * n + 1;
		int direita = 2 * n + 2;
		int maior = n;

		if((esquerda < this.itens.size()) && this.itens.get(esquerda).getPrioridade() >= this.itens.get(maior).getPrioridade()) {
			maior = esquerda;
		}
		else if((direita < this.itens.size()) && this.itens.get(direita).getPrioridade() >= this.itens.get(maior).getPrioridade())
		{
			maior = direita;
		}

		if (maior != n){
			this.swap(n, maior);
			this.siftDown(maior);
		}
	}

	private void swap(int a, int b){
		Elemento<?> temp = this.itens.get(a);
		this.itens.set(a, this.itens.get(b));
		this.itens.set(b, temp);
	}

	@Override
	public String toString(){
		return this.itens.toString();
	}
}