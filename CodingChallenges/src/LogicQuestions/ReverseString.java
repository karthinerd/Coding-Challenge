package LogicQuestions;

import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = input.nextLine();
      String reverseStr = "";
      for(int i = str.length() - 1; i >= 0; i--) {
         reverseStr = reverseStr + str.charAt(i);
      }
      System.out.println("Reversed string: " + reverseStr);
   }
}
