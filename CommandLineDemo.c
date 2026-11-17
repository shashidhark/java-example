#include <stdio.h>
#include <stdlib.h> // Required for atoi()

int main(int argc, char *argv[]) {
    // 1. Check if the user provided the correct number of arguments
    // (Program name + Name + Age = 3 arguments total)
    if (argc != 3) {
        printf("Error: Expected 2 arguments (Name and Age).\n");
        printf("Usage: %s <name> <age>\n", argv[0]);
        return 1; // Return error code
    }

    // 2. Access arguments (Note: All arguments are received as strings)
    char *name = argv[1];
    
    // Convert the age string into an integer using atoi()
    int age = atoi(argv[2]); 

    // 3. Print the results
    printf("Hello, %s!\n", name);
    printf("Next year, you will be %d years old.\n", age + 1);

    return 0;
}
