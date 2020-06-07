import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
  
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(validateN(N));
        scanner.close();
    }

    private static String validateN (int n) {
        if (n % 2 != 0) {
            return "Weird";
        }
        else if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                return "Not Weird";
            }
            else if (n >= 6 && n <= 20) {
                return "Weird";
            }
            else if (n > 20) {
                return "Not Weird";
            }
        }
        return "";
    }
}
