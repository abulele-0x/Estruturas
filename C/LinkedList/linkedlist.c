#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"

void add(Node **n, int value)
{
	Node *item = malloc(sizeof(Node));
	item->value = value;
	item->next = NULL;
	printf("\n\nitem alocado em: %p\n", item);
	if (*n == NULL)
	{
		*n = item;
		return;
	}

	Node *last = getLast(*n);
	last->next = item;
}

Node *getLast(Node *p)
{
	if (p->next == NULL) 
	{
		return p;
	}
	
	return getLast(p->next);
}

void printList(Node *list)
{
	Node *i = list;
	while (1)
	{
		if (i == NULL)
		{
			printf("Lista vazia.\n");
			break;
		}

		printf("%d ", i->value);
		i = i->next;
	}
}
