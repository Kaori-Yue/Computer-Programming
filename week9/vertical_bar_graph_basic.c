#include <stdio.h>

int compare(const void *a, const void *b);

int main() {
	int n;
	scanf("%i", &n);
	int scope[n], sort[n];
	for(int i=0; i<n; i++) {
		scanf("%i", &scope[i]);
		sort[i] = scope[i];
	}
	qsort(sort, n, sizeof(int), compare);
	for (int i=0; i<sort[0]; i++) {
		for(int j=0; j<n; j++) {
			printf("%s", i+scope[j] >= sort[0] ? "*" : " ");
		}
	printf("\n");
	}
}

int compare(const void *a, const void *b) {
	return ( *(int*)b - *(int*)a);
}