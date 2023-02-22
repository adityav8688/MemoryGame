public class Game extends DisplayBoard{
    private static int noDownCards = 16, g1x=0, g1y=0, g2x=0, g2y=0;
    public static void game(boolean[][] upDown, int[][] cards) {
        while (noDownCards > 0) {
            displayBoard(upDown, cards);
            System.out.println("Enter co-oridinate 1");
            String g1 = s.next();
            Integer ch = Integer.valueOf(g1);
            if((g1.length()==2)&&ch>0) {
                g1x = Integer.valueOf(g1.substring(0, 1)) - 1;
                g1y = Integer.valueOf(g1.substring(1, 2)) - 1;
                if((g1x>=0&&g1x<=3)&&(g1y>=0&&g1y<=3))
                    System.out.println(cards[g1x][g1y]);
                else {
                    System.out.println("Entered coordinates must be in the range of 1 to 4");
                    game(upDown, cards);
                }
            }else{
                System.out.println("Enter valid coordinates and positve numbers, Example: 11 = Card 1 and 22 = Card 6");
                game(upDown,cards);
            }
            System.out.println("Enter co-oridinate 2");
            String g2 = s.next();
            ch = Integer.valueOf(g2);
            if((g2.length()==2)&&ch>0) {
                g2x = Integer.valueOf(g2.substring(0, 1)) - 1;
                g2y = Integer.valueOf(g2.substring(1, 2)) - 1;
                if ((g2x >= 0 && g2x <= 3) && (g2y >= 0 && g2y <= 3))
                    System.out.println(cards[g2x][g2y]);
                else {
                    System.out.println("Entered coordinates must be in the range of 1 to 4");
                    game(upDown, cards);
                }
            }else {
                System.out.println("Enter valid coordinates and positve numbers, Example: 11 = Card 1 and 22 = Card 6");
                game(upDown, cards);
            }
            if ((cards[g1x][g1y] == cards[g2x][g2y])&&(!(g1y==g2x&&g1y==g2y))) {
                System.out.println("Hurray...! You found a match :) ");
                upDown[g1x][g1y] = true;
                upDown[g2x][g2y] = true;
                noDownCards -= 2;
            }else{
                System.out.println("Sorry, you have not found a match. please continue.\n");
            }
        }
        displayBoard(upDown, cards);
        System.out.println("You win");
    }
}