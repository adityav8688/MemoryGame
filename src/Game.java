public class Game extends DisplayBoard{
    public static void game(boolean[][] upDown, int[][] cards) {
        int noDownCards = 16;
        while (noDownCards > 0) {
            displayBoard(upDown, cards);
            System.out.println("Enter co-oridinate 1");
            String g1 = s.next();
            int g1x = Integer.valueOf(g1.substring(0, 1))-1;
            int g1y = Integer.valueOf(g1.substring(1, 2))-1;
            System.out.println(cards[g1x][g1y]);

            System.out.println("Enter co-oridinate 2");
            String g2 = s.next();
            int g2x = Integer.valueOf(g2.substring(0, 1))-1;
            int g2y = Integer.valueOf(g2.substring(1, 2))-1;
            System.out.println(cards[g2x][g2y]);
            if (cards[g1x][g1y] == cards[g2x][g2y]) {
                System.out.println("You found a match");
                upDown[g1x][g1y] = true;
                upDown[g2x][g2y] = true;
                noDownCards -= 2;
            }
        }
        displayBoard(upDown, cards);
        System.out.println("You win");
    }
}
