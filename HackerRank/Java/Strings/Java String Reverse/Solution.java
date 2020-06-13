import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder reverseBuilder = new StringBuilder();

        // append a string into StringBuilder reverseBuilder
        reverseBuilder.append(A);

        // reverse StringBuilder reverseBuilder
        reverseBuilder = reverseBuilder.reverse();

        System.out.println( A.equals(reverseBuilder.toString()) ? "Yes" : "No");
    }
}
