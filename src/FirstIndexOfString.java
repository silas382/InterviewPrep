import java.util.ArrayList;
import java.util.List;

public class FirstIndexOfString {

    public static int strStr(String haystack, String needle) {

        if(!haystack.contains(needle)) {
            return -1;
        }

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){

            if(haystack.charAt(i) != needle.charAt(0)){
                if(haystack.substring(i, needle.length() + 1).equals( needle)){
                    return i;
                }
            }


        }

        return -1;

    }

    public static boolean isUnique (String str) {
        List<Character> charList = new ArrayList<>();
        for(int i = 0 ; i < str.length(); i++){
            if(charList.contains(str.charAt(i))){
                return false;
            }else{
                charList.add(str.charAt(i));
            }
        }
        return true;
    }

    public static void reverseString(String str){
        char[] charsArray = str.toCharArray();
        for(int i = 0; i < charsArray.length /2 ; i++) {
            char temp = charsArray[i];
            charsArray[i] = charsArray[charsArray.length - 1 - i];
            charsArray[charsArray.length - 1 - i] = temp;
        }
        String reversedString = new String(charsArray);
        System.out.println(reversedString);
    }

    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    public static String reverseManually(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String intToRoman(int num) {

        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = {
                "", "C","CC", "CCC", "CD", "D", "DC", "DCC", "DCC", "CM"
        };

        String[] tens = {
                "","X", "XX", "XXX", "L", "LX", "LXX", "LXX", "XC"
        };
        String[] units = {

                "","I", "II", "III", "IV", "VI", "VII","VIII", "IX "
        };

        return (thousands[num/1000] + hundreds[(num % 1000)/100] + tens[(num% 100)/10] + units[num%10]);
    }

    public static int reverseInteger(int num) {
        int reverse = 0;
        while(num != 0) {

            reverse = reverse * 10 + (num % 10);
            num /= 10;

            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }

        }

        return reverse;
    }

    public static int removeDuplicates(int[] sortedNums) {
        int index = 0;

        for(int i = 0 ; i < sortedNums.length; i++) {
            if(index == 0 || sortedNums[i + 1] != sortedNums[i]){
                index++;
                sortedNums[index] = sortedNums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
       // char[] charAry= {'b','c','g','e','f'};
    //    System.out.println(charAry.toString());
        System.out.println(reverseInteger(123));
    }
}
