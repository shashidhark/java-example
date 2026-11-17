#include <stdio.h>

// Function definition
int addNumbers(int a, int b) {
    int sum = a + b;
    return sum; // Returns an integer value
}

int main() {
    // Calling the defined function
    int result = addNumbers(5, 7);
    printf("Result: %d\n", result);
    return 0;
}
