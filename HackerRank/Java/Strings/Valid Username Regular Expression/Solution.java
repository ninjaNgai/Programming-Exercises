import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
       1. The username consists of 8 to 30 characters inclusive.
          If the username consists of less than  or greater than  characters, then it is an invalid username.
       2. The username can only contain alphanumeric characters and underscores (_).
          Alphanumeric characters describe the character set
          consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
      3. The first character of the username must be an alphabetic character,
          i.e., either lowercase character [a-z] or uppercase character [A-Z].
     */

     /**
     * 1. {7,29}$ for 8-30 characters inclusive
     * 2. \\w is alphanumeric and underscores
     * 3. [A-Za-z] because first character of the username must be an alphabetic character
     */
    public static final String regularExpression = "[A-Za-z]\\w{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
