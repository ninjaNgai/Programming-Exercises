import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        try {

            System.out.println(scan.nextInt() / scan.nextInt());
        }
        catch (InputMismatchException i) {
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException a) {
            System.out.println(a);
        }

    }
}
