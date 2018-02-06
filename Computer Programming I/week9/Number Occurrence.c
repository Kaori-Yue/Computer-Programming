#include <stdio.h>
#include <stdbool.h>

int main() {
	int n, focus;
	bool isFound = 0;
	scanf("%i", &n);
	int range[n];
	for(int i=0; i<n; i++) scanf("%i", &range[i]);
	scanf("%i", &focus);
	for(int i=0; i<n; i++) if (focus == range[i]) { isFound = 1; printf("%i ", i+1); }
	if (!isFound) printf("0");
}