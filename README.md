# Satisfied Checker Program

## Description

This C program checks a single character provided as a command-line argument.
If the character is 'Y', it prints "satisfied". Otherwise, it prints "not satisfied".

## Compilation

To compile the program, use a C compiler like GCC:

```bash
gcc code.c -o code_executable
```

## Usage

Run the compiled program with a single character argument:

```bash
./code_executable <character>
```

### Examples:

1.  **Input 'Y':**
    ```bash
    ./code_executable Y
    ```
    Output:
    ```
    satisfied
    ```

2.  **Input any other character (e.g., 'N'):**
    ```bash
    ./code_executable N
    ```
    Output:
    ```
    not satisfied
    ```

3.  **Incorrect number of arguments (none or too many):**
    ```bash
    ./code_executable
    ```
    or
    ```bash
    ./code_executable A B
    ```
    Output:
    ```
    Usage: ./code_executable <character>
    ```

## Input

The program expects exactly one command-line argument. Only the first character of this argument is processed.

## Output

-   If the input character is 'Y', the program prints `satisfied` followed by a newline.
-   If the input character is not 'Y', the program prints `not satisfied` followed by a newline.
-   If the program is run with an incorrect number of command-line arguments, it prints a usage message: `Usage: ./<program_name> <character>` followed by a newline, and exits with a status code of 1.

## Source Code

The source code is located in `code.c`.
```c
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

```
