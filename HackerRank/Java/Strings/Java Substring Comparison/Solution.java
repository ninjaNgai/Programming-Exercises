import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0; i < s.length(); i++) {
            String word;

            // Checks if a substring is within the range of the string
            if(k+i <= s.length()) {
                word = s.substring(i, k+i);

                // if word comes before the smallest
                if (word.compareTo(smallest) < 0) {
                    smallest = word;
                }

                // if word comes after the largest
                if (word.compareTo(largest) > 0) {
                    largest = word;
                }

            }
        }

        return smallest + "\n" + largest;
    }
}
