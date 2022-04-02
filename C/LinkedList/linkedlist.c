#include <stdio.h>
<<<<<<< HEAD
#include <stdlib.h>
=======
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
>>>>>>> a3e1bae4838ab90174bc3e280a3193b0ffb5608a
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






>>>>>>> 1961c2835200600faf0a69fe8dc3637d470ecb4f
