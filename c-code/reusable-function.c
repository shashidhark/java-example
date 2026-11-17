#include <stdio.h>

// 1. FUNCTION DECLARATIONS (PROTOTYPES)
int calculate_cube(int number);
void print_welcome_message(char user_name[]);

int main() {
    // ---- Reusing 'calculate_cube' with different inputs ----
    int num1 = 3;
    int result1 = calculate_cube(num1); // First call
    printf("The cube of %d is: %d\n", num1, result1);

    int num2 = 7;
    int result2 = calculate_cube(num2); // Second call (reusing the logic)
    printf("The cube of %d is: %d\n", num2, result2);
    
    printf("The cube of 10 is: %d\n\n", calculate_cube(10)); // Third call

    // ---- Reusing 'print_welcome_message' ----
    print_welcome_message("Alice"); // First call
    print_welcome_message("Bob");   // Second call

    return 0;
}

// 3. FUNCTION DEFINITIONS

/**
 * Calculates the cube of a given integer.
 * @param number The integer to multiply.
 * @return The cubed result.
 */
int calculate_cube(int number) {
    int cube = number * number * number;
    return cube; // Sends the result back to the caller
}

/**
 * Prints a customized greeting. 
 * Uses 'void' because it performs an action but returns no value.
 */
void print_welcome_message(char user_name[]) {
    printf("Hello,\n");
    printf("%s! Welcome back.\n", user_name);
    printf("This is your java class.\n");
    printf("You will be learning OOP concepts and more.\n");
}
