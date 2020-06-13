import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		while(testCases>0){
			String patternStr = in.nextLine();
          	//Write your code
            try {
                Pattern pattern = Pattern.compile(patternStr);
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
                testCases -= 1;
                continue;
            }
            System.out.println("Valid");
            testCases -= 1;
		}
	}
}
