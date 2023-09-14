import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    public static boolean isAnagram(String str1, String str2) {

        HashMap<Character, Integer> frequencyOne = new HashMap<>();
        HashMap<Character, Integer> frequencyTwo = new HashMap<>();

        for(int i = 0; i < str1.length(); i++) {
            if(!frequencyOne.containsKey(str1.charAt(i))){
                frequencyOne.put(str1.charAt(i), 1);
            }else{
                frequencyOne.put(str1.charAt(i), frequencyOne.get(str1.charAt(i))+1);
            }
        }

        for(int i = 0; i < str2.length(); i++) {
            if(!frequencyTwo.containsKey(str2.charAt(i))){
                frequencyTwo.put(str2.charAt(i), 1);
            }else{
                frequencyTwo.put(str2.charAt(i), frequencyTwo.get(str2.charAt(i))+1);
            }
        }

        for(Character character: frequencyOne.keySet()){
            if(!frequencyTwo.containsKey(character) || frequencyTwo.get(character) != frequencyOne.get(character)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String str1 = "bofed";
        String str2 = "robed";

        System.out.println(str1 +" and  " + str2 + " anagrams?:" + isAnagram(str1, str2) );
    }


}
