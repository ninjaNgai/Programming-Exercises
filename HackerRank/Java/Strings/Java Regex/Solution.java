import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    // Regex for digit from 0 to 255.
    String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

    // Regex for a digit from 0 to 255 and
    // followed by a dot, repeat 4 times.
    // this is the regex to validate an IP address.
    String pattern = zeroTo255 + "\\."
        + zeroTo255 + "\\."
        + zeroTo255 + "\\."
        + zeroTo255;
}
