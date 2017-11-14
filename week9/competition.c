#include <stdio.h>

int main() {
	int n, team1_w = 0, team2_w = 0;
	scanf("%i", &n);
	int team1[n], team2[n];
	for(int i=0; i<n; i++) scanf("%i", &team1[i]);
	for(int i=0; i<n; i++) scanf("%i", &team2[i]);
	for(int i=0; i<n; i++) {
		if (team1[i] > team2[i]) team1_w += 2;
		else if (team1[i] < team2[i]) team2_w += 2;
		else team1_w++ & team2_w++;
	}
	if(team1_w > team2_w) printf("Team 1 wins\nScore %i to %i", team1_w, team2_w);
	else if(team1_w < team2_w) printf("Team 2 wins\nScore %i to %i", team2_w, team1_w);
	else printf("Draw game\nScore %i to %i", team1_w, team2_w);
}