import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        BigInteger bi1 = sc.nextBigInteger();
        BigInteger bi2 = sc.nextBigInteger();

        // perform add operation on bi1 using bi2
        System.out.println(bi1.add(bi2));

        System.out.println(bi1.multiply(bi2));
    }
}