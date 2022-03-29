#include <stdio.h>
#include "linkedlist.h"

int main()
{
	Node lista = {.value = 1, .next = NULL};
	printf("Primeiro item: %p\n", &lista);
	int valor = 0;

	do
	{
		printf("Adicione um número. -1 para sair: ");
		scanf("%d", &valor);
		add(&lista, valor);
	}while (valor != -1);
	return 0;
}
