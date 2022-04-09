#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"

int main()
{
	Node *node = NULL;
	Node **lista = &node;
	int valor;
	printf("Endereço de *node antes do call: %p\n", node);
	do
	{
		printf("Adicione um número. -1 para sair: ");
		scanf("%d", &valor);
		add(lista, valor);
	}while (valor != -1);

	printf("Endereço de *node depois do call: %p\n", node);
	printList(*lista);
	return 0;
}
