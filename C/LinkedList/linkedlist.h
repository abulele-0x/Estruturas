typedef struct Node {
	int value;
	struct Node *next;
}Node;

void add(Node *n, int value);
Node *getLast(Node *p);
void printList(Node *list);
