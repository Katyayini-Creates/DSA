package Array;

import java.util.HashMap;

public class LC1832_CheckPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean result = check(sentence);
        if (result) {
            System.out.println("Pangram.");
        }
        else {
            System.out.println("Not Pangram.");
        }
    }
    static boolean check(String sentence) {
        int length = sentence.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char ch = sentence.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            }
        }
        return map.size() == 26;
    }
}

//Brute-Force Approach
//class Solution {
//    public boolean checkIfPangram(String sentence) {
//        int counter = 0;
//        for (char i = 'a'; i <= 'z'; i++) {
//            for (int j = 0; j < sentence.length(); j++) {
//                if (i == sentence.charAt(j)) {
//                    counter++;
//                    break;
//                }
//            }
//        }
//        if (counter == 26)
//            return true;
//        else
//            return false;
//    }
//}
