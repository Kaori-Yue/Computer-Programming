#include <stdio.h>

typedef struct {
    int id;
    char name[52];
    int salePrice;
    int basePrice;
    int count;
} BOOK;

int main() {
    int n, p;
    scanf("%i", &n);
    BOOK books[n];
    for (int i = 0; i < n; i++) {
        scanf("%i %[^\n] %i %i", &books[i].id, books[i].name, &books[i].salePrice, &books[i].basePrice);
        books[i].count = 0;
        books[i].name[strlen(books[i].name) - 1] = 0;
    }
    // printf("%s", books[2].name);
    // return;
    scanf("%i", &p);
    for (int i = 0; i < p; i++) {
        int target; // 1 = buy, 2 = info
        scanf("%i", &target);
        // printf("%i ", i);
        if (target == 1) {
            // buy
            int id, query;
            scanf("%i %i", &id, &query);
            for (int j = 0; j < n; j++) {
                if (books[j].id == id)
                    books[j].count += query;
            }
        } else {
            // info
            int id, err = 0;
            scanf("%i", &id);
            for (int j = 0; j < n; j++) {
                if (books[j].id == id)
                    printf("%i %s %i %i %i\n", books[j].id, books[j].name, books[j].count, books[j].count * books[j].salePrice, (books[j].count * books[j].salePrice) - (books[j].count * books[j].basePrice));
                else
                    err++;
            }
            if (err == n)
                printf("Error\n");
        }
    }
}