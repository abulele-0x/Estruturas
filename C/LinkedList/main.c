#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"

int main()
{
	Node *lista = malloc(sizeof(Node));
	int valor = 0;

	do
	{
		printf("Adicione um número. -1 para sair: ");
		scanf("%d", &valor);
		add(lista, valor);
	}while (valor != -1);

	printList(lista);
	return 0;
}
