#include <stdio.h>

int main() {
    char name[50];
    int units;
    printf("Enter student name: ");
    scanf("%s", name);
    printf("Enter number of registered units: ");
    scanf("%d", &units);

    printf("\n--- Final Summary ---\nStudent Name: %s\nUnits: %d\n", name, units);
    if (units > 7) {
        printf("Status: Overload - Approval Required\n");
    } else {
        printf("Status: Registration Accepted\n");
    }
    return 0;
}
