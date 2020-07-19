
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        HashMap<String, Integer> phoneMap = new HashMap<String, Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneMap.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneMap.containsKey(s)) {
                System.out.printf("%s=%d\n", s, phoneMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
