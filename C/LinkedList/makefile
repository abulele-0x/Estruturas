linkedlist.o: linkedlist.c linkedlist.h
	gcc -c linkedlist.c linkedlist.h
main.o: linkedlist.h main.c
	gcc -c main.c linkedlist.h
list: main.o linkedlist.o
	gcc main.o linkedlist.o -o list
