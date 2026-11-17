#include <stdio.h>

// Three separate array definitions
int intStack[10];
double doubleStack[10];
char charStack[10];

int intTop = -1, doubleTop = -1, charTop = -1;

// Separate functions with unique names for each data type
void pushInt(int item) {
    intStack[++intTop] = item;
    printf("Pushed int: %d\n", item);
}

void pushDouble(double item) {
    doubleStack[++doubleTop] = item;
    printf("Pushed double: %f\n", item);
}

void pushChar(char item) {
    charStack[++charTop] = item;
    printf("Pushed char: '%c'\n", item);
}

int main() {
    // You must remember and call three completely separate function names
    pushInt(42);
    pushDouble(3.14159);
    pushChar('A');

    return 0;
}
