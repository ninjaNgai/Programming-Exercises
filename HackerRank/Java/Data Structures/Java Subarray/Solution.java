import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        try (final Scanner in = new Scanner(System.in)) {
            final int n = in.nextInt();
            final int[] arr = IntStream.generate(in::nextInt).limit(n).toArray();
            final long count = IntStream.rangeClosed(1, n)
                    .flatMap(m -> IntStream.rangeClosed(0, n - m).map(i -> IntStream.of(arr).skip(i).limit(m).sum()))
                    .filter(sum -> sum < 0).count();
            System.out.println(count);
        }
    }
}
