#include <stdio.h>
<<<<<<< HEAD
	
typedef struct node
{ 
	int value;
	node next;
} node;

int main()
{
	node thing = {10, NULL};
	
}

void add(node pai, node proximo)
{
	
}
=======
#include "linkedlist.h"

void add(Node *n, int value)
{
	//verifica se primeiro node está vazio
	Node novo = {.value = value, .next = NULL};
	printf("Endereço novo node: %p\n\n", &novo);
	if (n->next == NULL) 
	{
		n->next = &novo;
		puts("");
		printf("***PRIMEIRO ITEM***\n");
		printf("Endereço novo item: %p\n\n", n->next);
		return;
	}
	
	//caso contrário, chama o getLast pra descobrir o último.
	Node *last = getLast(n);
	printf("\nEndereço recebido de getLast: %p\n", last);
	printf("Último valor adicionado: %d\n", last->value);	
}

Node *getLast(Node *p)
{
	printf("\n*******************************\n");
	printf("Dentro de getLast:\n");
	printf("Endereço atual: %p\n\n", p);
	printf("*******************************\n");

	if (p->next == NULL) 
	{
		printf("\t%p é NULL\n", &(p->next));
		printf("\tp->next offset de %ld bytes\n", p->next - p);
		printf("*******************************\n\n");
		return p;
	}

	printf("\n\tp não deu null, retornando endereço %p\n", &(p->next));
	printf("*******************************\n\n");
	return getLast(p->next);
}






>>>>>>> 1961c2835200600faf0a69fe8dc3637d470ecb4f
