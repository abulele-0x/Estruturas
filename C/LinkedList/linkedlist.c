#include <stdio.h>
#include <stdlib.h>
#include "linkedlist.h"

void add(Node *n, int value)
{
	//check if last node is empty
	Node *p = malloc(sizeof(Node));
	Node novo = {.value = value, .next = NULL};
	*p = novo;
	printf("Endereço novo node: %p\n\n", p);
	
	if(*n == NULL)
	{
		*n = *p;
		return;
	}
	
	if (n->next == NULL)
	{
		n->next = p;
		return;
	}
	
	//otherwise, calls getLast to get a pointer to last node added to the list.
	Node *last = getLast(n); //pointer to last node
	last->next = p; //assigns new node's address to last node's 'next' pointer.

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
	while (list->next != NULL)
	{
		printf("Valor: %d\n", list->value);
		list = list->next;
	}
}






