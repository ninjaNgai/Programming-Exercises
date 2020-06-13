import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        long countA;
        long countB;

        // Create char array of unique characters
        StringBuilder sb = new StringBuilder();
        java.util.Set<Character> linkedHashSet = new java.util.LinkedHashSet<>();

        for (int i = 0; i < a.length(); i++) {
            linkedHashSet.add(a.charAt(i));
        }

        for(Character c : linkedHashSet) {
            countA = a.chars().filter(ch -> Character.toLowerCase(ch) == c).count();
            countB = b.chars().filter(ch -> Character.toLowerCase(ch) == c).count();

            if (countA != countB) {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
