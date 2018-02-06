#include <stdio.h>
#include <stdlib.h>

int main() {
	int n, sum = 0;
	scanf("%i", &n);
	int arr[n][n];
	for(int i=0; i<n; i++)
		for (int j=0; j<n; j++)
			scanf("%i", &arr[i][j]);

	for(int i=0; i<n; i++)
		for (int j=i; j<n; j++)
			if (i != j) sum += abs(arr[i][j] - arr[j][i]);
	printf("%i", sum);
}