package HackerEarth.Algorithms.Searching.LinearSearch;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

/**
 * Time Complexity:
 * 
 * The time complexity of the linear search is O(N) because each element in an
 * array is compared only once.
 */

public class TestClass {
    public static void main(String args[]) throws Exception {
        /*
         * Sample code to perform I/O: Use either of these methods for input
         */
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 2;
        int a[] = new int[n];
        String line = br.readLine(); // to read multiple integers line
        String[] strs = line.trim().split("\\s+");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }

        int N = a[0];
        int M = a[1];

        int lastIndex = -1;
        int[] array = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == M) {
                lastIndex = i + 1;
            }
        }

        System.out.println(Integer.toString(lastIndex));
    }
}
