#include <stdio.h>

int main() {
    unsigned int r, w, w_result;
    scanf("%i %i", &r, &w);
    w_result = (r * 400) + w;
    if (w_result / 400 != 0)
      printf("%i r ", (w_result / 400));
    if (w_result % 400 != 0)
      printf("%i w", (w_result % 400));
}