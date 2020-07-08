import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        // Write your code here
        HashSet set = new HashSet();

        for (int j = 0; j < pair_left.length; j++) {
            // Since (a,b) is not the same as (b,a), we can concatenate these two strings
            // and delimit by a comma
            set.add("(" + pair_left[j] + ", " + pair_right[j] + ")");
            System.out.println(set.size());
        }

    }
}