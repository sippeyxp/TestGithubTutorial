#include <stdio.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("Usage: %s <character>\n", argv[0]);
        return 1; // Indicate an error
    }
    char c = argv[1][0]; // Get the first character of the first argument
    if (c == 'Y') {
        printf("satisfied\n");
    } else {
        printf("not satisfied\n");
    }
    return 0;
}
