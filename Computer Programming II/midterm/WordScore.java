import java.util.Scanner;
public class WordScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String txt = scan.next();
            int score = 0;
            for (int j = 0; j < txt.length(); j++) {
                char chr = txt.charAt(j);
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
            }
            System.out.println(score);
        }
    }
}
