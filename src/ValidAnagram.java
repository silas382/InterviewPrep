import java.util.Arrays;
import java.util.Collections;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sCharAry = s.toCharArray();
        char[] tCharAry = t.toCharArray();

        Arrays.sort(sCharAry);
        Arrays.sort(tCharAry);

        return Arrays.equals(sCharAry, tCharAry);
    }

    public static void main(String[] args) {
        System.out.println( isAnagram("ac", "ca"));
    }

}
