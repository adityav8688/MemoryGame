import java.util.Random;
public class Randomizer extends Main{
    private static int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
    private static int temp, t;
    public static int[][] randomizer() {
        Random random = new Random();
        for (int j = 0; j <= 20; j++) {
            for (int x = 0; x < 16; x++) {
                t = random.nextInt(100) % 15;
                temp = num[x];
                num[x] = num[t];
                num[t] = temp;
            }
            t = 0;
            for (int r = 0; r < 4; r++)
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
