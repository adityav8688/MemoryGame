import java.util.Random;

public class Randomizer extends Main{
    public static int[][] randomizer() {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        int cards[][] = new int[4][4];
        Random random = new Random();
        int temp, t;
        for (int j = 0; j <= 20; j++) {
            for (int x = 0; x < 16; x++) { //Randomize the card order
                t = random.nextInt(1000) % 15;
                temp = num[x];
                num[x] = num[t];
                num[t] = temp;

            }
            t = 0;
            for (int r = 0; r < 4; r++) // Cards receive Numbers
            {
                for (int s = 0; s < 4; s++) {
                    cards[r][s] = num[t];
                    t = t + 1;
                }
            }

        }
        return cards;
    }
}
