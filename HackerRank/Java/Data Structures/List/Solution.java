import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);

        /* Add initial elements to the list */
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        // Queries
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            in.nextLine();
            String query = in.nextLine();

            if (query.equals("Insert")) {
                list.add(in.nextInt(), in.nextInt());
            } else if (query.equals("Delete")) {
                list.remove(in.nextInt());
            }
        }

        list.stream().forEach(s -> System.out.print(s + " "));
    }
}