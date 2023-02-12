
import java.util.Random;
import java.util.Scanner;
public class Main {
    static int[][] cards = new int[4][4];
    static boolean upDown[][] = new boolean[4][4];
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the memory matching game!");
        System.out.println("Enter the card coordinate for each card when promted to.");
        System.out.println("For Example, 11 = Card 1 and 12 = Card 2.\n\n");
        setup();
        Game.game(upDown, cards);
    }
    public static void setup() {
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 4; a++) {
                upDown[i][a]=false;
            }
        }
        cards = Randomizer.randomizer(); //Shuffle cards
    }
}