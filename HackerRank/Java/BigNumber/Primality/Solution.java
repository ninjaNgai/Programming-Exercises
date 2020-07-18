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
        String n = scanner.nextLine();
        scanner.close();

        BigInteger a = new BigInteger(n);

        // When certainty is one,
        // it will check number for prime or composite
        String result = a.isProbablePrime(1) ? "prime" : "not prime";

        System.out.println(result);

    }
}
