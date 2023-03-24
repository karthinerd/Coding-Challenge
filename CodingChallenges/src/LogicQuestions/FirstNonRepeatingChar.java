package LogicQuestions;

import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "leetcode";
        char result = getFirstNonRepeatingChar(str);
        System.out.println("First non-repeating character in the string \"" + str + "\" is: " + result);
    }

    public static char getFirstNonRepeatingChar(String str) {
        // create a hash map to store the frequency of each character in the string
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // iterate over the characters in the string and return the first non-repeating character
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        // return null if no non-repeating character is found
        return '\0';
    }
}
