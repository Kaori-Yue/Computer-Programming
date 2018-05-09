
import java.util.Scanner;

public class WordOnBoard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tableScore[][] = {
            {33, 0, 0, 2, 0, 0, 0, 33, 0, 0, 0, 2, 0, 0, 33},
            {0, 22, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 22, 0},
            {0, 0, 22, 0, 0, 0, 2, 0, 2, 0, 0, 0, 22, 0, 0},
            {2, 0, 0, 22, 0, 0, 0, 2, 0, 0, 0, 22, 0, 0, 2},
            {0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 22, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0},
            {0, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 0},
            {33, 0, 0, 2, 0, 0, 0, 222, 0, 0, 0, 2, 0, 0, 33},
            {0, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 0},
            {0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 3, 0},
            {0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 22, 0, 0, 0, 0},
            {2, 0, 0, 22, 0, 0, 0, 2, 0, 0, 0, 22, 0, 0, 2},
            {0, 0, 22, 0, 0, 0, 2, 0, 2, 0, 0, 0, 22, 0, 0},
            {0, 2, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 22, 0},
            {33, 0, 0, 2, 0, 0, 0, 33, 0, 0, 0, 2, 0, 0, 33}};
        //
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            char C = scan.next().charAt(0);
            int R = scan.nextInt();
            char cmd = scan.next().charAt(0);
//            System.out.println("cmd: " + cmd);
            String str = scan.next();
            int scoreAll = 0;
            int multi3 = 0;
            int multi2 = 0;
            for (int j = 0; j < str.length(); j++) {
                char chr = str.charAt(j);
                int score = 0;
                //
                if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'L' || chr == 'N' || chr == 'O' || chr == 'R' || chr == 'S' || chr == 'T' || chr == 'U')
                    score += 1;
                if (chr == 'D' || chr == 'G')
                    score += 2;
                if (chr == 'B' || chr == 'C' || chr == 'M' || chr == 'P')
                    score += 3;
                if (chr == 'F' || chr == 'H' || chr == 'V' || chr == 'W' || chr == 'Y')
                    score += 4;
                if (chr == 'K')
                    score += 5;
                if (chr == 'J' || chr == 'X')
                    score += 8;
                if (chr == 'Q' || chr == 'Z')
                    score += 10;
                //
                if (cmd == '|') {
                    // Horizontal
                    int cost = tableScore[letterToIndex(C) - 1][(R - 1) + j];
                    if (cost == 2)
                        score *= 2;
                    else if (cost == 3)
                        score *= 3;
                    //
                    if (cost == 22 || cost == 222)
                        multi2++;
                    else if (cost == 33)
                        multi3++;
                    scoreAll += score;
                } else {
                    // Vertical
                    int cost = tableScore[(letterToIndex(C) - 1) + j][R - 1];
                    if (cost == 2)
                        score *= 2;
                    else if (cost == 3)
                        score *= 3;
                    //
                    if (cost == 22 || cost == 222)
                        multi2++;
                    else if (cost == 33)
                        multi3++;
//                    System.out.println(score);
                    scoreAll += score;
                }
            }
//            System.out.println("3: " + multi3);
//            System.out.println("2: " + multi2);
            for (int k = 0; k < multi3; k++)
                scoreAll *= 3;
            for (int k = 0; k < multi2; k++)
                scoreAll *= 2;
            System.out.println(scoreAll);
        }

        //
    }

    public static int letterToIndex(char chr) {
        String str = String.valueOf(chr);
        return str.codePointAt(0) - 64;
    }
}
