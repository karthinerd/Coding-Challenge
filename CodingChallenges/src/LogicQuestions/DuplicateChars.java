package LogicQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateChars {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = input.nextLine();
      char[] arr = str.toCharArray();
      HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
      for(char c : arr) {
         if(charMap.containsKey(c)) {
            charMap.put(c, charMap.get(c) + 1);
         } else {
            charMap.put(c, 1);
         }
      }
      System.out.println("Duplicate characters in the string: ");
      for(Character c : charMap.keySet()) {
         if(charMap.get(c) > 1) {
            System.out.print(c + " ");
         }
      }
   }
}

