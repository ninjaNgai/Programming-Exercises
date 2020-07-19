import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        ArrayList<int[]> arrayOfList = new ArrayList();

        for (int i = 0; i < n; i++) {
            int[] array = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            arrayOfList.add(array);
        }

        int q = in.nextInt();
        in.nextLine();

        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            in.nextLine();

            int[] arr = arrayOfList.get(x - 1);
            List<Integer> retrievedList = Arrays.stream(arr).boxed().collect(Collectors.toList());

            if (y < retrievedList.size()) {
                System.out.println(retrievedList.get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}