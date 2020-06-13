import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        str = str.trim();

        if (str.length() > 400000) {
            return;
        } else if (str.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] tokens = str.split("[^A-Za-z]+"); // consecutive letters

        System.out.println(tokens.length);
        for (String t : tokens) {
            System.out.println(t);
        }
    }
}
