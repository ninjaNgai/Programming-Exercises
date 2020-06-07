import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt(); // 0
            int b = in.nextInt(); // 2
            int n = in.nextInt(); // 10

            // sn = a + (b^n * b); repeat n times

            // Series: 0 to n
            for(int j = 0; j <= n; j++) {
                int sn = a;

                for(int k = 0; k < j; k++) {
                    sn += ( int ) Math.pow(2, k) * b;
                }

                if(j >= 1) {
                    if (j != n) {
                        System.out.print(sn + " ");
                    }
                    else {
                        System.out.println(sn);
                    }
                }
            }
        }
        in.close();
    }
}
