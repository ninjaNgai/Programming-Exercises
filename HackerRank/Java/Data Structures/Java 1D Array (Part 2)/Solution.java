import java.util.*;

public class Solution {

    /*
     * Performs a recursive DFS to check if the given game array is solvable
     * starting from the specified index
     */
    private static boolean isSolvable(int leap, int[] game, int i) {

        if (i < 0 || game[i] == 1) {
            return false;
        } else if (i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }

        /* Don't go through this node again (avoids infinite recursion) */
        game[i] = 1;

        return isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1) || isSolvable(leap, game, i + leap);
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        return isSolvable(leap, game, 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
