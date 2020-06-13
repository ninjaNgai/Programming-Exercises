import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        // Create char array of unique characters
        StringBuilder sb = new StringBuilder();
        java.util.Set<Character> linkedHashSet = new java.util.LinkedHashSet<>();

        // Add characters to a combined distinct list
        a.chars().forEach(ch -> linkedHashSet.add(Character.toLowerCase((char) ch)));
        b.chars().forEach(ch -> linkedHashSet.add(Character.toLowerCase((char) ch)));

        // Compares frequency of each character
        for(Character c : linkedHashSet) {
            long countA = a.chars().filter(ch -> Character.toLowerCase(ch) == c).count();
            long countB = b.chars().filter(ch -> Character.toLowerCase(ch) == c).count();

            if(countA != countB) {
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
