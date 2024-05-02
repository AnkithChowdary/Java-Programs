#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

// Node structure
struct node {
    char data;
    struct node *left, *right;
};

// Helper function to create a new node
struct node *newNode(char data) {
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    temp->data = data;
    temp->left = temp->right = NULL;
    return temp;
}

// Check if a character is an operator
int isOperator(char c) {
    return (c == '+' || c == '-' || c == '*' || c == '/');
}

// Function to construct an expression tree from a postfix expression
struct node *constructExpressionTree(char postfix[]) {
    struct node *stack[100]; // Stack to hold nodes
    int top = -1;

    for (int i = 0; postfix[i]; i++) {
        if (isdigit(postfix[i])) {  // If operand, create a node and push
            stack[++top] = newNode(postfix[i]);
        } else if (isOperator(postfix[i])) { 
            // If operator, pop two operands, create a node with the operator, and push 
            struct node *op = newNode(postfix[i]);
            op->right = stack[top--];
            op->left = stack[top--];
            stack[++top] = op;
        }
    }

    // The final node remaining on the stack is the root
    return stack[top];
}

// Recursive function to print the expression tree in boxes
void printExpressionTree(struct node* root, int space) {
    if (root == NULL) {
        return;
    }

    // Increase distance between levels
    space += 5;

    // Print right child first
    printExpressionTree(root->right, space);

    // Print current node after space
    printf("\n");
    for (int i = 5; i < space; i++) {
        printf(" ");
    }
    printf("%c\n", root->data);

    // Print left child
    printExpressionTree(root->left, space);
}

int main() {
    char postfix[] = "53+62/*";
    struct node *root = constructExpressionTree(postfix);

    printf("Expression Tree:\n");
    printExpressionTree(root, 0);

    return 0;
}
