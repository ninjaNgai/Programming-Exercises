import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
        String data = sn.nextLine();
        String hash = getSHA256Hash(data);
        System.out.println(hash);
    }

    /**
     * Returns a hexadecimal encoded SHA-256 hash for the input String.
     * @param data
     * @return
     */
    private static String getSHA256Hash(String data) {
        String result = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            return bytesToHex(hash); // make it printable
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    /**
     * Use javax.xml.bind.DatatypeConverter class in JDK to convert byte array
     * to a hexadecimal string. Note that this generates hexadecimal in upper case.
     * @param hash
     * @return
     */
    private static String bytesToHex(byte[] hash) {
        return DatatypeConverter.printHexBinary(hash).toLowerCase();
    }
}
