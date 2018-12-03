#include<stdio.h>
#include<stdlib.h>

struct listnode {
    int data;
    struct listnode *next;
} *node1, *node2;
struct listnode *head;

void printList(struct listnode *head);

int main() {
    node1 = malloc(sizeof(struct listnode));
    node2 = malloc(sizeof(struct listnode));
    
    node1->data = 1;
    node1->next = node2;
    node2->data = 2;

    printList(head);
}

void printList(struct listnode *head) {
    printf("data: %d\n", (head->data));
    if(head->next == NULL) return;
    printList(head->next);
}
